/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alejandrovega_parejas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Alejandro
 */

public class Juego {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    ArrayList<JButton> buttons = new ArrayList<>();
    ArrayList<String> images = new ArrayList<>();
    JButton firstCard = null;
    JButton secondCard = null;
    Timer flipBackTimer;
    int pairsFound = 0;
    ImageIcon cardBack = new ImageIcon("src/img/fondoCartas.jpg"); // Imagen de reverso de la carta
    ImageIcon winImage = new ImageIcon("src/img/amador.jpg"); // Imagen a mostrar al ganar

    public Juego() {
        // Configuración de la ventana del juego
        frame.setTitle("Juego de Memoria - Emparejar cartas");
        frame.setBounds(500, 200, 800, 600); // Ajustar el tamaño del marco
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configuración del panel del juego
        panel.setSize(frame.getWidth(), frame.getHeight());
        panel.setLayout(new GridLayout(2, 3)); // 2 filas, 3 columnas
        frame.add(panel);

        // Añadir 3 parejas de imágenes (6 en total) a la lista
        images.add("src/img/amador.jpg"); // Imagen 1
        images.add("src/img/amador.jpg"); // Pareja 1
        images.add("src/img/recio.jpg");  // Imagen 2
        images.add("src/img/recio.jpg");  // Pareja 2
        images.add("src/img/coque.jpg");  // Imagen 3
        images.add("src/img/coque.jpg");  // Pareja 3

        // Mezclar las imágenes de manera aleatoria
        Collections.shuffle(images);

        // Crear los botones de las cartas con reverso inicialmente
        for (int i = 0; i < 6; i++) {
            JButton button = new JButton();
            button.setPreferredSize(new Dimension(250, 376)); // Establecer el tamaño del botón
            button.setIcon(resizeImage(cardBack.getImage(), 250, 376)); // Asignar el reverso a la carta
            button.setActionCommand(images.get(i)); // Guardar la imagen de anverso
            
            // Configuración para eliminar la capa gris
            button.setContentAreaFilled(false); // Quitar la capa gris
            button.setBorderPainted(false); // Quitar el borde
            button.setFocusPainted(false); // Quitar el efecto de foco

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    cardClicked(button);
                }
            });
            buttons.add(button);
            panel.add(button);  // Añadir botón al panel
        }

        // Hacer visible la ventana del juego
        frame.setVisible(true);
    }

    // Método para redimensionar imágenes
    private ImageIcon resizeImage(Image img, int newW, int newH) {
        Image resizedImage = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }

    // Método que maneja la lógica del clic en las cartas
    private void cardClicked(JButton clickedButton) {
        // No permitir clics si ya hay dos cartas seleccionadas
        if (firstCard != null && secondCard != null) {
            return;
        }

        // Mostrar la imagen de la carta seleccionada
        ImageIcon cardImage = resizeImage(new ImageIcon(clickedButton.getActionCommand()).getImage(), 250, 376); // Ajustar el tamaño
        clickedButton.setIcon(cardImage);

        if (firstCard == null) {
            firstCard = clickedButton; // Primera carta seleccionada
        } else {
            secondCard = clickedButton; // Segunda carta seleccionada

            // Comprobar si las cartas coinciden
            if (firstCard.getActionCommand().equals(secondCard.getActionCommand())) {
                pairsFound++;
                // Deshabilitar las cartas emparejadas
                firstCard.setEnabled(false);
                secondCard.setEnabled(false);

                // Reiniciar las selecciones
                firstCard = null;
                secondCard = null;

                // Comprobar si se han encontrado todas las parejas
                if (pairsFound == 3) {
                    showWinMessage(); // Mostrar el mensaje de victoria
                }
            } else {
                // Si las cartas no coinciden, darlas la vuelta tras 1 segundo
                flipBackTimer = new Timer();
                flipBackTimer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        // Volver a mostrar el reverso de las cartas
                        SwingUtilities.invokeLater(() -> {
                            firstCard.setIcon(resizeImage(cardBack.getImage(), 250, 376));
                            secondCard.setIcon(resizeImage(cardBack.getImage(), 250, 376));
                            firstCard = null; // Reiniciar primero
                            secondCard = null; // Reiniciar segundo
                        });
                    }
                }, 1000);
            }
        }
    }

    // Método para mostrar el mensaje de victoria
    private void showWinMessage() {
        JOptionPane.showMessageDialog(frame, "HAS GANADO", "Victoria", JOptionPane.INFORMATION_MESSAGE, winImage);
        int response = JOptionPane.showConfirmDialog(frame, "¿Quieres jugar de nuevo?", "Juego terminado", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            resetGame();
        } else {
            frame.dispose();  // Cierra el juego
        }
    }

    // Método para reiniciar el juego
    private void resetGame() {
        Collections.shuffle(images);
        for (int i = 0; i < 6; i++) {
            buttons.get(i).setIcon(resizeImage(cardBack.getImage(), 250, 376)); // Ajusta el tamaño
            buttons.get(i).setEnabled(true);
            buttons.get(i).setActionCommand(images.get(i));
        }
        pairsFound = 0;
        firstCard = null;
        secondCard = null;
    }
}

