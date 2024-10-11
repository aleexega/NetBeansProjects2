/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alejandrovega_test;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author FP
 */
public class Examen {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel txtP1 = new JLabel();
    JRadioButton P11 = new JRadioButton();
    JRadioButton P12 = new JRadioButton();
    JRadioButton P13 = new JRadioButton();
    ButtonGroup Pgrupo1 = new ButtonGroup();
    JLabel txtP2 = new JLabel();
    JRadioButton P21 = new JRadioButton();
    JRadioButton P22 = new JRadioButton();
    JRadioButton P23 = new JRadioButton();
    ButtonGroup Pgrupo2 = new ButtonGroup();
    JLabel txtP3 = new JLabel();
    JRadioButton P31 = new JRadioButton();
    JRadioButton P32 = new JRadioButton();
    JRadioButton P33 = new JRadioButton();
    ButtonGroup Pgrupo3 = new ButtonGroup();
    JLabel txtP4 = new JLabel();
    JRadioButton P41 = new JRadioButton();
    JRadioButton P42 = new JRadioButton();
    JRadioButton P43 = new JRadioButton();
    ButtonGroup Pgrupo4 = new ButtonGroup();
    JLabel txtP5 = new JLabel();
    JRadioButton P51 = new JRadioButton();
    JRadioButton P52 = new JRadioButton();
    JRadioButton P53 = new JRadioButton();
    ButtonGroup Pgrupo5 = new ButtonGroup();
    JLabel txtP6 = new JLabel();
    JRadioButton P61 = new JRadioButton();
    JRadioButton P62 = new JRadioButton();
    JRadioButton P63 = new JRadioButton();
    ButtonGroup Pgrupo6 = new ButtonGroup();
    JLabel txtP7 = new JLabel();
    JRadioButton P71 = new JRadioButton();
    JRadioButton P72 = new JRadioButton();
    JRadioButton P73 = new JRadioButton();
    ButtonGroup Pgrupo7 = new ButtonGroup();
    JLabel txtP8 = new JLabel();
    JRadioButton P81 = new JRadioButton();
    JRadioButton P82 = new JRadioButton();
    JRadioButton P83 = new JRadioButton();
    ButtonGroup Pgrupo8 = new ButtonGroup();
    JLabel txtP9 = new JLabel();
    JRadioButton P91 = new JRadioButton();
    JRadioButton P92 = new JRadioButton();
    JRadioButton P93 = new JRadioButton();
    ButtonGroup Pgrupo9 = new ButtonGroup();
    JLabel txtP10 = new JLabel();
    JRadioButton P101 = new JRadioButton();
    JRadioButton P102 = new JRadioButton();
    JRadioButton P103 = new JRadioButton();
    ButtonGroup Pgrupo10 = new ButtonGroup();

    public Examen(String nombre, String apellido) {
        nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();
        apellido = apellido.substring(0, 1).toUpperCase() + apellido.substring(1).toLowerCase();
        frame.setVisible(true);
        frame.setTitle("Examen " + nombre + " " + apellido);
        frame.setBounds(550, 200, 440, 300);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setSize(frame.getWidth(), frame.getHeight());
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);
        frame.add(panel);

        nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1);
        apellido = apellido.substring(0, 1).toUpperCase() + apellido.substring(1);
        JLabel labelNombre = new JLabel("Examen " + nombre + " " + apellido);
        labelNombre.setBounds(50, 10, 400, 30);
        panel.add(labelNombre);

        IniciarComponentes();
        panel.updateUI();
    }

    public void IniciarComponentes() {
        pregunta1();
        mostrarPregunta1();
        pregunta2();
        ocultarPregunta2();
        pregunta3();
        ocultarPregunta3();
        botonAlante();
        botonAtras();
    }

    public void pregunta1() {
        txtP1.setText("¿Cuando se creó el primer ordenador?");
        txtP1.setBounds(50, 50, 500, 30);
        P11.setBounds(50, 100, 100, 30);
        P11.setText("1943");
        P11.setFocusable(false);
        P12.setBounds(160, 100, 100, 30);
        P12.setText("1944");
        P12.setFocusable(false);
        P13.setBounds(270, 100, 100, 30);
        P13.setText("1945");
        P13.setFocusable(false);
        Pgrupo1.add(P11);
        Pgrupo1.add(P12);
        Pgrupo1.add(P13);
        panel.add(txtP1);
        panel.add(P11);
        panel.add(P12);
        panel.add(P13);
    }

    public void ocultarPregunta1() {
        txtP1.setVisible(false);
        P11.setVisible(false);
        P12.setVisible(false);
        P13.setVisible(false);
    }

    public void mostrarPregunta1() {
        txtP1.setVisible(true);
        P11.setVisible(true);
        P12.setVisible(true);
        P13.setVisible(true);
    }

    public void pregunta2() {
        txtP2.setText("¿Cuando comí?");
        txtP2.setBounds(50, 50, 500, 30);

        P21.setBounds(50, 100, 100, 30);
        P21.setText("Hoy");

        P22.setBounds(160, 100, 100, 30);
        P22.setText("Ayer");

        P23.setBounds(270, 100, 100, 30);
        P23.setText("Pasado");

        Pgrupo2.add(P21);
        Pgrupo2.add(P22);
        Pgrupo2.add(P23);

        panel.add(txtP2);
        panel.add(P21);
        panel.add(P22);
        panel.add(P23);
    }

    public void ocultarPregunta2() {
        txtP2.setVisible(false);
        P21.setVisible(false);
        P22.setVisible(false);
        P23.setVisible(false);
    }

    public void mostrarPregunta2() {
        txtP2.setVisible(true);
        P21.setVisible(true);
        P22.setVisible(true);
        P23.setVisible(true);
    }

    public void pregunta3() {
        txtP3 = new JLabel("¿Cuál es el océano más grande del mundo?");
        txtP3.setBounds(50, 50, 500, 30);
        P31 = new JRadioButton("Pacífico");
        P32 = new JRadioButton("Atlántico");
        P33 = new JRadioButton("Índico");
        Pgrupo3 = new ButtonGroup();
        Pgrupo3.add(P31);
        Pgrupo3.add(P32);
        Pgrupo3.add(P33);

        P31.setBounds(50, 100, 100, 30);
        P32.setBounds(160, 100, 100, 30);
        P33.setBounds(270, 100, 100, 30);

        panel.add(txtP3);
        panel.add(P31);
        panel.add(P32);
        panel.add(P33);
    }

    public void ocultarPregunta3() {
        txtP3.setVisible(false);
        P31.setVisible(false);
        P32.setVisible(false);
        P33.setVisible(false);
    }

    public void mostrarPregunta3() {
        txtP3.setVisible(true);
        P31.setVisible(true);
        P32.setVisible(true);
        P33.setVisible(true);
    }

    public void botonAlante() {
        JButton botonAlante = new JButton();
        botonAlante.setBounds(286, 150, 84, 84);
        ImageIcon iconoAlante = new ImageIcon(getClass().getResource("/img/alante.png"));
        botonAlante.setContentAreaFilled(false); // Para que no rellene el área
        botonAlante.setBorderPainted(false); // Para quitar el borde
        botonAlante.setFocusPainted(false); // Para quitar el borde de enfoque
        botonAlante.setIcon(iconoAlante);

        ActionListener aleatorio = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cont == 1) {
                    mostrarPregunta1();
                    ocultarPregunta2();
                    cont++;
                } else if (cont == 2) {
                    mostrarPregunta2();
                    ocultarPregunta1();
                    cont++;
                } else if (cont == 3) {
                    mostrarPregunta3();
                    ocultarPregunta2();
                }

            }
        };
        botonAlante.addActionListener(aleatorio);

        panel.add(botonAlante);
    }

    public void botonAtras() {
        JButton botonAtras = new JButton();
        botonAtras.setBounds(50, 150, 84, 84);
        ImageIcon iconoAtras = new ImageIcon(getClass().getResource("/img/atras.png"));
        botonAtras.setContentAreaFilled(false);
        botonAtras.setBorderPainted(false);
        botonAtras.setFocusPainted(false);
        botonAtras.setIcon(iconoAtras);

        ActionListener aleatorio = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cont == 2) {
                    mostrarPregunta1();
                    ocultarPregunta2();
                    cont--;
                } else if (cont == 3) {
                    mostrarPregunta2();
                    ocultarPregunta3();
                    cont--;
                }
            }
        };
        botonAtras.addActionListener(aleatorio);

        panel.add(botonAtras);
    }

    int cont = 1;
}
