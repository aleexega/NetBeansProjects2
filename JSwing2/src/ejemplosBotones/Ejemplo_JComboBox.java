/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosBotones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author FP
 */
public class Ejemplo_JComboBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de JComboBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        String[] opciones = { "Opción 1", "Opción 2", "Opción 3" };
        JComboBox<String> comboBox = new JComboBox<>(opciones);
        
        JPanel panel = new JPanel();
        panel.add(comboBox);
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
