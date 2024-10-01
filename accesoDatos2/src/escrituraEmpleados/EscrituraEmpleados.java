/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escrituraEmpleados;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

/**
 *
 * @author FP
 */
public class EscrituraEmpleados {
    public static void main(String[] args) throws ParserConfigurationException, TransformerConfigurationException, FileNotFoundException, TransformerException {
        String nombreFichero = "empleados2";//nombre del archivo
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.newDocument();//Creamos un nuvevo documento
        //Creamos la raiz del documento y añadimos atributos
        Element root = doc.createElement("empleados");
        doc.appendChild(root);

        //Creamos un nuevo módulo y lo añadimos al curso
        Element empleado = doc.createElement("empleado");
        empleado.setAttribute("id", "111");
        root.appendChild(empleado);

        //Añadimos las caracteristicas al modulo
        Element nombreEmpleado = doc.createElement("nombre");
        nombreEmpleado.appendChild(doc.createTextNode("Mark"));
        Element apellidoEmpleado = doc.createElement("apellido");
        apellidoEmpleado.appendChild(doc.createTextNode("Zuckerberg"));
        Element ciudadEmpleado=doc.createElement("ciudad");
        ciudadEmpleado.appendChild(doc.createTextNode("Florida"));
        empleado.appendChild(nombreEmpleado);
        empleado.appendChild(apellidoEmpleado);
        empleado.appendChild(ciudadEmpleado);
        

        //Transformamos y escribimos los cambios en ek archivo XML
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new FileOutputStream(nombreFichero + ".xml"));
        transformer.transform(source, result);
    }
}
