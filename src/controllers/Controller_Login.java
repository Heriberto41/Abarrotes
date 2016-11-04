
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.exit;
import javax.swing.JOptionPane;
import views.*;
import models.*;


/**
 *
 * @author Lenovo
 */
public class Controller_Login implements ActionListener {
 View_Login login;
 Model_Login ml;
 Menu menu = new Menu();
 

 public Controller_Login (View_Login login, Model_Login ml){
  this.login = login;
  this.ml = ml;
  this.login.setVisible(true);
  this.login.setLocationRelativeTo(null);
  this.login.setTitle("Login");
  this.login.jbtn_aceptar.addActionListener(this);
  this.login.jbtn_cancelar.addActionListener(this); 
 }
 
 void bloquea(){
   menu.jbtn_productos.setEnabled(false);
 }
 
 void ingreso(String usuario,String password){
   String sql= "";
   
   if(usuario.equals("") ||  password.equals("")){
       JOptionPane.showMessageDialog(null,ml.getNo_Existe());
   }
   else if(usuario.equals("Admin") && password.equals("123456789")){
       Controller_Menu m  = new Controller_Menu(menu);
       login.setVisible(false);
       
   }
   
 }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login.jbtn_aceptar){
            char [] password = login.jpasswoor.getPassword();
            String pass = new String(password);
            ingreso(this.login.txt_usuario.getText(),pass);
                
        }
        else if (e.getSource()== login.jbtn_cancelar){
            exit(0);
        }
    }
}
