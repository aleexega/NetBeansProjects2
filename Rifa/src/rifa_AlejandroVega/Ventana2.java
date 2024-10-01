/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rifa_AlejandroVega;

import java.awt.Color;
import java.awt.Dimension;
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
public class Ventana2 {
    JFrame ventana2 = new JFrame();
    JPanel panel = new JPanel();
    JButton botonVolver = new JButton();
    JLabel mensaje = new JLabel();

    public Ventana2() {
        // Configuración de la ventana
        ventana2.setVisible(true); // Para que la ventana sea visible
        ventana2.setTitle("Ventana 2");
        ventana2.setSize(1000, 600); // Tamaño de la ventana
        ventana2.setResizable(true); // Permitir cambiar el tamaño
        ventana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cerrar la ventana
        ventana2.setLocation(500, 150); // Posición inicial de la ventana
        ventana2.getContentPane().setBackground(Color.BLUE); // Color de fondo

        Panel(); // Configura el panel
        crearBotonVolver(); // Crea el botón "VOLVER"
        crearMensaje(); // Crea el mensaje de bienvenida
        EtiquetaImg();
    }

    private void Panel() {
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(null); // Layout nulo
        ventana2.add(panel);
    }

    private void crearBotonVolver() {
        botonVolver.setText("VOLVER");
        botonVolver.setFont(new Font("Arial", Font.BOLD, 30));
        botonVolver.setForeground(Color.black);
        botonVolver.setBackground(Color.cyan);
        botonVolver.setFocusPainted(false);
        botonVolver.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        botonVolver.setOpaque(true);
        botonVolver.setBounds(550, 275, 350, 50);
        panel.add(botonVolver);
        
        botonVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ventana();
                ventana2.dispose();
            }
        }
        );
        
    }

    private void crearMensaje() {
        mensaje.setText("¡Bienvenido a la Ventana 2!");
        mensaje.setFont(new Font("Arial", Font.BOLD, 30));
        mensaje.setForeground(Color.white);
        mensaje.setBounds(300, 100, 400, 50); // Posición y tamaño del mensaje
        panel.add(mensaje);
    }
    
    public void EtiquetaImg() {
        ImageIcon imagen = new ImageIcon("C:\\Users\\FP\\Documents\\NetBeansProjects\\Rifa\\src\\rifa_AlejandroVega\\rifa.jpg");
        JLabel etiquetaImagen = new JLabel();
        etiquetaImagen.setBounds(0, 0, 1000, 600);
        etiquetaImagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), 0)));
        panel.add(etiquetaImagen);
    }

}
