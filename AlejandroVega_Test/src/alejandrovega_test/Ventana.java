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
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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

    public Ventana() {
        frame.setVisible(true);
        frame.setTitle("Iniciar examen");   //Para a�adir un titulo a la ventana
        frame.setBounds(550, 200, 500, 500);    //Para elegir el tama�o de la ventana
        frame.setResizable(false);   //Para permitir (o no) que se cambie el tama�o de ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           //Cierra el programa darle a la X (por defecto)

        panel.setSize(frame.getWidth(), frame.getHeight());
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);
        frame.add(panel);

        IniciarComponentes();
        panel.updateUI();
    }

    public void IniciarComponentes() {
        botonIniciar();
        alumno();
    }

    public void alumno() {
        JLabel nombreLabel = new JLabel("Nombre:");
        nombreLabel.setBounds(50, 50, 100, 30);
        panel.add(nombreLabel);

        nombreField.setBounds(150, 50, 200, 30);
        panel.add(nombreField);

        JLabel apellidoLabel = new JLabel("Apellido:");
        apellidoLabel.setBounds(50, 100, 100, 30);
        panel.add(apellidoLabel);

        apellidoField.setBounds(150, 100, 200, 30);
        panel.add(apellidoField);
    }

    public void botonIniciar() {
        botonIniciar.setBounds(150, 300, 200, 100);
        botonIniciar.setText("Iniciar examen");
        botonIniciar.setFont(new Font("Times New Roman", Font.BOLD, 24));
        botonIniciar.setFocusable(false);
        ActionListener aleatorio = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombre = nombreField.getText();
            String apellido = apellidoField.getText();
            if (nombre.length()==0 || apellido.length()==0) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese su nombre y apellido.");
            } else {
                Examen examen = new Examen(nombre, apellido);
                frame.setVisible(false);
            }
        }
    };
        botonIniciar.addActionListener(aleatorio);

        panel.add(botonIniciar);
    }
}
