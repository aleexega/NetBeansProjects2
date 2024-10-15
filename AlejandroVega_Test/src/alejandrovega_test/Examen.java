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
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
    JCheckBox checkEntrega = new JCheckBox();
    JButton btnEntregar = new JButton();
    private Ventana ventana;

    public Examen(String nombre, String apellido, Ventana ventana) {
        this.ventana = ventana;
        nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();
        apellido = apellido.substring(0, 1).toUpperCase() + apellido.substring(1).toLowerCase();
        frame.setVisible(true);
        frame.setTitle("Examen " + nombre + " " + apellido);
        frame.setBounds(550, 200, 440, 270);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setSize(frame.getWidth(), frame.getHeight());
        panel.setBackground(new Color(245, 245, 245));
        panel.setLayout(null);
        frame.add(panel);

        nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1);
        apellido = apellido.substring(0, 1).toUpperCase() + apellido.substring(1);
        JLabel labelNombre = new JLabel("Examen " + nombre + " " + apellido);
        labelNombre.setBounds(50, 10, 400, 30);
        labelNombre.setForeground(new Color(33, 150, 243));
        labelNombre.setFont(new Font("Open Sans", Font.BOLD, 20));
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
        pregunta4();
        ocultarPregunta4();
        pregunta5();
        ocultarPregunta5();
        pregunta6();
        ocultarPregunta6();
        pregunta7();
        ocultarPregunta7();
        pregunta8();
        ocultarPregunta8();
        pregunta9();
        ocultarPregunta9();
        pregunta10();
        ocultarPregunta10();
        botonAlante();
        botonCheckExamen();
        botonEntregar();
    }

    public void pregunta1() {
        txtP1.setText("¿Cuál es el primer lenguaje de programación?");
        txtP1.setBounds(50, 50, 500, 30);
        txtP1.setForeground(new Color(33, 150, 243));
        txtP1.setFont(new Font("Open Sans", Font.BOLD, 15));

        P11.setText("Fortran"); // Correcta
        P11.setBounds(50, 100, 100, 30);
        P11.setForeground(new Color(33, 150, 243));
        P11.setFont(new Font("Open Sans", Font.BOLD, 13));

        P12.setText("Cobol");
        P12.setBounds(160, 100, 100, 30);
        P12.setForeground(new Color(33, 150, 243));
        P12.setFont(new Font("Open Sans", Font.BOLD, 13));

        P13.setText("Python");
        P13.setBounds(270, 100, 100, 30);
        P13.setForeground(new Color(33, 150, 243));
        P13.setFont(new Font("Open Sans", Font.BOLD, 13));

        Pgrupo1.add(P11);
        Pgrupo1.add(P12);
        Pgrupo1.add(P13);
        panel.add(txtP1);
        panel.add(P11);
        panel.add(P12);
        panel.add(P13);
    }

    public void pregunta2() {
        txtP2.setText("¿Qué es un bug?");
        txtP2.setBounds(50, 50, 500, 30);
        txtP2.setForeground(new Color(33, 150, 243));
        txtP2.setFont(new Font("Open Sans", Font.BOLD, 15));

        P21.setText("Programa");
        P21.setBounds(50, 100, 100, 30);
        P21.setForeground(new Color(33, 150, 243));
        P21.setFont(new Font("Open Sans", Font.BOLD, 13));

        P22.setText("Error"); // Correcta
        P22.setBounds(160, 100, 100, 30);
        P22.setForeground(new Color(33, 150, 243));
        P22.setFont(new Font("Open Sans", Font.BOLD, 13));

        P23.setText("Hardware");
        P23.setBounds(270, 100, 100, 30);
        P23.setForeground(new Color(33, 150, 243));
        P23.setFont(new Font("Open Sans", Font.BOLD, 13));

        Pgrupo2.add(P21);
        Pgrupo2.add(P22);
        Pgrupo2.add(P23);
        panel.add(txtP2);
        panel.add(P21);
        panel.add(P22);
        panel.add(P23);
    }

    public void pregunta3() {
        txtP3.setText("¿Qué es un sistema operativo?");
        txtP3.setBounds(50, 50, 500, 30);
        txtP3.setForeground(new Color(33, 150, 243));
        txtP3.setFont(new Font("Open Sans", Font.BOLD, 15));

        P31.setText("Hardware");
        P31.setBounds(50, 100, 100, 30);
        P31.setForeground(new Color(33, 150, 243));
        P31.setFont(new Font("Open Sans", Font.BOLD, 13));

        P32.setText("Software"); // Correcta
        P32.setBounds(160, 100, 100, 30);
        P32.setForeground(new Color(33, 150, 243));
        P32.setFont(new Font("Open Sans", Font.BOLD, 13));

        P33.setText("Red");
        P33.setBounds(270, 100, 100, 30);
        P33.setForeground(new Color(33, 150, 243));
        P33.setFont(new Font("Open Sans", Font.BOLD, 13));

        Pgrupo3.add(P31);
        Pgrupo3.add(P32);
        Pgrupo3.add(P33);
        panel.add(txtP3);
        panel.add(P31);
        panel.add(P32);
        panel.add(P33);
    }

    public void pregunta4() {
        txtP4.setText("¿Cuál es la unidad básica de información?");
        txtP4.setBounds(50, 50, 500, 30);
        txtP4.setForeground(new Color(33, 150, 243));
        txtP4.setFont(new Font("Open Sans", Font.BOLD, 15));

        P41.setText("Byte");
        P41.setBounds(50, 100, 100, 30);
        P41.setForeground(new Color(33, 150, 243));
        P41.setFont(new Font("Open Sans", Font.BOLD, 13));

        P42.setText("Bit"); // Correcta
        P42.setBounds(160, 100, 100, 30);
        P42.setForeground(new Color(33, 150, 243));
        P42.setFont(new Font("Open Sans", Font.BOLD, 13));

        P43.setText("Pixel");
        P43.setBounds(270, 100, 100, 30);
        P43.setForeground(new Color(33, 150, 243));
        P43.setFont(new Font("Open Sans", Font.BOLD, 13));

        Pgrupo4.add(P41);
        Pgrupo4.add(P42);
        Pgrupo4.add(P43);
        panel.add(txtP4);
        panel.add(P41);
        panel.add(P42);
        panel.add(P43);
    }

    public void pregunta5() {
        txtP5.setText("¿Qué hace un compilador?");
        txtP5.setBounds(50, 50, 500, 30);
        txtP5.setForeground(new Color(33, 150, 243));
        txtP5.setFont(new Font("Open Sans", Font.BOLD, 15));

        P51.setText("Convierte"); // Correcta
        P51.setBounds(50, 100, 100, 30);
        P51.setForeground(new Color(33, 150, 243));
        P51.setFont(new Font("Open Sans", Font.BOLD, 13));

        P52.setText("Ejecuta");
        P52.setBounds(160, 100, 100, 30);
        P52.setForeground(new Color(33, 150, 243));
        P52.setFont(new Font("Open Sans", Font.BOLD, 13));

        P53.setText("Almacena");
        P53.setBounds(270, 100, 100, 30);
        P53.setForeground(new Color(33, 150, 243));
        P53.setFont(new Font("Open Sans", Font.BOLD, 13));

        Pgrupo5.add(P51);
        Pgrupo5.add(P52);
        Pgrupo5.add(P53);
        panel.add(txtP5);
        panel.add(P51);
        panel.add(P52);
        panel.add(P53);
    }

    public void pregunta6() {
        txtP6.setText("¿Qué significa HTTP?");
        txtP6.setBounds(50, 50, 500, 30);
        txtP6.setForeground(new Color(33, 150, 243));
        txtP6.setFont(new Font("Open Sans", Font.BOLD, 15));

        P61.setText("Protocolo"); // Correcta
        P61.setBounds(50, 100, 100, 30);
        P61.setForeground(new Color(33, 150, 243));
        P61.setFont(new Font("Open Sans", Font.BOLD, 13));

        P62.setText("Interfaz");
        P62.setBounds(160, 100, 100, 30);
        P62.setForeground(new Color(33, 150, 243));
        P62.setFont(new Font("Open Sans", Font.BOLD, 13));

        P63.setText("Lenguaje");
        P63.setBounds(270, 100, 100, 30);
        P63.setForeground(new Color(33, 150, 243));
        P63.setFont(new Font("Open Sans", Font.BOLD, 13));

        Pgrupo6.add(P61);
        Pgrupo6.add(P62);
        Pgrupo6.add(P63);
        panel.add(txtP6);
        panel.add(P61);
        panel.add(P62);
        panel.add(P63);
    }

    public void pregunta7() {
        txtP7.setText("¿Qué es un algoritmo?");
        txtP7.setBounds(50, 50, 500, 30);
        txtP7.setForeground(new Color(33, 150, 243));
        txtP7.setFont(new Font("Open Sans", Font.BOLD, 15));

        P71.setText("Instrucción"); // Correcta
        P71.setBounds(50, 100, 100, 30);
        P71.setForeground(new Color(33, 150, 243));
        P71.setFont(new Font("Open Sans", Font.BOLD, 13));

        P72.setText("Lenguaje");
        P72.setBounds(160, 100, 100, 30);
        P72.setForeground(new Color(33, 150, 243));
        P72.setFont(new Font("Open Sans", Font.BOLD, 13));

        P73.setText("BBDD");
        P73.setBounds(270, 100, 100, 30);
        P73.setForeground(new Color(33, 150, 243));
        P73.setFont(new Font("Open Sans", Font.BOLD, 13));

        Pgrupo7.add(P71);
        Pgrupo7.add(P72);
        Pgrupo7.add(P73);
        panel.add(txtP7);
        panel.add(P71);
        panel.add(P72);
        panel.add(P73);
    }

    public void pregunta8() {
        txtP8.setText("¿Qué se utiliza para navegar por Internet?");
        txtP8.setBounds(50, 50, 500, 30);
        txtP8.setForeground(new Color(33, 150, 243));
        txtP8.setFont(new Font("Open Sans", Font.BOLD, 15));

        P81.setText("Editor");
        P81.setBounds(50, 100, 100, 30);
        P81.setForeground(new Color(33, 150, 243));
        P81.setFont(new Font("Open Sans", Font.BOLD, 13));

        P82.setText("Navegador");
        P82.setBounds(160, 100, 100, 30);
        P82.setForeground(new Color(33, 150, 243));
        P82.setFont(new Font("Open Sans", Font.BOLD, 13));

        P83.setText("Sistema");
        P83.setBounds(270, 100, 100, 30);
        P83.setForeground(new Color(33, 150, 243));
        P83.setFont(new Font("Open Sans", Font.BOLD, 13));

        Pgrupo8.add(P81);
        Pgrupo8.add(P82);
        Pgrupo8.add(P83);
        panel.add(txtP8);
        panel.add(P81);
        panel.add(P82);
        panel.add(P83);
    }

    public void pregunta9() {
        txtP9.setText("¿Cuál es la memoria volátil?");
        txtP9.setBounds(50, 50, 500, 30);
        txtP9.setForeground(new Color(33, 150, 243));
        txtP9.setFont(new Font("Open Sans", Font.BOLD, 15));

        P91.setText("ROM");
        P91.setBounds(50, 100, 100, 30);
        P91.setForeground(new Color(33, 150, 243));
        P91.setFont(new Font("Open Sans", Font.BOLD, 13));

        P92.setText("RAM");
        P92.setBounds(160, 100, 100, 30);
        P92.setForeground(new Color(33, 150, 243));
        P92.setFont(new Font("Open Sans", Font.BOLD, 13));

        P93.setText("Disco duro");
        P93.setBounds(270, 100, 100, 30);
        P93.setForeground(new Color(33, 150, 243));
        P93.setFont(new Font("Open Sans", Font.BOLD, 13));

        Pgrupo9.add(P91);
        Pgrupo9.add(P92);
        Pgrupo9.add(P93);
        panel.add(txtP9);
        panel.add(P91);
        panel.add(P92);
        panel.add(P93);
    }

    public void pregunta10() {
        txtP10.setText("¿Qué lenguaje tiene como logo una taza?");
        txtP10.setBounds(50, 50, 500, 30);
        txtP10.setForeground(new Color(33, 150, 243));
        txtP10.setFont(new Font("Open Sans", Font.BOLD, 15));

        P101.setText("Python");
        P101.setBounds(50, 100, 100, 30);
        P101.setForeground(new Color(33, 150, 243));
        P101.setFont(new Font("Open Sans", Font.BOLD, 13));

        P102.setText("Ruby");
        P102.setBounds(160, 100, 100, 30);
        P102.setForeground(new Color(33, 150, 243));
        P102.setFont(new Font("Open Sans", Font.BOLD, 13));

        P103.setText("Java");
        P103.setBounds(270, 100, 100, 30);
        P103.setForeground(new Color(33, 150, 243));
        P103.setFont(new Font("Open Sans", Font.BOLD, 13));

        Pgrupo10.add(P101);
        Pgrupo10.add(P102);
        Pgrupo10.add(P103);
        panel.add(txtP10);
        panel.add(P101);
        panel.add(P102);
        panel.add(P103);
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

    public void ocultarPregunta4() {
        txtP4.setVisible(false);
        P41.setVisible(false);
        P42.setVisible(false);
        P43.setVisible(false);
    }

    public void mostrarPregunta4() {
        txtP4.setVisible(true);
        P41.setVisible(true);
        P42.setVisible(true);
        P43.setVisible(true);
    }

    public void ocultarPregunta5() {
        txtP5.setVisible(false);
        P51.setVisible(false);
        P52.setVisible(false);
        P53.setVisible(false);
    }

    public void mostrarPregunta5() {
        txtP5.setVisible(true);
        P51.setVisible(true);
        P52.setVisible(true);
        P53.setVisible(true);
    }

    public void ocultarPregunta6() {
        txtP6.setVisible(false);
        P61.setVisible(false);
        P62.setVisible(false);
        P63.setVisible(false);
    }

    public void mostrarPregunta6() {
        txtP6.setVisible(true);
        P61.setVisible(true);
        P62.setVisible(true);
        P63.setVisible(true);
    }

    public void ocultarPregunta7() {
        txtP7.setVisible(false);
        P71.setVisible(false);
        P72.setVisible(false);
        P73.setVisible(false);
    }

    public void mostrarPregunta7() {
        txtP7.setVisible(true);
        P71.setVisible(true);
        P72.setVisible(true);
        P73.setVisible(true);
    }

    public void ocultarPregunta8() {
        txtP8.setVisible(false);
        P81.setVisible(false);
        P82.setVisible(false);
        P83.setVisible(false);
    }

    public void mostrarPregunta8() {
        txtP8.setVisible(true);
        P81.setVisible(true);
        P82.setVisible(true);
        P83.setVisible(true);
    }

    public void ocultarPregunta9() {
        txtP9.setVisible(false);
        P91.setVisible(false);
        P92.setVisible(false);
        P93.setVisible(false);
    }

    public void mostrarPregunta9() {
        txtP9.setVisible(true);
        P91.setVisible(true);
        P92.setVisible(true);
        P93.setVisible(true);
    }

    public void ocultarPregunta10() {
        txtP10.setVisible(false);
        P101.setVisible(false);
        P102.setVisible(false);
        P103.setVisible(false);
    }

    public void mostrarPregunta10() {
        txtP10.setVisible(true);
        P101.setVisible(true);
        P102.setVisible(true);
        P103.setVisible(true);
    }

    public boolean isPreguntaRespondida(ButtonGroup grupo) {
        return grupo.getSelection() != null;
    }

    public void botonAlante() {
        JButton botonAlante = new JButton();
        botonAlante.setBounds(160, 140, 84, 84);
        ImageIcon iconoAlante = new ImageIcon(getClass().getResource("/img/alante.png"));
        botonAlante.setContentAreaFilled(false);
        botonAlante.setBorderPainted(false);
        botonAlante.setFocusPainted(false);
        botonAlante.setIcon(iconoAlante);

        ActionListener aleatorio = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cont == 1 && isPreguntaRespondida(Pgrupo1)) {
                    if (P11.isSelected()) {
                        contAciertos++;
                    } else {
                        contFallos++;
                    }
                    ocultarPregunta1();
                    mostrarPregunta2();
                    Pgrupo1.clearSelection();
                    cont++;
                } else if (cont == 2 && isPreguntaRespondida(Pgrupo2)) {
                    if (P22.isSelected()) {
                        contAciertos++;
                    } else {
                        contFallos++;
                    }
                    ocultarPregunta2();
                    mostrarPregunta3();
                    Pgrupo2.clearSelection();
                    cont++;
                } else if (cont == 3 && isPreguntaRespondida(Pgrupo3)) {
                    if (P32.isSelected()) {
                        contAciertos++;
                    } else {
                        contFallos++;
                    }
                    ocultarPregunta3();
                    mostrarPregunta4();
                    Pgrupo3.clearSelection();
                    cont++;
                } else if (cont == 4 && isPreguntaRespondida(Pgrupo4)) {
                    if (P42.isSelected()) {
                        contAciertos++;
                    } else {
                        contFallos++;
                    }
                    ocultarPregunta4();
                    mostrarPregunta5();
                    Pgrupo4.clearSelection();
                    cont++;
                } else if (cont == 5 && isPreguntaRespondida(Pgrupo5)) {
                    if (P51.isSelected()) {
                        contAciertos++;
                    } else {
                        contFallos++;
                    }
                    ocultarPregunta5();
                    mostrarPregunta6();
                    Pgrupo5.clearSelection();
                    cont++;
                } else if (cont == 6 && isPreguntaRespondida(Pgrupo6)) {
                    if (P61.isSelected()) {
                        contAciertos++;
                    } else {
                        contFallos++;
                    }
                    ocultarPregunta6();
                    mostrarPregunta7();
                    Pgrupo6.clearSelection();
                    cont++;
                } else if (cont == 7 && isPreguntaRespondida(Pgrupo7)) {
                    if (P71.isSelected()) {
                        contAciertos++;
                    } else {
                        contFallos++;
                    }
                    ocultarPregunta7();
                    mostrarPregunta8();
                    Pgrupo7.clearSelection();
                    cont++;
                } else if (cont == 8 && isPreguntaRespondida(Pgrupo8)) {
                    if (P82.isSelected()) {
                        contAciertos++;
                    } else {
                        contFallos++;
                    }
                    ocultarPregunta8();
                    mostrarPregunta9();
                    Pgrupo8.clearSelection();
                    cont++;
                } else if (cont == 9 && isPreguntaRespondida(Pgrupo9)) {
                    if (P92.isSelected()) {
                        contAciertos++;
                    } else {
                        contFallos++;
                    }
                    ocultarPregunta9();
                    mostrarPregunta10();
                    Pgrupo9.clearSelection();
                    cont++;
                } else if (cont == 10 && isPreguntaRespondida(Pgrupo10)) {
                    if (P103.isSelected()) {
                        contAciertos++;
                    } else {
                        contFallos++;
                    }
                    ocultarPregunta10();
                    Pgrupo10.clearSelection();
                    cont++;
                    checkEntrega.setVisible(true);
                    botonAlante.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(frame, "Selecciona una respuesta");

                }
                System.out.println("Aciertos" + contAciertos);
                System.out.println("Fallos" + contFallos);

            }
        };
        botonAlante.addActionListener(aleatorio);

        panel.add(botonAlante);
    }

    public void botonEntregar() {
        checkEntrega.setText("¿Quieres entregar?");
        checkEntrega.setBounds(100, 100, 200, 30);
        checkEntrega.setVisible(false);
        checkEntrega.setFont(new Font("Open Sans", Font.BOLD, 15)); // Ajusta según tu necesidad
        checkEntrega.setForeground(new Color(33, 150, 243)); // Color de texto azul claro
        // Configuración del font y foreground del JCheckBox
        checkEntrega.setFont(new Font("Open Sans", Font.BOLD, 15)); // Ajusta según tu necesidad
        checkEntrega.setForeground(new Color(33, 150, 243)); // Color de texto azul claro

        checkEntrega.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnEntregar.setVisible(true);
            }
        });

        panel.add(checkEntrega);
    }

    public void botonCheckExamen() {
        btnEntregar.setText("Ver resultados");
        btnEntregar.setBounds(125, 150, 150, 30);
        btnEntregar.setVisible(false);
        btnEntregar.setFont(new Font("Open Sans", Font.BOLD, 15)); // Ajusta según tu necesidad
        btnEntregar.setForeground(new Color(33, 150, 243)); // Color de texto azul claro
        btnEntregar.setFont(new Font("Open Sans", Font.BOLD, 15)); // Ajusta según tu necesidad
        btnEntregar.setForeground(new Color(33, 150, 243)); // Color de texto azul claro

        btnEntregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkEntrega.isSelected()) {
                    frame.dispose();
                    // Suponiendo que `ventana` es una instancia de tu clase Ventana donde se muestran los resultados
                    ventana.setVisible(true);
                    System.out.println("Aciertos antes de entregar: " + contAciertos);
                    System.out.println("Fallos antes de entregar: " + contFallos);
                    ventana.recibirDatos(contAciertos, contFallos);
                }
            }
        });

        panel.add(btnEntregar);
    }

    int cont = 1;
    int contAciertos = 0;
    int contFallos = 0;
}
