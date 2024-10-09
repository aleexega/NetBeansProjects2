/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actualizacionFicheroJSON;

/**
 *
 * @author FP
 */
public class Caracteristicas {
    private String nombre;
    private String especie;
    private String designacion;
    private int altura_media;
    private String color_piel;
    private String color_pelo;
    private int años_vida;
    private String lenguaje;

    public Caracteristicas(String nombre, String clasificacion, String designacion, int altura_media, String color_piel, String color_pelo, int años_vida, String lenguaje) {
        this.nombre = nombre;
        this.especie = clasificacion;
        this.designacion = designacion;
        this.altura_media = altura_media;
        this.color_piel = color_piel;
        this.color_pelo = color_pelo;
        this.años_vida = años_vida;
        this.lenguaje = lenguaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return especie;
    }

    public void setClasificacion(String clasificacion) {
        this.especie = clasificacion;
    }

    public String getDesignacion() {
        return designacion;
    }

    public void setDesignacion(String designacion) {
        this.designacion = designacion;
    }

    public int getAltura_media() {
        return altura_media;
    }

    public void setAltura_media(int altura_media) {
        this.altura_media = altura_media;
    }

    public String getColor_piel() {
        return color_piel;
    }

    public void setColor_piel(String color_piel) {
        this.color_piel = color_piel;
    }

    public String getColor_pelo() {
        return color_pelo;
    }

    public void setColor_pelo(String color_pelo) {
        this.color_pelo = color_pelo;
    }

    public int getAños_vida() {
        return años_vida;
    }

    public void setAños_vida(int años_vida) {
        this.años_vida = años_vida;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    
}
