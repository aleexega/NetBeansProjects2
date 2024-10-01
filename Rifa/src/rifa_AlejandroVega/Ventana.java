/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rifa_AlejandroVega;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author FP
 */
public class Ventana {

    JFrame ventana = new JFrame();
    JPanel panel = new JPanel();
    JButton botonAleatorio = new JButton();
    JButton botonGuardar = new JButton();
    JButton botonStart = new JButton();
    JLabel titulo = new JLabel();

    Juego juego = new Juego();

    public Ventana() {
        ventana.setVisible(true); //PAra que la ventana sea visible

        ventana.setTitle("Rifa");

        ventana.setSize(1000, 600);//Para elegir el tamaño de la ventana
        ventana.setResizable(true);//para permitit(o no) que se cambie el tamaño de la ventana
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //Para poner pantalla completa

        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ventana.setLocation(500, 150);//Para cambiar la posicion inicial de la ventana respecto a la pantalla

        ventana.getContentPane().setBackground(Color.red);
        BotonAleatorio();
        Panel();
        BotonStart();
        EtiquetaImg();
    }
    public void Panel() { //MEtodo para contruir un panel
        panel.setBackground(Color.DARK_GRAY); //Para cambiar el color del panel
        panel.setMaximumSize(new Dimension(1000, 600)); //Tamaño maximo del panel
        panel.setMinimumSize(new Dimension(200, 100)); //Tamaño maximo del panel

        //panel.setLayout(new FlowLayout());//Aliniamiento a la izquierda, por defecto
        //panel.setLayout(new BorderLayout());//Cinco zonas: N S E O Centro
        //panel.setLayout(new GridLayout());//Una cuadricula predefinida
        //panel.setLayout(new GridBagLayout());//Una cuadricula flexible
        //panel.setLayout(new BoxLayout(panel ,0));//Por coordenadas
        panel.setLayout(null); //Desactivar el layout por defecto

        ventana.add(panel); //para añadir un elemento a otro. en este caso el panel sobre la ventana
    }
    public void BotonAleatorio() {
        Juego juego = new Juego();
        botonAleatorio.setBounds(150, 150, 350, 50);
        botonAleatorio.setLayout(new FlowLayout());
        botonAleatorio.setText("COMPRAR CARTON ALEATORIO");
        botonAleatorio.setFont(new Font("Impact", Font.BOLD, 25));
        botonAleatorio.setForeground(Color.BLUE);
        botonAleatorio.setBackground(Color.LIGHT_GRAY);
        panel.add(botonAleatorio);
    }

    public void BotonStart() {
        /*Juego juego = new Juego();
        botonStart.setBounds(50, 200, 300, 50);
        botonStart.setText("CREAR CARTON PROPIO");
        botonStart.setFont(new Font("Impact", Font.BOLD, 25));
        botonStart.setForeground(Color.BLUE);
        botonStart.setBackground(Color.LIGHT_GRAY);
        panel.add(botonStart);*/
    }
    public void EtiquetaImg() {
        //Por defecto, las imagenes tienen el tamaño predeterminado
        //JLabel etiquetaImagen = new JLabel(new ImageIcon("img/atleti.jpg"));//Añadir img en en el constructor
        ImageIcon imagen = new ImageIcon("C:\\Users\\FP\\Documents\\NetBeansProjects\\Rifa\\src\\rifa_AlejandroVega\\img.jpg");//Imagen independiente
        JLabel etiquetaImagen = new JLabel(); //Etiqueta independiente        
        //etiquetaImagen.setIcon(imagen);//Añadir la img a la etiqueta

        etiquetaImagen.setBounds(0, 0,1000, 600);
        //Para cambiar el tamaño de la imagen: se genera una nueva imagen a partir 
        etiquetaImagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), 0)));
        panel.add(etiquetaImagen);
    }
}
