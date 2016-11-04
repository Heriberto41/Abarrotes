/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import libs.Conectar;
import views.Punto_Venta;
import views.Productos_Encotrados;
/**
 *
 * @author Lenovo
 */
public class Controlle_Punto_venta implements ActionListener{
    Punto_Venta punto_Venta;
    Productos_Encotrados productos_Encotrados;
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();
    
 public Controlle_Punto_venta(Punto_Venta punto_Venta, Productos_Encotrados productos_Encotrados){
     this.punto_Venta = punto_Venta;
     this.productos_Encotrados =  productos_Encotrados;
     this.punto_Venta.setVisible(true);
     this.punto_Venta.setLocationRelativeTo(null);
     this.punto_Venta.jbtn_agregar.addActionListener(this);
 }
 
 void busca_cliente(String value){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("PRODUCTO");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("PRECIO VENTA");
        modelo.addColumn("EXISTENCIA");
        this.productos_Encotrados.jtbl_productos_encotrados.setModel(modelo);
        String sql = "";
        if (value.equals("")) {
            sql = "SELECT * FROM Productos";
        } else {
            sql = "SELECT * FROM Productos WHERE Producto='" + value+ "'";
        }

        String[] datos = new String[5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            this.productos_Encotrados.jtbl_productos_encotrados.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == punto_Venta.jbtn_agregar){
           this.productos_Encotrados.setVisible(true);
           this.productos_Encotrados.setLocationRelativeTo(punto_Venta);
           busca_cliente(punto_Venta.jtxt_producto.getText());
       }
    }
}
