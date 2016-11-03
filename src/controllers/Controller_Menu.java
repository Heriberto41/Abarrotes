
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import javax.swing.Icon;
import views.*;
import controllers.*;
import javax.swing.ImageIcon;

/**
 *
 * @author Lenovo
 */
public class Controller_Menu implements ActionListener {

    Menu menu = new Menu();
    View_Producto view_Producto = new View_Producto();
    View_Proveedor view_Proveedor = new View_Proveedor();
    Punto_Venta punto_Venta = new Punto_Venta();
    Productos_Restaura productos_Restaura = new Productos_Restaura();
    View_Clientes view_Clientes = new View_Clientes();
    Image icon = new ImageIcon(getClass().getResource("/imges/logo.png")).getImage();

    public Controller_Menu(Menu menu) {
        this.menu = menu;
        this.menu.setVisible(true);
        this.menu.setLocationRelativeTo(null);
        this.menu.setIconImage(icon);

        this.menu.jbtn_productos.addActionListener(this);
        this.menu.jbtn_proveedores.addActionListener(this);
        this.menu.jbtn_punto_venta.addActionListener(this);
        this.menu.jbtn_restarar.addActionListener(this);
        this.menu.jbtn_clientes.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menu.jbtn_productos) {
            Controller_Producto controller_Producto = new Controller_Producto(view_Producto);
        } else if (e.getSource() == menu.jbtn_proveedores) {
            Controller_Proveedores controller_Proveedores = new Controller_Proveedores(view_Proveedor);
        } else if (e.getSource() == menu.jbtn_punto_venta) {
            Controlle_Punto_venta controlle_Punto_venta = new Controlle_Punto_venta(punto_Venta);
        } else if (e.getSource() == menu.jbtn_restarar) {
            Controller_Restaura_Producto crp = new Controller_Restaura_Producto(productos_Restaura);
        } else if (e.getSource() == menu.jbtn_clientes) {
            Controller_Clientes cc = new Controller_Clientes(view_Clientes);
        }
    }


}
