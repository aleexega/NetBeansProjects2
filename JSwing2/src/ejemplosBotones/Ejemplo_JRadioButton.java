/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosBotones;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author FP
 */
public class Ejemplo_JRadioButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de JRadioButton");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        JRadioButton radioButton1 = new JRadioButton("Opción 1");
        JRadioButton radioButton2 = new JRadioButton("Opción 2");
        JRadioButton radioButton3 = new JRadioButton("Opción 3");
        
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);
        
        JPanel panel = new JPanel();
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
