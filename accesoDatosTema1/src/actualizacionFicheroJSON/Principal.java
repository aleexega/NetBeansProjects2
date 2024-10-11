/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actualizacionFicheroJSON;

import lecturaEscrituraJSON.Proyecto;
import lecturaEscrituraJSON.UsuarioAvanzado;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author FP
 */
public class Principal {

    public static void main(String[] args) {
        try {
            String contenido
                    = new String(java.nio.file.Files.readAllBytes(
                            java.nio.file.Paths.get("starwars.json")));
            JSONObject jsonLeido = new JSONObject(contenido);

            //Recuperas datos del personaje
            String nombrePersonaje = jsonLeido.getString("name");
            int altura = jsonLeido.getInt("height");
            JSONArray jsonPeliculas = jsonLeido.getJSONArray("films");
            JSONArray jsonCaracteristicas = jsonLeido.getJSONArray("species");

            //Crear un personaje con los datos leidos
            Personaje personajeLeido = new Personaje(nombrePersonaje, altura);
            //Agregar participantes al proyecto
            for (int i = 0; i < jsonPeliculas.length(); i++) {
                JSONObject jsonPelicula = jsonPeliculas.getJSONObject(i);
                String tituloPelicula = jsonPelicula.getString("title");
                int id_episodioPelicula = jsonPelicula.getInt("episode_id");
                String rastreo_aperturaPelicula = jsonPelicula.getString("opening_crawl");
                String directorPelicula = jsonPelicula.getString("director");

                Peliculas peliculaLeida = new Peliculas(tituloPelicula, id_episodioPelicula, rastreo_aperturaPelicula, directorPelicula);

                //Agrego el ArrayList
                personajeLeido.agregarPeliculas(peliculaLeida);

            }

            for (int i = 0; i < jsonCaracteristicas.length(); i++) {
                JSONObject jsonCaracteristica = jsonCaracteristicas.getJSONObject(i);
                String nombreCaract = jsonCaracteristica.getString("name");
                String especieCaract = jsonCaracteristica.getString("classification");
                String designacionCaract = jsonCaracteristica.getString("designation");
                int altura_mediaCaract = jsonCaracteristica.getInt("average_height");
                String color_pielCaract = jsonCaracteristica.getString("skin_colors");
                String color_peloCaract = jsonCaracteristica.getString("hair_colors");
                int años_vidaCaract = jsonCaracteristica.getInt("average_lifespan");
                String lenguajeCaract = jsonCaracteristica.getString("language");

                Caracteristicas caractLeida = new Caracteristicas(nombreCaract, especieCaract, designacionCaract,
                        altura_mediaCaract, color_pielCaract, color_peloCaract, años_vidaCaract, lenguajeCaract);

                //Agrego el ArrayList
                personajeLeido.agregarCaracteristicas(caractLeida);

            }

            System.out.println("name: " + personajeLeido.getNombre());
            System.out.println("height: "+personajeLeido.getAltura());
            System.out.println("films: ");
            for (Peliculas pelicula : personajeLeido.getPeliculas()) {
                System.out.println("    title: " + pelicula.getTitulo()
                        +"\n    episode_id: "+pelicula.getId_episodio()
                        +"\n    opening_crawl: "+pelicula.getRastreo_apertura()
                        +"\n    director: "+pelicula.getDirector());
                System.out.println("");
            }
            System.out.println("species: ");
            for(Caracteristicas carac:personajeLeido.getCaracteristicas()){
                System.out.println("    name: "+carac.getNombre()
                        +"\n    classification: "+carac.getClasificacion()
                        +"\n    designation: "+carac.getDesignacion()
                        +"\n    average_height: "+carac.getAltura_media()
                        +"\n    skin_colors: "+carac.getColor_piel()
                        +"\n    hair_colors: "+carac.getColor_pelo()
                        +"\n    average_lifespan: "+carac.getAños_vida()
                        +"\n    language: "+carac.getLenguaje());
            }            
                
                
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
