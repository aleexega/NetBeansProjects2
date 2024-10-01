/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaInstalado;

import java.io.File;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        /*Cmo saber sitengo instalado java*/
        File f=new File("C:\\Program Files\\Java\\jdk-21\\bin\\java.exe");
        
        if(f.exists()==false){
            System.out.println("No esta instalado");
        }else{
            System.out.println("Esta instalado");
            
        }
    }
}
