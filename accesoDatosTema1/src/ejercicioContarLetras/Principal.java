/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioContarLetras;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author FP
 */
public class Principal {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("C:\\Users\\FP\\Documents\\NetBeansProjects\\accesoDatosTema1\\src\\fichero.txt");
        BufferedReader texto = new BufferedReader(new FileReader(f));
        String parrafo;
        int contLineas = 0;
        int numCaracteres;
        int total = 0;
        int cont = 0;
        int numLetras = 0;
        String letras;
        int totL = 0;
        int contP = 0;
        String palabras;
        while ((parrafo = texto.readLine()) != null) {
            contLineas++;
            numCaracteres = parrafo.length();
            total = numCaracteres + total;
            letras = parrafo.replace(" ", "");
            numLetras = letras.length();
            totL = totL + numLetras;
            System.out.println(totL);
            for (int i = 0; i < parrafo.length(); i++) {
                if (parrafo.charAt(i) ==' ') {
                    contP++;
                }
            }
        }
        
        System.out.println("Num parrafos: " + contLineas);
        System.out.println("Caracteres sin espacios: " + total);
        System.out.println("Caracteres sin espacios: " + totL);
        contP=contP+contLineas;
        System.out.println("Num de palabras: "+contP);

    }
}
