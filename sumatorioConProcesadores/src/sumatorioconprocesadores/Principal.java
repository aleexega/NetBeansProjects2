/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumatorioconprocesadores;

import java.util.ArrayList;
import java.util.concurrent.FutureTask;

/**
 *
 * @author FP
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Capturamos parametros
        Long index1 = 1L;
        Long index2 = 10000L;

        try {
            //Particion el rango de valores en tantos rango como procesadores tenemos
            //Calculamos primero la cantidad de procesadores
            Runtime runtime = Runtime.getRuntime();
            int num_procesadores = runtime.availableProcessors();
            System.out.println("Diviendo la tarea " + num_procesadores + " hilos");
            //Obtencion de rangos
            //Debido a que 
            Long incremento = index2/num_procesadores;
            //Creacion del vector de sumas parciales(FutureTask)
            ArrayList<FutureTask<Long>> sumaFuture = new ArrayList<FutureTask<Long>>();
            //Craecion del vector de hilos
            Thread vectorHilos[] = new Thread[num_procesadores];

            for (int i = 0; i < num_procesadores; i++) {
                //Creamos un objeto de tipo suma, que es threadable
                long ini = index1 + incremento * i;
                long fin = index2 + incremento * (i + 1) - 1;
                if (fin > index2) {
                    fin = index2;
                    //Creamos ahora suma, que es Callable
                    Suma sumaParcial = new Suma(ini, fin);
                    //Y el FutureTask que la encapsula para que sea Runnable
                    sumaFuture.add(new FutureTask<Long>(sumaParcial));
                    //Y creamos y lanzamos el hilo a partir de l futureTask y lo lanzamos
                    vectorHilos[i] = new Thread(sumaFuture.get(i));
                    vectorHilos[i].setName("Hilo " + i);
                    vectorHilos[i].start();

                }

            }

            //Esperamos que terminen todos y vamos añadiendo su valor de retorno a un acumulador
            long ac = 0;
            for (int i = 0; i < num_procesadores; i++) {
                vectorHilos[i].join();
                ac = ac + sumaFuture.get(i).get();
            }
            System.out.println("Suma total: " + ac);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
