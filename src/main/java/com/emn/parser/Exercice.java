package com.emn.parser;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Exercice {
    private String         titre;
    private double         numero;
    private String         langage;
    private double         coefficient;
    private String         introduction;
    private List<Question> questions;

    public Exercice() {
        super();
    }

    public double getCoefficient() {
        return this.coefficient;
    }

    public String getIntroduction() {
        return this.introduction;
    }

    public String getLangage() {
        return this.langage;
    }

    public double getNumero() {
        return this.numero;
    }

    public List<Question> getQuestions() {
        return this.questions;
    }

    public String getTitre() {
        return this.titre;
    }

    @XmlAttribute
    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    @XmlElement
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @XmlAttribute
    public void setLangage(String langage) {
        this.langage = langage;
    }

    @XmlAttribute
    public void setNumero(double numero) {
        this.numero = numero;
    }

    @XmlElement(name = "question")
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @XmlAttribute
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String toHtml() {
        String html = "";
        html += "<h1>" + "Exercice " + this.numero + " (coef "
                + this.coefficient + ")" + "</h1>";
        html += "<p>" + this.introduction + "</p>";
        for (Question question : this.questions) {
            html += question.toHtml();
        }
        return html;
    }

    @Override
    public String toString() {
        String a = "";
        if (this.titre != null) {
            a += this.titre + "\n";
        }
        if (this.numero != 0) {
            a += this.numero + "\n";
        }
        if (this.langage != null) {
            a += this.langage + "\n";
        }
        if (this.introduction != null) {
            a += this.introduction + "\n";
        }
        if (this.coefficient != 0) {
            a += this.coefficient + "\n";
        }
        if (this.questions != null) {
            for (Question it : this.questions) {
                a += it + "\n";
            }
        }
        return a;
    }
}
