/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioCursoJSON;

import lecturaEscrituraJSON.UsuarioAvanzado;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author FP
 */
public class Principal {

    public static void main(String[] args) {
        Modulo modulo1 = new Modulo(1, "Acceso a datos", 6, 8.45);
        Modulo modulo2 = new Modulo(2, "Programacion de servicios y procesos", 3, 9.0);
        
        Curso curso = new Curso("DAM");
        curso.agregarModulo(modulo1);
        curso.agregarModulo(modulo2);

        JSONObject jsonCurso = new JSONObject();
        jsonCurso.put("nombre", curso.getNombre());
        JSONArray jsonModulos = new JSONArray();
        for (Modulo mod : curso.getMod()) {
            JSONObject jsonModulo = new JSONObject();
            jsonModulo.put("id", mod.getId());
            jsonModulo.put("nombre", mod.getNombre());
            jsonModulo.put("horas", mod.getHoras());
            jsonModulo.put("nota", mod.getNota());
            jsonModulos.put(jsonModulo);
        }
        jsonCurso.put("modulos", jsonModulos);

        try {
            java.nio.file.Files.write(
                    java.nio.file.Paths.get("curso.json"),
                    jsonCurso.toString().getBytes()
            );
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

    }
}
