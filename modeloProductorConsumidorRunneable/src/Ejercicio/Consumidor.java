/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

/**
 *
 * @author FP
 */
public class Consumidor implements Runnable{
    //Referencia a un objeto compartido
    private ObjetoCompartido compartido;

    Consumidor(ObjetoCompartido compartido) {
        this.compartido = compartido;
    }

    @Override
    public void run() {
        for (int y = 0; y < 5; y++) {
            System.out.println("El comsumidor consume: " + this.compartido.get());
            
            try {
                Thread.currentThread().sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}