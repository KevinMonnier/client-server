package com.emn.parser;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class JABXExample {
    public static void main(String[] args) {
        try {
            // Instancie un objet examen � partir du xml test.xml
            File file = new File("test.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Examen.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Examen examen = (Examen) jaxbUnmarshaller.unmarshal(file);
            // examen est instanci� et peut �tre utilis�
            // utilisation de examen
            // Cr�� un out.xml en fonction de l'objet examen, le jaxbContext est
// r�utilis�
            File file2 = new File("out.xml");
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            // ajoute les indentations dans le xml pour qu'il soit lisible, pas
// forcement n�cessaire
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(examen, file2);
            jaxbMarshaller.marshal(examen, System.out);
            System.out.println(examen.toHtml());
        }
        catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}