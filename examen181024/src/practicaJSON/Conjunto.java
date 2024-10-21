/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaJSON;

import java.util.ArrayList;

/**
 *
 * @author FP
 */
public class Conjunto {

    private String hero;
    private ArrayList<Heroe> heroes;
    private String team;
    private ArrayList<Equipo> equipos;

    public Conjunto(String hero, String team) {
        this.hero = hero;
        this.heroes = new ArrayList<Heroe>();
        this.team = team;
        this.equipos = new ArrayList<Equipo>();
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public ArrayList<Heroe> getHeroes() {
        return heroes;
    }

    public void setHeroes(ArrayList<Heroe> heroes) {
        this.heroes = heroes;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
    
    public boolean agregarHeroe(Heroe e) {
        return heroes.add(e);
    }
    
    public boolean agregarEquipos(Equipo e) {
        return equipos.add(e);
    }

}
