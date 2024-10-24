/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPruebaRunnable;

/**
 *
 * @author FP
 */
public class Cine {
    private int boleto;
    
    public Cine(){
        boleto=10;
    }

    public Cine(int boleto) {
        this.boleto = boleto;
    }
    
    public synchronized void Comprar(String comprador){
        if(boleto>0){
            System.out.println("Comprador "+comprador+" compra");
            boleto--;
            System.out.println("Quedan "+boleto+" boletos");
        }
    }
    
}
