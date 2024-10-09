/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSON;

import org.json.*;

/**
 *
 * @author FP
 */
public class Principal {

    public static void main(String[] args) {
        //Crear usuarios
        UsuarioAvanzado usuario1 = new UsuarioAvanzado("Conor Gallagher ", 21);
        UsuarioAvanzado usuario2 = new UsuarioAvanzado("Correa", 25);

        //Crear proyecto con participantes
        Proyecto proyecto = new Proyecto("Copa del mundo 2022");
        proyecto.agregarParticipante(usuario1);
        proyecto.agregarParticipante(usuario2);

        //Convertir el proyecti a un JSONObject
        JSONObject jsonProyecto = new JSONObject();
        jsonProyecto.put("nombre", proyecto.getNombre());
        JSONArray jsonParticipantes = new JSONArray();
        for (UsuarioAvanzado participante : proyecto.getParticipante()) {
            JSONObject jsonParticipante = new JSONObject();
            jsonParticipante.put("nombre", participante.getNombre());
            jsonParticipante.put("edad", participante.getEdad());
            jsonParticipantes.put(jsonParticipante);
        }
        jsonProyecto.put("participantes", jsonParticipantes);

        try {
            java.nio.file.Files.write(
                    java.nio.file.Paths.get("proyecto.json"),
                    jsonProyecto.toString().getBytes()
            );
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
