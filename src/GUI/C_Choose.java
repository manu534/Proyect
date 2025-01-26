package GUI;

import Logic.GestorPersonajes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C_Choose extends JFrame {
    private JPanel panel1;
    private JButton HÉROESButton;
    private JButton ANTIHÉROESButton;

    public C_Choose() {
        setSize(2560,1440);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        GestorPersonajes gestorPersonajes = new GestorPersonajes();
        HÉROESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                D_List_H second = new D_List_H();
                second.setVisible(true);
                dispose();
            }
        });
        ANTIHÉROESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                D_List_A second = new D_List_A(gestorPersonajes);
                second.setVisible(true);
                dispose();
            }
        });
    }
}
