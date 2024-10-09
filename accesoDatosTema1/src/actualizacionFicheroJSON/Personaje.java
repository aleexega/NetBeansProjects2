/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actualizacionFicheroJSON;

import java.util.ArrayList;
import lecturaEscrituraJSON.UsuarioAvanzado;

/**
 *
 * @author FP
 */
public class Personaje {

    private String nombre;
    private int altura;
    private ArrayList<Peliculas> peliculas;
    private ArrayList<Caracteristicas> caracteristicas;

    public Personaje(String nombre, int altura) {
        this.nombre = nombre;
        this.altura = altura;
        this.peliculas = new ArrayList<Peliculas>();
        this.caracteristicas = new ArrayList<Caracteristicas>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public ArrayList<Peliculas> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Peliculas> peliculas) {
        this.peliculas = peliculas;
    }

    public ArrayList<Caracteristicas> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(ArrayList<Caracteristicas> Caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public boolean agregarPeliculas(Peliculas e) {
        return peliculas.add(e);
    }

    public boolean agregarCaracteristicas(Caracteristicas e) {
        return caracteristicas.add(e);
    }

}
