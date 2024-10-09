 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloProductorConsumidorRunneable;

/**
 *
 * @author FP
 */
public class ObjetoCompartido {

    int valor;
    boolean disponlibe = false; //Inicialmente no tenemos valor

    public synchronized int get() {
        //MIentras no tengamos datos disponilbes esperamos
        while (disponlibe == false) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        //Cuando se despierte, volvemos a establcer la disponibilidad a falso, notifcamos a todos los
        //Productores de la disponibilidad y devolvemos el valor.

        this.disponlibe = true;
        notifyAll();
        return this.valor;
    }

    public synchronized void set(int val) {
        
        while (disponlibe == true) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        this.valor = val;
        this.disponlibe = true;
        notifyAll();
    }

}
