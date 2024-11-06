package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class G_Form_A extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton VOLVERButton;
    private JButton SIGUIENTEButton;
    private JPanel Form;

    public G_Form_A() {
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Form);
        VOLVERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                F_Form_A form = new F_Form_A();
                form.setVisible(true);
                dispose();
            }
        });
    }
}
