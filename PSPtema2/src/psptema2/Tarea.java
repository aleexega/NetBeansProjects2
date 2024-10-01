/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package psptema2;

/**
 *
 * @author FP
 */
public class Tarea extends Thread{

    
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Soy el hilo "+i+" y hago esto");
        }
    }
    
}
