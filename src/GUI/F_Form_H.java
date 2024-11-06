package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class F_Form_H extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JButton SIGUIENTEButton;
    private JButton VOLVERButton;
    private JComboBox comboBox1;
    private JComboBox comboBox2;

    public F_Form_H() {
        setSize(900, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        VOLVERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                E_Form_H form = new E_Form_H();
                form.setVisible(true);
                dispose();
            }
        });
        SIGUIENTEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                G_Form_H form_t = new G_Form_H();
                form_t.setVisible(true);
                dispose();
            }
        });
    }
}
