package main.java.com.emn.parser;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Question {
    public enum Type {
        qcm, texte
    }

    private Type         type;
    private double       numero;
    private double       coefficient;
    private String       enonce;
    private List<String> choix;
    private String       reponseTexte;
    private String       correction;

    public Question() {
        super();
    }

    public List<String> getChoix() {
        return this.choix;
    }

    public double getCoefficient() {
        return this.coefficient;
    }

    public String getCorrection() {
        return this.correction;
    }

    public String getEnnonce() {
        return this.enonce;
    }

    public double getNumero() {
        return this.numero;
    }

    public String getReponseTexte() {
        return this.reponseTexte;
    }

    public Type getType() {
        return this.type;
    }

    @XmlElement(name = "choix")
    public void setChoix(List<String> choix) {
        this.choix = choix;
    }

    @XmlAttribute
    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    @XmlElement
    public void setCorrection(String correction) {
        this.correction = correction;
    }

    @XmlElement
    public void setEnnonce(String ennonce) {
        this.enonce = ennonce;
    }

    @XmlAttribute
    public void setNumero(double numero) {
        this.numero = numero;
    }

    @XmlElement
    public void setReponseTexte(String reponseTexte) {
        this.reponseTexte = reponseTexte;
    }

    @XmlAttribute
    public void setType(Type type) {
        this.type = type;
    }

    public String toHtml() {
        String html = "<p>" + this.enonce + "</p>";
        if (this.type == Type.qcm) {
            for (String choi : this.choix) {
                html += "<input type=\"radio\" value=\"" + choi + "\"/>";
            }
        }
        else if (this.type == Type.texte) {
            html += "<input type=\"textarea\" rows=\"5\">reponse</input>";
        }
        return html;
    }

    @Override
    public String toString() {
        String a = "";
        if (this.numero != 0) {
            a += this.numero + "\n";
        }
        if (this.coefficient != 0) {
            a += this.coefficient + "\n";
        }
        if (this.enonce != null) {
            a += this.enonce + "\n";
        }
        if (this.choix != null) {
            for (String it : this.choix) {
                a += it + "\n";
            }
        }
        if (this.reponseTexte != null) {
            a += this.reponseTexte + "\n";
        }
        if (this.correction != null) {
            a += this.correction + "\n";
        }
        return a;
    }
}
