/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package psptema1;

/**
 *
 * @author FP
 */
public class EjecutarProceso {
    
    /**
     * @param args the command line arguments
     */
    public void ejecutar(String ruta1,String ruta2){
        ProcessBuilder pb1;
        ProcessBuilder pb2;
        try{
            pb1=new ProcessBuilder(ruta1);
            pb1.start();
            pb2=new ProcessBuilder(ruta2);
            pb2.start();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
       String ruta1="C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
       String ruta2="C:\\Program Files\\Microsoft Office\\root\\Office16\\powerpnt.exe";
       EjecutarProceso lp1=new EjecutarProceso();
       lp1.ejecutar(ruta1,ruta2);
       System.out.println("Finalizado");
    }
    
}
