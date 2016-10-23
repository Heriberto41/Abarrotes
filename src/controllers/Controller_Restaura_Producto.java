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
import libs.Conectar;
import views.Productos_Restaura;

/**
 *
 * @author Lenovo
 */
public class Controller_Restaura_Producto extends javax.swing.JFrame implements ActionListener{
    Productos_Restaura restaura;
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();
    
    public  Controller_Restaura_Producto (Productos_Restaura restaura){
        this.restaura = restaura;
        this.restaura.setVisible(true);
        this.restaura.setLocationRelativeTo(null);
        this.restaura.setTitle("Papelera de reciclaje");
     
        this.restaura.jbtn_buscar_id.addActionListener(this);
        this.restaura.jbtn_buscar_producto.addActionListener(this);
        this.restaura.jbtn_todo.addActionListener(this);
        this.restaura.jMenueliminar.addActionListener(this);
        this.restaura.jMenurestaurar.addActionListener(this);
    }
    
  void Buscarid(String valor){
   DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("PRODUCTO");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("PRECIO COMPRA");
        modelo.addColumn("PRECIO VENTA");
        modelo.addColumn("EXISTENCIA");
        this.restaura.jtbl_Restaura_productos.setModel(modelo);
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT * FROM Productos_delet";
        } else {
            sql = "SELECT * FROM Productos_delet WHERE Id_Producto='" + valor + "'";
        }

        String[] datos = new String[6];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                modelo.addRow(datos);
            }
            this.restaura.jtbl_Restaura_productos.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Producto.class.getName()).log(Level.SEVERE, null, ex);
        }  
  }

void Buscarproducto(String valor){
   DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("PRODUCTO");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("PRECIO COMPRA");
        modelo.addColumn("PRECIO VENTA");
        modelo.addColumn("EXISTENCIA");
        this.restaura.jtbl_Restaura_productos.setModel(modelo);
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT * FROM Productos_delet";
        } else {
            sql = "SELECT * FROM Productos_delet WHERE Producto='" + valor + "'";
        }

        
        String[] datos = new String[6];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
        
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                modelo.addRow(datos);
            }
            this.restaura.jtbl_Restaura_productos.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Controller_Producto.class.getName()).log(Level.SEVERE, null, ex);
       }  
 }

void restaurar(){
    int fila1 = restaura.jtbl_Restaura_productos.getSelectedRow();
    String Producto = "";
    
    int fila2 = restaura.jtbl_Restaura_productos.getSelectedRow();
    String Descripcion = "";
    
    int fila3 = restaura.jtbl_Restaura_productos.getSelectedRow();
    String Precio_compra = "";
    
    int fila4 = restaura.jtbl_Restaura_productos.getSelectedRow();
    String Precio_venta = "";
    
    int fila5 = restaura.jtbl_Restaura_productos.getSelectedRow();
    String Existencia= "";
    
    
    
    try {
      
      PreparedStatement pst = cn.prepareStatement("INSERT INTO productos(Producto,Descripcion,Precio_compra,Precio_venta,Existencia) VALUES (?,?,?,?,?)");
           
            pst.setString(1,Producto = restaura.jtbl_Restaura_productos.getValueAt(fila1, 1).toString());
            pst.setString(2, Descripcion= restaura.jtbl_Restaura_productos.getValueAt(fila2, 2).toString());
            pst.setString(3,Precio_compra = restaura.jtbl_Restaura_productos.getValueAt(fila3, 3).toString());
            pst.setString(4,Precio_venta = restaura.jtbl_Restaura_productos.getValueAt(fila4, 4).toString());
            pst.setString(5,Existencia = restaura.jtbl_Restaura_productos.getValueAt(fila5, 5).toString());
            pst.executeUpdate(); 
    
    } catch (Exception e) {
        JOptionPane.showMessageDialog(restaura, "No es posible restaurar este dato");
    }
    
}

void elimina(){
   int fila = restaura.jtbl_Restaura_productos.getSelectedRow();
    String id = "";
    id = restaura.jtbl_Restaura_productos.getValueAt(fila, 0).toString();
    int p =JOptionPane.showConfirmDialog(null,"Estas seguro de restaurar este dato","Restaurar",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
    if (p ==0){
    try {
      PreparedStatement pst = cn.prepareStatement("DELETE FROM Productos_delet WHERE  Id_Producto='" + id + "'");
      pst.executeUpdate();
        
      Buscarid("");
    
    } catch (Exception e) {
        JOptionPane.showMessageDialog(restaura, "No es posible restaurar este dato");
    }
    }  
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.restaura.jbtn_buscar_id){
            Buscarid(restaura.jtxt_busca_id.getText());
        }
        else if (e.getSource() == this.restaura.jbtn_buscar_producto){
            Buscarproducto(restaura.jtxt_busca_producto.getText());
        }
        else if (e.getSource() ==  this.restaura.jbtn_todo){
            Buscarid("");
        }
        else if (e.getSource() ==  this.restaura.jMenueliminar){
            elimina();
        }
        else if (e.getSource()== this.restaura.jMenurestaurar){
          restaurar();
          elimina();
        }
    }
    
}
