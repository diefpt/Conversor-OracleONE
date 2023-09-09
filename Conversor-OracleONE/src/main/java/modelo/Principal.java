package modelo;

import javax.swing.*;
import java.awt.*;

public class Principal {
    public static void main(String[] args) {

        JFrame miJFrame = new JFrame("Ejemplo - Java Swing");
        miJFrame.setSize(500, 300);

        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300, 300);
        miJPanel.setLayout(new GridBagLayout());

        JLabel miJLabel = new JLabel();
        miJLabel.setText("Dime tu opinión acerca de Java Swing");

        JTextArea miJTextArea = new JTextArea(5, 20);

        miJPanel.add(miJLabel);
        miJPanel.add(miJTextArea);
        miJFrame.add(miJPanel);

        miJFrame.setVisible(true);


        JOptionPane.showInputDialog(null, "Dolar");
    }
}
