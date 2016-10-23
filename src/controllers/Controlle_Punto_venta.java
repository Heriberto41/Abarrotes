/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import views.Punto_Venta;
/**
 *
 * @author Lenovo
 */
public class Controlle_Punto_venta {
    Punto_Venta punto_Venta;
    
 public Controlle_Punto_venta(Punto_Venta punto_Venta){
     this.punto_Venta = punto_Venta;
     this.punto_Venta.setVisible(true);
     this.punto_Venta.setLocationRelativeTo(null);
 }
}
