/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPruebaThread;

/**
 *
 * @author FP
 */
public class Principal {

    public static void main(String[] args) {
        Contador contador = new Contador();
        for (int i = 0; i < 5; i++) {
            (new Incrementar("Hilo Incrementador " + i, contador)).start();
        }

        for (int i = 0; i < 5; i++) {
            (new Decrementar("Hilo Decrementador " + i, contador)).start();
        }

    }
}
