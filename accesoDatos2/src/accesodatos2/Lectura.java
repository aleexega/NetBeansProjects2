/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author FP
 */
public class Lectura {
    public static void main(String[] args) {
        String miUsuario, miContrasena,elServidor;
        Integer elPuerto;
        Properties confi=new Properties();
        try{
            confi.load(new FileInputStream("config.pass"));
            miUsuario=confi.getProperty("user");
            miContrasena=confi.getProperty("password");
            elServidor=confi.getProperty("server");
            elPuerto=Integer.valueOf(confi.getProperty("port"));
            System.out.println(miUsuario);
            System.out.println(miContrasena);
            System.out.println(elServidor);
            System.out.println(elPuerto);
        }catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
