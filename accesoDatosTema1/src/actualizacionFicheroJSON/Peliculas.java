/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actualizacionFicheroJSON;

/**
 *
 * @author FP
 */
public class Peliculas {

    private String titulo;
    private int id_episodio;
    private String rastreo_apertura;
    private String director;

    public Peliculas(String titulo, int id_episodio, String rastreo_apertura, String director) {
        this.titulo = titulo;
        this.id_episodio = id_episodio;
        this.rastreo_apertura = rastreo_apertura;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId_episodio() {
        return id_episodio;
    }

    public void setId_episodio(int id_episodio) {
        this.id_episodio = id_episodio;
    }

    public String getRastreo_apertura() {
        return rastreo_apertura;
    }

    public void setRastreo_apertura(String rastreo_apertura) {
        this.rastreo_apertura = rastreo_apertura;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
}
