package com.emn.domain;

/**
 * User: manu
 * Date: 16/10/12
 */
public class Application {

    String nom;
    String description;

    public Application(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    @Override
    public String toString(){
        return nom;
    }
}
