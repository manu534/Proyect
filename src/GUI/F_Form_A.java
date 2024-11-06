package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class F_Form_A extends JFrame {
    private JTextField textField1;
    private JButton SIGUIENTEButton;
    private JButton VOLVERButton;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JPanel Form;

    public F_Form_A() {
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Form);

        SIGUIENTEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                G_Form_A form = new G_Form_A();
                form.setVisible(true);
                dispose();
            }
        });
        VOLVERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                E_Form_A form = new E_Form_A();
                form.setVisible(true);
                dispose();
            }
        });
    }
}
