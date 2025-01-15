package GUI;

import Logic.AntiHeroe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class E_Form_A extends JFrame {
    private JTextField txtName_A;
    private JTextField txtAge_A;
    private JButton SIGUIENTEButton;
    private JTextField txtDescription_A;
    private JTextField txt_sentence_A;
    private JPanel Form;
    public E_Form_A() {
        this(null);
    }
    public E_Form_A(AntiHeroe antiHeroe) {
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Form);
        if (antiHeroe != null)
        {
            txtName_A.setText(antiHeroe.getName());
            txtAge_A.setText(String.valueOf(antiHeroe.getAge()));
            txtDescription_A.setText(antiHeroe.getDescripcion());
            txt_sentence_A.setText(antiHeroe.getFrase());
        }
        SIGUIENTEButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String name = txtName_A.getText();
                String ageStr = txtAge_A.getText();
                String descripcion = txtDescription_A.getText();
                String frase = txt_sentence_A.getText();
                if (name.isEmpty() || ageStr.isEmpty() || descripcion.isEmpty() || frase.isEmpty()) {
                    JOptionPane.showMessageDialog(E_Form_A.this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                try {
                    int age = Integer.parseInt(ageStr);

                    AntiHeroe antiHeroe = new AntiHeroe(name, age, descripcion, frase);
                    F_Form_A form = new F_Form_A(antiHeroe);
                    form.setVisible(true);
                    dispose();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(E_Form_A.this, "La edad debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
