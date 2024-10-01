/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sincronización;

/**
 *
 * @author FP
 */
public class RecursoJardin {
    private int cuenta;
    
    public RecursoJardin(){
        cuenta=100;
    }
    
    public synchronized void incrementaCuenta(){
        //metodo que incrementa en 1 la vartiable cuenta
        System.out.println("hilo "+Thread.currentThread().getName()+" ---- Entra en Jardin");
        //muestra el hilo que entra en el ,metodo
        cuenta++;
        System.out.println(cuenta+" en jardin");
        //Cuenta cada acceso al jardin y muestra el numero de accesos
    }
    
    public synchronized void decrementaCuenta(){
        //metodo que decrementa en 1 la vartiable cuenta
        System.out.println("hilo "+Thread.currentThread().getName()+" ---- Sale en Jardin");
        //muestra el hilo que entra en el ,metodo
        cuenta--;
        System.out.println(cuenta+" en jardin");
        //Cuenta cada acceso al jardin y muestra el numero de accesos
    }
}
