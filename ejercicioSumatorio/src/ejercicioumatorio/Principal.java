/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioumatorio;

/**
 *
 * @author FP
 */
public class Principal {

    public static double sumatorio(double numero) {
        double acumulador = 0.0;
        for (int i = 1; i <= numero; i++) {
            acumulador += 1;
        }
        return acumulador;
    }
    public static void main(String[] args) {
        double formula;
        formula = (sumatorio(5) + sumatorio(8) + sumatorio(20)) / (3 * sumatorio(5));
        System.out.println("Formula= " + formula);
    }
}
