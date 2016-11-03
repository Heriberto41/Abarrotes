/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import views.View_Login;
import controllers.Controller_Login;
import models.Model_Login;
/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     View_Login login = new  View_Login();
     Model_Login ml = new Model_Login();
      Controller_Login controller_Login =  new Controller_Login(login,ml);
    }
    
}
