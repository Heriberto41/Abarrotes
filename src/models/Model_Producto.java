
package models;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Lenovo
 */
public class Model_Producto {
  
    String title ="Producto";
    String message1 =  "Los datos se han guardado correctamente";
    String message2 =  "Error al guardar";
    String delete = " ";
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
 
    public String getMessage1() {
        return message1;
    }
  
    public void setMessage1(String message1) {
        this.message1 = message1;
    }
    
    public String getMessage2() {
        return message2;
    }
  
    public void setMessage2(String message2) {
        this.message2 = message2;
    }
    
     public String getDelete() {
        return delete;
    }
  
    public void setDelete(String delete) {
        this.delete = delete;
    }

}
