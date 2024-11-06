package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class G_Form_H extends JFrame {
    private JButton VOLVERButton;
    private JPanel Form;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton SIGUIENTEButton;

    public G_Form_H() {
        setSize(900, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Form);
        F_Form_H form = new F_Form_H();
        VOLVERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form.setVisible(true);
                dispose();
            }
        });

    }
}
