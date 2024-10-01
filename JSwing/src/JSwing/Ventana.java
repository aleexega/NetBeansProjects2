/*º
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author FP
 */
public class Ventana {

    JFrame frame = new JFrame(); //objeto tipo JFRAME
    JPanel panel = new JPanel();
    JLabel etiqueta = new JLabel();
    JTextField cajaTexto = new JTextField();
    JButton boton = new JButton();

    public Ventana() { //constructor vacio para la ventana JFRAME
        frame.setVisible(true); //PAra que la ventana sea visible

        frame.setTitle("montepinar");

        frame.setSize(500, 300);//Para elegir el tamaño de la ventana
        frame.setResizable(true);//para permitit(o no) que se cambie el tamaño de la ventana
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //Para poner pantalla completa

        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.setLocation(500, 150);//Para cambiar la posicion inicial de la ventana respecto a la pantalla

        frame.getContentPane().setBackground(Color.red);//getContentPane() Para acceder al panel de la ventana

        Panel(); //Llama al metodo panel
        Etiqueta();
        CajaTexto();
        Boton();
        EtiquetaImg();
        FondoPantalla();
        panel.updateUI();
    }

    public void FondoPantalla() {
        JLabel fondo = new JLabel();

        fondo.setBounds(0, 0, panel.getWidth(), panel.getHeight());
        ImageIcon imagen = new ImageIcon("img/atleti.jpg");
        fondo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), 0)));

        panel.add(fondo);
    }

    public void Panel() { //MEtodo para contruir un panel
        panel.setBackground(Color.yellow); //Para cambiar el color del panel
        panel.setMaximumSize(new Dimension(500, 500)); //Tamaño maximo del panel
        panel.setMinimumSize(new Dimension(200, 100)); //Tamaño maximo del panel

        //panel.setLayout(new FlowLayout());//Aliniamiento a la izquierda, por defecto
        //panel.setLayout(new BorderLayout());//Cinco zonas: N S E O Centro
        //panel.setLayout(new GridLayout());//Una cuadricula predefinida
        //panel.setLayout(new GridBagLayout());//Una cuadricula flexible
        //panel.setLayout(new BoxLayout(panel ,0));//Por coordenadas
        panel.setLayout(null); //Desactivar el layout por defecto

        frame.add(panel); //para añadir un elemento a otro. en este caso el panel sobre la ventana
    }

    public void Etiqueta() {//MEtodo para contruir una etiqueta        
        etiqueta.setText("Atleti");
        etiqueta.setBounds(50, 60, 100, 50); //Para añadir coordenadas(los 2 primeros) y dimensiones(3º y 4º)
        //etiqueta.setSize(50, 50); 
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);

        etiqueta.setOpaque(true); //Para que la etiqueta no sea transparente
        etiqueta.setForeground(Color.red);//para cambiar el color del texto
        etiqueta.setBackground(Color.white);//Para cambiar el color de fondo

        etiqueta.setFont(new Font("Ink Free", Font.BOLD, 25));

        panel.add(etiqueta);
    }

    public void CajaTexto() {
        cajaTexto.setBounds(160, 60, 250, 50);

        cajaTexto.setHorizontalAlignment(SwingConstants.CENTER);
        cajaTexto.setFont(new Font("Times New Roman", 0, 25));

        cajaTexto.setForeground(Color.red);
        cajaTexto.setBackground(Color.green);

        panel.add(cajaTexto);
    }

    public void Boton() {
        /*int x, y;
        x = (int) (Math.random() * 400);
        y = (int) (Math.random() * 400);*/
        boton.setBounds(50, 120, 200, 50);
        boton.setText("Pulsa bonita");
        boton.setFont(new Font("Impact", Font.BOLD, 25));
        boton.setForeground(Color.white);
        boton.setBackground(Color.blue);
        panel.add(boton);

    }

    public void EtiquetaImg() {
        //Por defecto, las imagenes tienen el tamaño predeterminado
        //JLabel etiquetaImagen = new JLabel(new ImageIcon("img/atleti.jpg"));//Añadir img en en el constructor
        ImageIcon imagen = new ImageIcon("img/atleti.jpg");//Imagen independiente
        JLabel etiquetaImagen = new JLabel(); //Etiqueta independiente        
        //etiquetaImagen.setIcon(imagen);//Añadir la img a la etiqueta

        etiquetaImagen.setBounds(50, 200, 250, 250);
        //Para cambiar el tamaño de la imagen: se genera una nueva imagen a partir 
        etiquetaImagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), 0)));
        panel.add(etiquetaImagen);
    }

}
