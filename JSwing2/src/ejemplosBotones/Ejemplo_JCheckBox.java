/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosBotones;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author FP
 */
public class Ejemplo_JCheckBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de JCheckBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        JCheckBox checkBox1 = new JCheckBox("Opción A");
        JCheckBox checkBox2 = new JCheckBox("Opción B");     
        
        JPanel panel = new JPanel();
        panel.add(checkBox1);
        panel.add(checkBox2);
        
        frame.add(panel);
        frame.setVisible(true);
    }

}
