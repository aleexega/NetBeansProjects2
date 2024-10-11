/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemafilosofos;

import java.util.concurrent.Semaphore;

/**
 *
 * @author FP
 */
public class Philosopher extends Thread{

    private Semaphore leftFork,rightFork;
    private int id;

    public Philosopher(int id, Semaphore leftFork, Semaphore rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.id = id;
    }
    
    public void run(){
        try{
            while(true){
                //Filosofo piensa
                System.out.println("Filosofo "+id+" esta pensando");
                //Filosofo intenta adquirir al tenedor izquierdo
                leftFork.acquire();
                System.out.println("Filosofo "+id+" ha tomado el tenedor izquierdo");
                //Filosofo intenta adquirir el tenedor derecho
                rightFork.acquire();
                System.out.println("Filosofo "+id+" ha tomado el tenedor derecho");
                //Filosofo come
                System.out.println("Filosofo "+id+" esta comiendo");
                //Filosofo suelta el tenedor izquierdo
                leftFork.release();
                System.out.println("Filosofo "+id+" ha soltado el tenedor izquierdo");
                //Filosofo suelta el tenedor derecho
                rightFork.release();
                System.out.println("Filosofo "+id+" ha soltado el tenedor derecho");
                
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
    }
    
}
