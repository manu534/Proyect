package GUI;

import Logic.Heroe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E_Form_H extends JFrame {
    private JTextField txtName_H;
    private JTextField txtAge_H;
    private JTextField txtDescription_H;
    private JTextField txt_sentence_H;
    private JButton SIGUIENTEButton;
    private JPanel Form;

    public E_Form_H() {
        setSize(900, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Form);

        SIGUIENTEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                F_Form_H form = new F_Form_H();
                form.setVisible(true);
                dispose();
            }
        });
    }
}
