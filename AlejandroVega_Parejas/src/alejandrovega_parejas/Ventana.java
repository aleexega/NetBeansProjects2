/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alejandrovega_parejas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Alejandro
 */
public class Ventana {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton botonIniciar = new JButton();
    JLabel etiquetaImagen = new JLabel();

    public Ventana() {
        frame.setTitle("Cartas Encadenadas LQSA");
        frame.setBounds(550, 200, 800, 600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setSize(frame.getWidth(), frame.getHeight());
        panel.setBackground(new Color(245, 245, 245));
        panel.setLayout(null);
        frame.add(panel);

        IniciarComponentes();
        frame.setVisible(true);
    }

    public void IniciarComponentes() {
        botonIniciar();
        EtiquetaFondo();
    }

    public void EtiquetaFondo() {
        ImageIcon imagen = new ImageIcon("src\\img\\fondo.jpeg");
        etiquetaImagen.setBounds(0, 0, 800, 600);
        etiquetaImagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), 0)));
        panel.add(etiquetaImagen);
    }

    public void botonIniciar() {
        botonIniciar.setBounds(300, 250, 200, 50);
        botonIniciar.setText("Iniciar Juego");
        botonIniciar.setFont(new Font("Montserrat", Font.BOLD, 24));
        botonIniciar.setForeground(Color.BLACK);
        botonIniciar.setBackground(Color.YELLOW);
        botonIniciar.setBorder(new LineBorder(Color.YELLOW, 1));
        botonIniciar.setFocusable(false);

        botonIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Juego juego = new Juego();
                frame.dispose();
            }
        });

        panel.add(botonIniciar);
    }
}
