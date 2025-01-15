package GUI;

import Logic.AntiHeroe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H_Form_A extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton VOLVERButton;
    private JButton SIGUIENTEButton;
    private JPanel form;

    public H_Form_A(AntiHeroe antiHeroe) {
        setSize(900, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(form);

        VOLVERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                G_Form_A form = new G_Form_A(antiHeroe);
                form.setVisible(true);
                dispose();
            }
        });

        SIGUIENTEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(H_Form_A.this, "Antihéroe registrado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                D_List_A form = new D_List_A(antiHeroe); // Pasar el AntiHeroe a D_List_A
                form.setVisible(true);
                dispose();
            }
        });
    }
}
