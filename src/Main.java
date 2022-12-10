import MultiplyTable.MultiplyTable;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Main {
    public Main() {

        final JFrame window = new JFrame();
        window.setSize(1200, 800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new BorderLayout());
        window.setVisible(true);
        window.setLocationRelativeTo(null);

        final JFrame multiply = new JFrame();

        window.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.NOBUTTON) {
                    window.add(new JLabel("No button clicked..."));
                } else if (e.getButton() == MouseEvent.BUTTON1) {
                    multiply.add(new JTextArea(new MultiplyTable().draw()));
                    multiply.setVisible(true);
                    multiply.setLocation(e.getX(), e.getY());
                    multiply.setSize(400, 400);
                }

                System.out.println("Number of click: " + e.getClickCount());
                System.out.println("Click position (X, Y):  " + e.getX() + ", " + e.getY());
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}
