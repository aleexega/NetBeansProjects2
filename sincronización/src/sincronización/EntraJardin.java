/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sincronización;

/**
 *
 * @author FP
 */
public class EntraJardin extends Thread{

    //clase derivada de Thread que define un hilo
    
    private RecursoJardin jardin;

    public EntraJardin(String nombre,RecursoJardin jardin) {
        this.setName(nombre);
        this.jardin = jardin;
    }
    
    @Override
    public void run(){
        jardin.incrementaCuenta();
    }
    //invoca al metodo que incrementa la cuenta de acceso al jardin
}
