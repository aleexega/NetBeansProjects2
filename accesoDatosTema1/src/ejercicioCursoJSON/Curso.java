/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioCursoJSON;

import lecturaEscrituraJSON.UsuarioAvanzado;
import java.util.ArrayList;

/**
 *
 * @author FP
 */
public class Curso {
    private String nombre;
    private ArrayList<Modulo> mod;
    
    public Curso(String nombre) {
        this.nombre = nombre;
        this.mod = new ArrayList<Modulo>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Modulo> getMod() {
        return mod;
    }

    public void setMod(ArrayList<Modulo> mod) {
        this.mod = mod;
    }

    public boolean agregarModulo(Modulo e){
        return mod.add(e);
    }
}
