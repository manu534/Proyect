package GUI;

import Logic.AntiHeroe;
import Logic.Poder;

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

    public F_Form_A(AntiHeroe antiHeroe) {
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Form);

        if (antiHeroe != null && antiHeroe.getPoder() != null) {
            textField1.setText(antiHeroe.getPoder().getNombre());
            comboBox1.setSelectedItem(String.valueOf(antiHeroe.getPoder().getLevel()));
            comboBox2.setSelectedItem(antiHeroe.getPoder().getTipo());
        }

        String name = antiHeroe.getName();
        int age = antiHeroe.getAge();
        String descripcion = antiHeroe.getDescripcion();
        String frase = antiHeroe.getFrase();
        SIGUIENTEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = textField1.getText();
                int level = Integer.parseInt((String) comboBox1.getSelectedItem());
                String tipo = (String) comboBox2.getSelectedItem();
                if (nombre.isEmpty()  || tipo == null) {
                    JOptionPane.showMessageDialog(F_Form_A.this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                Poder poder = antiHeroe.getPoder();
                poder.setNombre(nombre);
                poder.setLevel(level);
                poder.setTipo(tipo);
                G_Form_A form = new G_Form_A(antiHeroe);
                form.setVisible(true);
                dispose();
            }
        });
        VOLVERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                E_Form_A form = new E_Form_A(antiHeroe);
                form.setVisible(true);
                dispose();
            }
        });
    }
}
