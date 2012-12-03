package main.java.com.emn.parser;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement
@XmlSeeAlso({
    Exercice.class
})
public class Examen {
    private Information    information;
    private String         introduction;
    private Eleve          eleve;
    private List<Exercice> exercices;
    private String         conclusion;

    public Examen() {
        super();
    }

    public String getConclusion() {
        return this.conclusion;
    }

    public Eleve getEleve() {
        return this.eleve;
    }

    public List<Exercice> getExercices() {
        return this.exercices;
    }

    public Information getInformation() {
        return this.information;
    }

    public String getIntroduction() {
        return this.introduction;
    }

    @XmlElement
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    @XmlElement
    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

    @XmlElement(name = "exercice")
    public void setExercices(List<Exercice> exercices) {
        this.exercices = exercices;
    }

    @XmlElement
    public void setInformation(Information information) {
        this.information = information;
    }

    @XmlElement
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String toHtml() {
        String html = "";
        html += "<html>" + "<head>" + "</head>" + "<body>" + "<p>"
                + this.introduction + "</p>" + "<form>";
        for (Exercice e : this.exercices) {
            html += e.toHtml();
        }
        html += this.conclusion + "</form>" + "</body>" + "</html>";
        return html;
    }

    @Override
    public String toString() {
        String a = "";
        if (this.information != null) {
            a += this.information + "\n";
        }
        if (this.eleve != null) {
            a += this.eleve + "\n";
        }
        if (this.introduction != null) {
            a += this.introduction + "\n";
        }
        if (this.exercices != null) {
            for (Exercice it : this.exercices) {
                a += it + "\n";
            }
        }
        if (this.conclusion != null) {
            a += this.conclusion;
        }
        return a;
    }
}
