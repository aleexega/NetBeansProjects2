/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rifa_AlejandroVega;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
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
    JButton botonCrear = new JButton();
    JLabel titulo = new JLabel();

    Juego juego = new Juego();

    public Ventana() {
        ventana.setVisible(true); //PAra que la ventana sea visible

        ventana.setTitle("Rifa_AlejandroVega");

        ventana.setSize(1000, 600);//Para elegir el tamaño de la ventana
        ventana.setResizable(true);//para permitit(o no) que se cambie el tamaño de la ventana
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //Para poner pantalla completa

        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ventana.setLocation(500, 150);//Para cambiar la posicion inicial de la ventana respecto a la pantalla

        ventana.getContentPane().setBackground(Color.red);
        Panel();
        BotonCrearCarton();
        BotonCartonAleatorio();
        EtiquetaImg();
    }

    public void Panel() {
        panel.setBackground(Color.DARK_GRAY);
        panel.setMaximumSize(new Dimension(1000, 600));
        panel.setMinimumSize(new Dimension(200, 100));
        panel.setLayout(null);
        ventana.add(panel);
    }

    public void BotonCrearCarton() {
        botonCrear.setText("CREAR CARTON");
        botonCrear.setFont(new Font("Arial", Font.BOLD, 30));
        botonCrear.setOpaque(true);
        botonCrear.setBounds(100, 275, 350, 50);
        panel.add(botonCrear);
    }

    public void BotonCartonAleatorio() {
        botonAleatorio.setText("CARTON ALEATORIO");
        botonAleatorio.setFont(new Font("Arial", Font.BOLD, 30));
        botonAleatorio.setOpaque(true);
        botonAleatorio.setBounds(550, 275, 350, 50);
        panel.add(botonAleatorio);

        botonAleatorio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ventana2 ventana2 = new Ventana2();
                ventana.dispose();
            }
        }
        );
    }

    public void EtiquetaImg() {
        ImageIcon imagen = new ImageIcon("C:\\Users\\FP\\Documents\\NetBeansProjects\\Rifa\\src\\rifa_AlejandroVega\\rifa.jpg");
        JLabel etiquetaImagen = new JLabel();
        etiquetaImagen.setBounds(0, 0, 1000, 600);
        etiquetaImagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), 0)));
        panel.add(etiquetaImagen);
    }
}
