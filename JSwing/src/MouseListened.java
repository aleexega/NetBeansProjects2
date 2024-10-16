
import JSwing.Ventana;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListened extends JFrame implements MouseListener, MouseMotionListener {

    JTextArea mostrarEstado=new JTextArea("Interacción del mouse aparecerá aquí.");

    public MouseListened() {
        // Configurar el JFrame
        setTitle("Ejemplo de MouseListened en Java");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel que escuche los eventos del mouse
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.addMouseListener(this);
        panel.addMouseMotionListener(this);

        // Etiqueta para mostrar el estado del mouse
        mostrarEstado.setBounds(0, 0, 400, 300);

        // Añadir el panel y la etiqueta al JFrame
        add(panel, BorderLayout.CENTER);
        add(mostrarEstado, BorderLayout.SOUTH);

        setVisible(true);
    }

    // Implementación de los métodos de MouseListener
    @Override
    public void mouseClicked(MouseEvent e) {
        mostrarEstado.append("Mouse clicado"+"\n");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mostrarEstado.append("Mouse presionado"+"\n");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mostrarEstado.append("Mouse liberado"+"\n");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        mostrarEstado.append("Mouse entró en el panel"+"\n");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mostrarEstado.append("Mouse salió del panel"+"\n");
    }



    public static void main(String[] args) {
        MouseListened ventana = new MouseListened();
        ventana.Panel();
        JPanel panel=new JPanel();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void Panel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
