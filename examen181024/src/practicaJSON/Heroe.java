/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaJSON;

/**
 *
 * @author FP
 */
public class Heroe {
    private String hero;
    private String name;
    private String link;
    private String img;
    private int size;

    public Heroe(String hero, String name, String link, String img, int size) {
        this.hero = hero;
        this.name = name;
        this.link = link;
        this.img = img;
        this.size = size;
    }

    public Heroe(String hero, String name) {
        this.hero = hero;
        this.name = name;
    }
    
    

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}
