/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSON;

import java.util.ArrayList;

/**
 *
 * @author FP
 */
public class Proyecto {
    private String nombre;
    private ArrayList<UsuarioAvanzado> participante;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.participante = new ArrayList<UsuarioAvanzado>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<UsuarioAvanzado> getParticipante() {
        return participante;
    }

    public void setParticipante(ArrayList<UsuarioAvanzado> participantes) {
        this.participante = participantes;
    }
    
    public boolean agregarParticipante(UsuarioAvanzado e){
        return participante.add(e);
    }
    
}
