/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package URLConnection2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author FP
 */
public class Principal {

    public static void main(String[] args) throws MalformedURLException, IOException {
        String cadena;
        URL url = new URL("https://www.marca.com/robots.txt");
        URLConnection conexion = url.openConnection();

        System.out.println("Direccion URL[getURL()]: " + conexion.getURL());
        Date fecha = new Date(conexion.getLastModified());
        System.out.println("Fecha ultima modificacion [getLastModified()]: " + fecha);
        System.out.println("Tipo de contenido [getContentType()]: " + conexion.getContentType());
        System.out.println("=========================================");

        System.out.println("CAMPOS 1 Y 4 DE CABECERA");
        System.out.println("Cabecera 1[getHeaderField(0)]: " + conexion.getHeaderField(0));
        System.out.println("Cabecera 4[getHeaderField(3)]:" + conexion.getHeaderField(3));
        System.out.println("=========================================");

        System.out.println("TODOS LOS CAMPOS DE LA CABECERA CON getHeaderFields():");
        //USamos la estructura para recuperar la cabecera
        Map camposcabecera = conexion.getHeaderFields();
        Iterator it = camposcabecera.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry map = (Map.Entry) it.next();
            System.out.println(map.getKey() + " : " + map.getValue());
        }
        System.out.println("=========================================");

        System.out.println("Codigo de respuesta: " + conexion.getHeaderField(0));
        System.out.println("Software del servidor: " + conexion.getHeaderField("Server"));        
        System.out.println("=========================================");
        
        System.out.println("CONTENIDO DE (url.getFile()): "+url.getFile());
        BufferedReader pagina=new BufferedReader(new InputStreamReader(url.openStream()));
        while((cadena=pagina.readLine())!=null){
            System.out.println(cadena);
        }
    }
}
