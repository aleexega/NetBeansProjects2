/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filereaderwriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author FP
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner teclado = new Scanner(System.in);
        File f = new File("C:\\Users\\FP\\Documents\\NetBeansProjects\\fileReaderWriter\\plantilla.txt");
        FileWriter carta = new FileWriter("C:\\Users\\FP\\Desktop\\carta.txt");
        BufferedReader t = new BufferedReader(new FileReader(f));
        String nombre = "";
        System.out.println("Como se llama el empleado");
        nombre = teclado.next();
        String ape1 = "";
        System.out.println("Cual es su 1er apellido");
        ape1 = teclado.next();
        String ape2 = "";
        System.out.println("Cual es su 2do apellido");
        ape2 = teclado.next();
        String apellidos = ape1 + " " + ape2;
        String jefe = "";
        System.out.println("Nombre del jefe");
        jefe = teclado.next();
        String dep = "";
        System.out.println("Cual es su departamento");
        dep = teclado.next();
        String texto;
        String texto2 = "";
        while ((texto = t.readLine()) != null) {
            texto = texto.replace("$nombre", nombre);
            texto = texto.replace("$apellidos", apellidos);
            texto = texto.replace("$apellido", ape1);
            texto = texto.replace("$jefe", jefe);
            texto = texto.replace("$departamento", dep);
            
            carta.write(texto + "\n");            
        }
        System.out.println("Carta realizada");
        t.close();
        carta.close();
    }

}
