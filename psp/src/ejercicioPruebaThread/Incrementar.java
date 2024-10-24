/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPruebaThread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FP
 */
public class Incrementar extends Thread {

    private String nom;
    private Contador cont;

    public Incrementar(String nom, Contador cont) {
        this.setName(nom);
        this.cont = cont;
    }

    @Override
    public void run() {
        cont.incrementar();

    }

}
