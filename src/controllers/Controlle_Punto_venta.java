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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.StyleConstants;
import libs.Conectar;
import views.Punto_Venta;
import views.Productos_Encotrados;
import models.Model_PV;
import views.Clientes_encontrados;
/**
 *
 * @author Lenovo
 */
public class Controlle_Punto_venta implements ActionListener{
    Punto_Venta punto_Venta;
    Productos_Encotrados productos_Encotrados;
    Model_PV model_PV;
    Clientes_encontrados  ce;
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();
    
 public Controlle_Punto_venta(Punto_Venta punto_Venta, Productos_Encotrados productos_Encotrados, Model_PV model_PV, Clientes_encontrados ce){
     this.punto_Venta = punto_Venta;
     this.model_PV =  model_PV;
     this.ce = ce;
     this.punto_Venta.jtxt_id.setVisible(false);
     this.productos_Encotrados =  productos_Encotrados;
     this.punto_Venta.setVisible(true);
     this.punto_Venta.jtxt_iva.setText(""+model_PV.getIvapro());
     this.punto_Venta.setLocationRelativeTo(null);
     this.punto_Venta.jbtn_agregar.addActionListener(this);
     this.productos_Encotrados.jm_agregar.addActionListener(this);
     this.ce.jbtn_buscar.addActionListener(this);
     this.punto_Venta.jbtn_cliente.addActionListener(this);
     this.ce.jbtn_buscar.addActionListener(this);
     this.ce.jm_agregarcliente.addActionListener(this);
 }
 
 void busca_producto(String value){
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
 
 void busca_cliente(String cliente){
     DefaultTableModel model = (DefaultTableModel) ce.jtbl_cliente.getModel();
     String sql ="";
     if (sql.equals("")){
         sql= "Select * From Cliente";
     }else {
         sql="Select * from cliente where Nombre='"+cliente+"'";
     }
     
     String [] dato = new String [7];
    try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
                dato[2] = rs.getString(3);
                dato[3] = rs.getString(4);
                dato[4] = rs.getString(5);
                dato[5] = rs.getString(6);
                dato[6] = rs.getString(7);
                model.addRow(dato);
            }
            this.ce.jtbl_cliente.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
 }

   void agregar(){
        DefaultTableModel modelo = (DefaultTableModel) punto_Venta.jtbl_venta.getModel();
        
        String registro [] =  new String[6];
        int fila=  productos_Encotrados.jtbl_productos_encotrados.getSelectedRow();
        registro [0]= productos_Encotrados.jtbl_productos_encotrados.getValueAt(fila, 0).toString();
        registro [1]= productos_Encotrados.jtbl_productos_encotrados.getValueAt(fila, 1).toString();
        registro [2]= productos_Encotrados.jtbl_productos_encotrados.getValueAt(fila, 2).toString();
        registro [3]= productos_Encotrados.jtbl_productos_encotrados.getValueAt(fila, 3).toString();
        String pre = productos_Encotrados.jtbl_productos_encotrados.getValueAt(fila, 3).toString();
        String can = JOptionPane.showInputDialog(punto_Venta, "Cantidad");
        int cantidad =  Integer.valueOf(can);
        int precio = Integer.valueOf(pre);
        int importe= cantidad * precio;
        String importes = String.valueOf(importe);
        registro [4]= (can);
        registro [5]= (importes);
        importe = importe + importe;
        
        punto_Venta.jtxt_subtotal.setText(""+importe);
        modelo.addRow(registro);
        String sub = punto_Venta.jtxt_subtotal.getText();
        int subtal = Integer.valueOf(sub);
        punto_Venta.jtxt_total.setText(""+ ((subtal* model_PV.getIva())+ subtal));
        
}
  
void agregar_cliente(){
    DefaultTableModel modelo = new DefaultTableModel();
    String registro [] =  new String[4];
    int fila=  ce.jtbl_cliente.getSelectedRow();
    registro [0]= ce.jtbl_cliente.getValueAt(fila, 0).toString();
    registro [1]= ce.jtbl_cliente.getValueAt(fila, 1).toString();
    registro [2]= ce.jtbl_cliente.getValueAt(fila, 2).toString();
    registro [3]= ce.jtbl_cliente.getValueAt(fila, 3).toString();
    punto_Venta.jtxt_id.setText(registro [0]);
    punto_Venta.jtx_cliente.setText(registro [1]+"  "+ registro [2]+ " " + registro [3]);
    
}

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == punto_Venta.jbtn_agregar){
           this.productos_Encotrados.setVisible(true);
           this.productos_Encotrados.setLocationRelativeTo(punto_Venta);
           busca_producto(punto_Venta.jtxt_producto.getText());
       }
       else if(e.getSource() == productos_Encotrados.jm_agregar){
          
          agregar();
       }
       else if (e.getSource()== punto_Venta.jbtn_cliente){
           ce.setVisible(true);
           ce.setLocationRelativeTo(punto_Venta);
           busca_cliente(punto_Venta.jtx_cliente.getText());
       }
       
       else if (e.getSource()== ce.jbtn_buscar){
           busca_cliente(ce.jtxt_nombre.getText());
       }
       else if (e.getSource()== ce.jm_agregarcliente){
           agregar_cliente();
       }
    }
}
