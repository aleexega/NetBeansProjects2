/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1.pkg2;

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
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("src\\practica1\\pkg2\\ERPArcade.xml"));
        document.getDocumentElement().normalize();
        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName());
        NodeList nList = document.getElementsByTagName("maquina");
        System.out.println("-.-");
        int i=1;
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node node = nList.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;
                System.out.println("Recreativo "+i);
                System.out.println("Id: " + eElement.getAttribute("id"));
                System.out.println("Nombre: "+eElement.getElementsByTagName("nombre").item(0).getTextContent());
                System.out.println("Altura total: "+eElement.getElementsByTagName("altura").item(0).getTextContent());
                System.out.println("Tamanyo del asiento: "+eElement.getElementsByTagName("tamAsiento").item(0).getTextContent());
                System.out.println("Tamanyo de la base: "+eElement.getElementsByTagName("tamBase").item(0).getTextContent());
                System.out.println("Distancia del reposapies al asiento: "+eElement.getElementsByTagName("distReposapiesAsiento")
                        .item(0).getTextContent());
                System.out.println("Peso: "+eElement.getElementsByTagName("peso").item(0).getTextContent());
                System.out.println("Material: "+eElement.getElementsByTagName("material").item(0).getTextContent());     
                if(i<nList.getLength()){
                    System.out.println(";;");
                }
                i++;
            }
        }
        System.out.println(";;;;");
    }

}
