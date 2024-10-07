/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escribirfichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author FP
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            // Leer el archivo XML corregido
            File inputFile = new File("src\\escribirFichero\\camarasWeb.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            // Crear el archivo de texto de salida
            FileWriter writer = new FileWriter("webCamerasOutput.txt");

            writer.write("Lo ÚLTIMO de los cámaras WEB\n");
            writer.write("===========================\n");

            // Obtener la lista de cámaras
            NodeList nList = doc.getElementsByTagName("camara");

            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    writer.write("Nombre de la cámara ¡¡ " + element.getAttribute("id") + "\n");
                    writer.write("Modelo ¡¡ " + element.getElementsByTagName("modelo").item(0).getTextContent() + "\n");
                    writer.write("Marca ¡¡ " + element.getElementsByTagName("marca").item(0).getTextContent() + "\n");
                    writer.write("DIMENSIONES altura # " + element.getElementsByTagName("altura").item(0).getTextContent() + "\n");
                    writer.write("DIMENSIONES anchura @" + element.getElementsByTagName("anchura").item(0).getTextContent() + "\n");
                    writer.write("DIMENSIONES profundidad # " + element.getElementsByTagName("profundidad").item(0).getTextContent() + "\n");
                    writer.write("DIMENSIONES peso @ " + element.getElementsByTagName("peso").item(0).getTextContent() + "\n");
                    writer.write("DIMENSIONES megapixeles # " + element.getElementsByTagName("megapixeles").item(0).getTextContent() + "\n");
                    writer.write("Comentarios: " + element.getElementsByTagName("comentarios").item(0).getTextContent() + "\n");

                }
            }
            writer.close();
            System.out.println("Archivo de texto generado correctamente.");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
