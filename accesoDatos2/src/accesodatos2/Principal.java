/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accesodatos2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author FP
 */
public class Principal {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Declaracion de variables
        String miUsuario="root";
        String miContrasena="p@sswOrd";
        String elServidor="goldengate.tk";
        String elPuerto="3306";
        
        Properties confi=new Properties();
        confi.setProperty("user", miUsuario);
        confi.setProperty("password", miContrasena);
        confi.setProperty("server", elServidor);
        confi.setProperty("port", elPuerto);
        try{
            confi.store(new FileOutputStream("config.pass"),"Fichero de configuracion");
        }catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
            
        
    }
    
}
