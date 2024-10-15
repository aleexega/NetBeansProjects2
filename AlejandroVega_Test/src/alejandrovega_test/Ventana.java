/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alejandrovega_test;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author FP
 */
public class Ventana {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton botonIniciar = new JButton();
    JTextField nombreField = new JTextField();
    JTextField apellidoField = new JTextField();
    JLabel nombreLabel = new JLabel();
    JLabel apellidoLabel = new JLabel();
    JLabel txtNumAciertos = new JLabel();
    JLabel txtNumFallos = new JLabel();
    JLabel txtResultado = new JLabel();
    JLabel txtMensaje = new JLabel();

    int numAciertos;
    int numFallos;

    public Ventana() {
        frame.setTitle("Examen");
        frame.setBounds(550, 200, 440, 250);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setSize(frame.getWidth(), frame.getHeight());
        panel.setBackground(new Color(245, 245, 245));
        panel.setLayout(null);
        frame.add(panel);

        IniciarComponentes();
        panel.updateUI();

        frame.setVisible(true);
    }

    public void IniciarComponentes() {
        botonIniciar();
        alumno();
    }

    public void alumno() {
        // Configuración del campo Nombre
        nombreLabel.setText("Nombre: ");
        nombreLabel.setForeground(new Color(33, 150, 243));
        nombreLabel.setFont(new Font("Open Sans", Font.BOLD, 15));
        nombreLabel.setBounds(50, 50, 100, 30);
        panel.add(nombreLabel);

        nombreField.setBounds(150, 50, 200, 30);
        nombreField.setForeground(new Color(33, 150, 243));
        nombreField.setFont(new Font("Open Sans", Font.BOLD, 15));
        nombreField.setBackground(new Color(255, 255, 255));
        nombreField.setBorder(new LineBorder(new Color(200, 200, 200), 1));
        panel.add(nombreField);

        // Configuración del campo Apellido
        apellidoLabel.setText("Apellido: ");
        apellidoLabel.setForeground(new Color(33, 150, 243));
        apellidoLabel.setFont(new Font("Open Sans", Font.BOLD, 15));
        apellidoLabel.setBounds(50, 100, 100, 30);
        panel.add(apellidoLabel);

        apellidoField.setBounds(150, 100, 200, 30);
        apellidoField.setForeground(new Color(33, 150, 243));
        apellidoField.setFont(new Font("Open Sans", Font.BOLD, 15));
        apellidoField.setBackground(new Color(255, 255, 255));
        apellidoField.setBorder(new LineBorder(new Color(200, 200, 200), 1));
        panel.add(apellidoField);
    }

    public void botonIniciar() {
        botonIniciar.setBounds(150, 150, 200, 50);
        botonIniciar.setText("Iniciar examen");
        botonIniciar.setFont(new Font("Montserrat", Font.BOLD, 24));
        botonIniciar.setForeground(new Color(255, 255, 255));
        botonIniciar.setBackground(new Color(33, 150, 243));
        botonIniciar.setBorder(new LineBorder(new Color(33, 150, 243), 1));
        botonIniciar.setFocusable(false);

        ActionListener aleatorio = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText().trim();
                String apellido = apellidoField.getText().trim();
                if (nombre.isEmpty() || apellido.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese su nombre y apellido.");
                } else {
                    Examen examen = new Examen(nombre, apellido, Ventana.this);
                    frame.setVisible(false);
                    nombreLabel.setVisible(false);
                    nombreField.setVisible(false);
                    apellidoLabel.setVisible(false);
                    apellidoField.setVisible(false);
                    botonIniciar.setVisible(false);
                }
            }
        };
        botonIniciar.addActionListener(aleatorio);
        panel.add(botonIniciar);
    }

    public void recibirDatos(int aciertos, int fallos) {
        this.numAciertos = aciertos;
        this.numFallos = fallos;
        enseñarNota();
    }

    public void enseñarNota() {
        txtResultado.setFont(new Font("Open Sans", Font.BOLD, 25));
        txtResultado.setForeground(new Color(33, 150, 243));
        txtResultado.setBounds(50, 20, 340, 50);
        txtResultado.setVisible(true);

        int nota = numAciertos - numFallos;
        if (nota >= 0) {
            txtResultado.setText("Nota examen: " + nota);
        } else {
            txtResultado.setText("Nota examen: 0");
        }

        txtNumAciertos.setText("Aciertos: " + numAciertos);
        txtNumAciertos.setFont(new Font("Open Sans", Font.BOLD, 15));
        txtNumAciertos.setForeground(new Color(33, 150, 243));
        txtNumAciertos.setBounds(50, 80, 150, 30);
        txtNumAciertos.setVisible(true);
        txtNumFallos.setText("Fallos: " + numFallos);
        txtNumFallos.setFont(new Font("Open Sans", Font.BOLD, 15));
        txtNumFallos.setForeground(new Color(33, 150, 243));
        txtNumFallos.setBounds(240, 80, 150, 30);
        txtNumFallos.setVisible(true);
        txtMensaje.setFont(new Font("Open Sans", Font.BOLD, 18));
        txtMensaje.setForeground(new Color(33, 150, 243));
        txtMensaje.setBounds(50, 120, 340, 30);
        if (nota >= 5) {
            txtMensaje.setText("¡Felicidades! Has aprobado.");
        } else {
            txtMensaje.setText("Lo siento, has suspendido.");
        }
        txtMensaje.setVisible(true);
        panel.add(txtResultado);
        panel.add(txtNumAciertos);
        panel.add(txtNumFallos);
        panel.add(txtMensaje);
    }

    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }
}
