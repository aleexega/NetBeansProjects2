/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPruebaThread;

/**
 *
 * @author FP
 */
public class Contador {

    private int cont;

    public Contador() {
        cont = 20;
    }

    public synchronized void incrementar() {
        int numRandom = (int) (Math.random() * 5)+1;
        System.out.println(Thread.currentThread().getName() + " va a sumar " + numRandom);
        cont = cont + numRandom;
        System.out.println("El contador despues de ser incrementado va " + cont);

    }

    public synchronized void decrementar() {
        int numRandom = (int) (Math.random() * 5)+1;
        System.out.println(Thread.currentThread().getName() + " va a restar " + numRandom);
        cont = cont - numRandom;
        System.out.println("El contador despues de ser decrementado va " + cont);
    }
}
