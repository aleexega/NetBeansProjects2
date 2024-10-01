/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sincronización;

/**
 *
 * @author FP
 */
public class SaleJardin extends Thread{
    private RecursoJardin jardin;

    public SaleJardin(String nombre,RecursoJardin jardin) {
        this.setName(nombre);
        this.jardin = jardin;
    }
    
    @Override
    public void run(){
        jardin.decrementaCuenta();
    }
}
