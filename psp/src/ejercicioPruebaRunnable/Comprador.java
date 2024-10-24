/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPruebaRunnable;

/**
 *
 * @author FP
 */
public class Comprador implements Runnable {

    private String nom;
    private Cine cine;

    public Comprador(String nom, Cine cine) {
        this.nom = nom;
        this.cine = cine;
    }
    
    

    @Override
    public void run() {
        
    }

}
