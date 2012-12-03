package main.java.com.emn.parser;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Information {
    private String titre;
    private String objet;
    private String date;
    private String auteur;
    private String destination;
    private double version;
    private String commentaires;
    private String UV;
    private String matiere;
    private double coefficient;

    public Information() {
        super();
    }

    public String getAuteur() {
        return this.auteur;
    }

    public double getCoefficient() {
        return this.coefficient;
    }

    public String getCommentaires() {
        return this.commentaires;
    }

    public String getDate() {
        return this.date;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getMatiere() {
        return this.matiere;
    }

    public String getObjet() {
        return this.objet;
    }

    public String getTitre() {
        return this.titre;
    }

    public String getUV() {
        return this.UV;
    }

    public double getVersion() {
        return this.version;
    }

    @XmlElement
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @XmlElement
    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    @XmlElement
    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    @XmlElement
    public void setDate(String date) {
        this.date = date;
    }

    @XmlElement
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @XmlElement
    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    @XmlElement
    public void setObjet(String objet) {
        this.objet = objet;
    }

    @XmlElement
    public void setTitre(String titre) {
        this.titre = titre;
    }

    @XmlElement
    public void setUV(String uV) {
        this.UV = uV;
    }

    @XmlElement
    public void setVersion(double version) {
        this.version = version;
    }

    @Override
    public String toString() {
        String a = "";
        if (this.titre != null) {
            a += this.titre + "\n";
        }
        if (this.objet != null) {
            a += this.objet + "\n";
        }
        if (this.date != null) {
            a += this.date + "\n";
        }
        if (this.auteur != null) {
            a += this.auteur + "\n";
        }
        if (this.destination != null) {
            a += this.destination + "\n";
        }
        if (this.version != 0) {
            a += this.version + "\n";
        }
        if (this.commentaires != null) {
            a += this.commentaires + "\n";
        }
        if (this.UV != null) {
            a += this.UV + "\n";
        }
        if (this.matiere != null) {
            a += this.matiere + "\n";
        }
        if (this.coefficient != 0) {
            a += this.coefficient + "\n";
        }
        return a;
    }
}
