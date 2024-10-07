/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciotransformer;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class Principal {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerConfigurationException, TransformerException {
        //No se toca, es el parseo del DOM de empleados.xml
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("empleados.xml"));
        
        document.getDocumentElement().normalize();
        
        System.out.println("Documento normalizado correctamente");
        
        //almacenamiento en un estructura de datos...
        //NodeList de una elemento que queramos
        //en este caso son interesa <empleado></empleado>
        
        NodeList nList  = document.getElementsByTagName("empleado");
        ArrayList<Empleado> arrayEmpleados = new ArrayList();
        
        System.out.println("El numero de empleados recogidos son "+nList.getLength());
        
        //Ahora trabajamos con NodeList, Node y Element
        //importamos todo de org.w3c.dom
        
        for(int i = 0;i < nList.getLength(); i++){
            //Recogemos el NODO
            Node nodo = nList.item(i);
            //Hay que confirmar que es un Element
            //Se trabaja con Element para recuperar los datos del Nodo
            if(nodo.getNodeType() == Node.ELEMENT_NODE){
                Element elemento = (Element) nodo;
                /* Elemento con el que se trabaja
                <empleado id = "111">   
                    <nombre> Marc </nombre>
                    <apellido>Zuckerberg</apellido>
                    <ciudad>Florida</ciudad>
                </empleado>
                */
                /* Salida de todos los elementos
                    System.out.println(elemento.getAttribute("id"));
                    System.out.println(elemento.getElementsByTagName("nombre").item(0).getTextContent());
                */
                String id = elemento.getAttribute("id");
                String nombre = elemento.getElementsByTagName("nombre").item(0).getTextContent();
                String apellido = elemento.getElementsByTagName("apellido").item(0).getTextContent();
                String ciudad = elemento.getElementsByTagName("ciudad").item(0).getTextContent();
                arrayEmpleados.add(new Empleado(id,nombre,apellido,ciudad));
 
            }
        }
        
       
        //Recogida de datos y creacion del onjeto
        Empleado empleadoNuevo=new Empleado("444","Obli","Oblak","Eslovaquia");
        arrayEmpleados.add(empleadoNuevo);
        
        
        
        //Creacion del xml con Transformer en otro fichero, respetamos el anterior
        String nombreFichero="empleados2";
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.newDocument();
        //Elemento raiza
        Element rootElement=doc.createElement("empleados");
        doc.appendChild(rootElement);
        
        for(Empleado e : arrayEmpleados){
            //recorremos y metemos todos los empleados
            Element empleado=doc.createElement("empleado");
            empleado.setAttribute("id", e.getId());
            rootElement.appendChild(empleado);
            
            
            
        }
                
        //Cerramos el elemento raiz
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new FileOutputStream(nombreFichero + ".xml"));
        transformer.transform(source, result);
        System.out.println("Datos incluidos en empleados.xml");
        System.out.println();
        
        
        //<empleados></empleados>
 
    }
    
}
