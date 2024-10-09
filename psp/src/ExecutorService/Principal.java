package ExecutorService;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author FP
 */
public class Principal {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //Declaro e instancio el ExecutorServicce
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        //Preparo una colección de objetos Callables que haran cada uno una cosa
        Set<Callable<String>> callables = new HashSet<Callable<String>>();
        //Añado los objetos a la cola
        //Cada uno con su operación
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Tarea 1";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Tarea 2";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Tarea 3";
            }
        });
        //Declaro la lista de objetos Future y utilizo el método de llamar a todos
        java.util.List<Future<String>> futures = executorService.invokeAll(callables);
        //Recojo las soluciones de cada uno de os objetos del Future
        for (Future<String> future : futures) {
            System.out.println("future.get = " + future.get());
        }
        //hay que terminar el proceso siempre
        executorService.shutdown();
    }

}
