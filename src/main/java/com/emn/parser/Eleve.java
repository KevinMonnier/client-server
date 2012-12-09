package com.emn.parser;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Eleve {
    private String nom;
    private String prenom;
    private String promo;
    private String groupe;
    private String professeur;

    public Eleve() {
        super();
    }

    public String getGroupe() {
        return this.groupe;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getProfesseur() {
        return this.professeur;
    }

    public String getPromo() {
        return this.promo;
    }

    @XmlElement
    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    @XmlElement
    public void setNom(String nom) {
        this.nom = nom;
    }

    @XmlElement
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @XmlElement
    public void setProfesseur(String professeur) {
        this.professeur = professeur;
    }

    @XmlElement
    public void setPromo(String promo) {
        this.promo = promo;
    }

    @Override
    public String toString() {
        String a = "";
        if (this.nom != null) {
            a += this.nom + "\n";
        }
        if (this.prenom != null) {
            a += this.prenom + "\n";
        }
        if (this.promo != null) {
            a += this.promo + "\n";
        }
        if (this.groupe != null) {
            a += this.groupe + "\n";
        }
        if (this.professeur != null) {
            a += this.professeur + "\n";
        }
        return a;
    }
}
