/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecturaEscrituraJSON;

import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author FP
 */
public class leerJSON {

    public static void main(String[] args) throws IOException {
        //Leer desde un archivo JSON
        try {
            String contenido
                    = new String(java.nio.file.Files.readAllBytes(
                            java.nio.file.Paths.get("proyecto.json")));
            JSONObject jsonLeido = new JSONObject(contenido);

            //Recuperas datos del proyecti
            String nombreProyecto = jsonLeido.getString("nombre");
            JSONArray jsonParticipantesLeidos = jsonLeido.getJSONArray("participantes");

            //Crear un proyecti con los datos leidos
            Proyecto proyectoLeido = new Proyecto(nombreProyecto);

            //Agregar participantes al proyecto
            for (int i = 0; i < jsonParticipantesLeidos.length(); i++) {
                JSONObject jsonParticipante = jsonParticipantesLeidos.getJSONObject(i);
                String nombreParticipante = jsonParticipante.getString("nombre");
                int edadParticipante = jsonParticipante.getInt("edad");

                UsuarioAvanzado participanteLeido = new UsuarioAvanzado(nombreParticipante, edadParticipante);

                //Agrego el ArrayList
                proyectoLeido.agregarParticipante(participanteLeido);

            }
            System.out.println("Proyecto " + proyectoLeido.getNombre());
            System.out.println("Participantes: ");
            for (UsuarioAvanzado participante : proyectoLeido.getParticipante()) {
                System.out.println("- " + participante.getNombre() + ", Edad :" + participante.getEdad());
            }

        } catch (Exception e) {

        }
    }
}
