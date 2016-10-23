/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.*;
import controllers.*;
/**
 *
 * @author Lenovo
 */
public class Controller_Menu implements ActionListener{
Menu menu = new Menu();
  View_Producto view_Producto = new View_Producto();
  View_Proveedor view_Proveedor = new View_Proveedor();
  Punto_Venta punto_Venta = new Punto_Venta();
  
    public Controller_Menu(Menu menu) {
      this.menu = menu;
      this.menu.setVisible(true);
      this.menu.setLocationRelativeTo(null);
      this.menu.jbtn_productos.addActionListener(this);
      this.menu.jbtn_proveedores.addActionListener(this);
      this.menu.jbtn_punto_venta.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== menu.jbtn_productos){
            Controller_Producto controller_Producto =  new Controller_Producto(view_Producto);
        }
        else if (e.getSource() ==  menu.jbtn_proveedores){
            Controller_Proveedores controller_Proveedores = new Controller_Proveedores(view_Proveedor);
        }
        
        else if(e.getSource() == menu.jbtn_punto_venta ){
            Controlle_Punto_venta  controlle_Punto_venta = new Controlle_Punto_venta(punto_Venta);
        }
    }
    
}
