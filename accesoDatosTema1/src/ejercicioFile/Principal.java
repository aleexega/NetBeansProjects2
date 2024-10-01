/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioFile;

import java.io.File;

/**
 *
 * @author FP
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f=new File ("WINDOWS\\fortnite.xml");
        
        System.out.println("Nombre "+f.getName());
        System.out.println("Ruta absoluta "+f.getAbsolutePath());
        System.out.println("Directorio padre "+f.getParent());
        System.out.println("Directorio "+ f.getPath());
        System.out.println("------------------------");
        
        if(f.isDirectory()==false){
            System.out.println("No es un directorio");
        }else{
            System.out.println("Es un directorio");
        }
        
        if(f.isFile()==false){
            System.out.println("el fichero no existe");
        }else{
            System.out.println("el fichero existe");
        }
    }
    
}
