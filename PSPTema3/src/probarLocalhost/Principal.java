/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probarLocalhost;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        InetAddress dir=null;
        
        try{
            //LOCALHOST
            System.out.println("=================================");
            System.out.println("SALIDA DEL LOCALHOST");
            dir=InetAddress.getByName("localhost");
            pruebaMetodos(dir);
            //URL google.es
            System.out.println("=================================");
            System.out.println("SALIDA PARA UNA URL");
            dir=InetAddress.getByName("google.es");
            pruebaMetodos(dir);
            
        }catch(UnknownHostException e1){
            e1.printStackTrace();
        }
    }
    
    public static void pruebaMetodos(InetAddress dir){
        System.out.println("\tMetodo getLocalHost(): "+dir);
        InetAddress dir2;
        try{
            dir2=InetAddress.getLocalHost();
        System.out.println("\tMetodo getLocalHost(): "+dir2);
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
        //USAMOS METODOS DE LA CLASE
        System.out.println("\tMetodo getHostName: "+dir.getHostName());
        System.out.println("\tMetodo getHostAddress: "+dir.getHostAddress());
        System.out.println("\tMetodo toString: "+dir.toString());
        System.out.println("\tMetodo getCanonicalHostName: "+dir.getCanonicalHostName());
    }
}
