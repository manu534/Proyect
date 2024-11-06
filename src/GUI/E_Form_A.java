package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E_Form_A extends JFrame {
    private JTextField txtName_A;
    private JTextField txtAge_A;
    private JButton SIGUIENTEButton;
    private JTextField txtDescription_A;
    private JTextField txt_sentence_A;
    private JPanel Form;

    public E_Form_A() {
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Form);
        SIGUIENTEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                F_Form_A form = new F_Form_A();
                form.setVisible(true);
                dispose();
            }
        });
    }
}
