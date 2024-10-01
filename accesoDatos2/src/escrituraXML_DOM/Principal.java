/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escrituraXML_DOM;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 *
 * @author FP
 */
public class Principal {

    public static void main(String[] args) throws SAXException, ParserConfigurationException, IOException, TransformerConfigurationException, TransformerException {
        //Parseamos el archivo XML existente
        String nombreFichero = "curso";//nombre del archivo
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.newDocument();//Creamos un nuvevo documento
        //Creamos la raiz del documento y añadimos atributos
        Element root = doc.createElement("curso");
        root.setAttribute("nivel", "3");
        root.setAttribute("ciclo", "DAM");
        doc.appendChild(root);

        //Creamos un nuevo módulo y lo añadimos al curso
        Element modulo = doc.createElement("modulo");
        root.appendChild(modulo);

        //Añadimos las caracteristicas al modulo
        Element nombreModulo = doc.createElement("nombre");
        nombreModulo.appendChild(doc.createTextNode("PMDM"));
        nombreModulo.setAttribute("cuso", "3");
        modulo.appendChild(nombreModulo);

        //Transformamos y escribimos los cambios en ek archivo XML
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new FileOutputStream(nombreFichero + ".xml"));
        transformer.transform(source, result);
        System.out.println("Datos actualizados en el archivo XML");

    }
}
