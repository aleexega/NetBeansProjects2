/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaTexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author FP
 */
public class Principal {

    private static void procesarLineaConfiguracion(String linea) {
        String[] partes = linea.split("=");
        if (partes.length == 2) {
            String parte1 = partes[0].trim();
            String parte2 = partes[1].trim();
            switch (parte1) {
                case "anonymous_enable" ->
                    System.out.println("anonymous_enable: " + parte2);
                case "dirmessage_enable" ->
                    System.out.println("dirmessage_enable: " + parte2);
                case "xferlog_enable" ->
                    System.out.println("xferlog_enable: " + parte2);
                case "connect_from_port_20" ->
                    System.out.println("connect_from_port_20: " + parte2);
                case "listen" ->
                    System.out.println("listen: " + parte2);

            }
        } else if(!(partes[0].charAt(0)=='#')){
            System.out.println("Hay un error: " + linea);
        }
    }

    public static void main(String[] args) {
        String archivoConfiguracion = "src//practicaTexto//vsftpd.conf";
        try (BufferedReader lector
                = new BufferedReader(
                        new FileReader(archivoConfiguracion))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                procesarLineaConfiguracion(linea);
            }
        } catch (IOException e) {
            System.err.println("Error..." + e.getMessage());
        }
    }
}
