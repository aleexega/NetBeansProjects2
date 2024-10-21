/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaJSON;

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
                            java.nio.file.Paths.get("src//practicaJSON//examen_1.json")));
            JSONObject jsonLeido
                    = new JSONObject(contenido);

            // Recuperar datos del proyecto
            String nomHeroe
                    = jsonLeido.getString("hero");
            String nomGrupo = jsonLeido.getString("team");
            JSONArray jsonHeroes
                    = jsonLeido.getJSONArray("heroes");
            JSONArray jsonGrupos
                    = jsonLeido.getJSONArray("grupos");
            Conjunto conjunto = new Conjunto(nomHeroe,nomGrupo);

            for (int i = 0; i < jsonHeroes.length(); i++) {
                JSONObject jsonHeroe
                        = jsonHeroes.getJSONObject(i);
                String heroHeroe
                        = jsonHeroe.getString("hero");
                String nombreHeroe = jsonHeroe.getString("name");

                Heroe heroeLeido
                        = new Heroe(heroHeroe,
                                nombreHeroe);
                conjunto.agregarHeroe(heroeLeido);
            }
            
            for(int i=0;i<jsonGrupos.length();i++){
                JSONObject jsonGrupo=jsonGrupos.getJSONObject(i);
                String nomgrupo=jsonGrupo.getString("hero");
                Equipo grupoLeido=new Equipo(nomgrupo);
                conjunto.agregarEquipos(grupoLeido);
            }

            System.out.println("Numero de heroes = "+jsonHeroes.length());
            System.out.println("Heroes:");
            //Muestro el ArrayList
            for (Heroe heroe : conjunto.getHeroes()) {
                System.out.println("Hero: "+heroe.getHero());
                System.out.println("Name: "+heroe.getName());
                System.out.println("");
            }
            
            for(Equipo equipo:conjunto.getEquipos()){
                System.out.println("Nombre del equipo: "+equipo.getHero());
                System.out.println("");
            }
 
            
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

    }
}
