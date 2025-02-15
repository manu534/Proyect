package GUI;

import Logic.AntiHeroe;
import Logic.GestorPersonajes;
import Logic.Personaje;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class D_List_A extends JFrame {

    private JPanel Panal;
    private JButton AÑADIRANTIHÉROEButton;
    private JButton ELIMINARANTIHÉROEButton;
    private JButton DEVOLVERSEButton;
    private JButton SALIRButton;
    private GestorPersonajes gestorPersonajes;

    public D_List_A(GestorPersonajes gestorPersonajes) {
        this.gestorPersonajes = gestorPersonajes;
        setSize(2560, 1440);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Panal);


        DEVOLVERSEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                C_Choose back=new C_Choose();
                back.setVisible(true);
                dispose();
            }
        });
        SALIRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        AÑADIRANTIHÉROEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                E_Form_A form=new E_Form_A(gestorPersonajes, null);
                form.setVisible(true);
                dispose();
            }
        });
    }
}
