/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1.pkg1.sumadorimpares;

/**
 *
 * @author FP
 */
public class Sumatorio extends Thread {

    private double num;
    private double resultado;

    public Sumatorio(int numero) {
        this.num = numero;
    }

    public double sumaImpar() {
        if (num % 2 == 0) {
            num = num - 1;
        }
        double total = 0;
        for (int i = (int) num; i >= 1; i = i - 2) {
            total += i;
        }
        return total;
    }

    @Override
    public void run() {
        resultado = sumaImpar();
    }

    public double getResultado() {
        return resultado;
    }

}
