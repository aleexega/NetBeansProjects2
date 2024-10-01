/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciocamarasweb;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author FP
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("src/ejerciciocamarasweb/camarasWeb.xml"));
        document.getDocumentElement().normalize();
        NodeList nList = document.getElementsByTagName("camara");
        System.out.println("Lo ÚLTIMO de los cámaras WEB");
        System.out.println("============================");
        int contCam = 1;
        for (int i = 0; i < nList.getLength(); i++) {
            Node node = nList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.println("Nombre de la cámara ¡¡ "+element.getAttribute("id"));
                System.out.println("Modelo ¡¡ "+element.getElementsByTagName("modelo").item(0).getTextContent());
                System.out.println("Marca ¡¡ "+element.getElementsByTagName("marca").item(0).getTextContent());
                System.out.println("DIMENSIONES altura # " + element.getElementsByTagName("altura").item(0).getTextContent());
                System.out.println("DIMENSIONES anchura @" + element.getElementsByTagName("anchura").item(0).getTextContent());
                System.out.println("DIMENSIONES profundidad # " + element.getElementsByTagName("profundidad").item(0).getTextContent());
                System.out.println("DIMENSIONES peso @ " + element.getElementsByTagName("peso").item(0).getTextContent());
                System.out.println("DIMENSIONES megapixeles # " + element.getElementsByTagName("megapixeles").item(0).getTextContent());
                System.out.println("Comentarios: " + element.getElementsByTagName("comentarios").item(0).getTextContent());
                if (contCam < nList.getLength()) {
                    System.out.println("***************************");
                }
                contCam++;
            }
        }
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("FIN DEL DOCUMENTO XML");

    }

}
