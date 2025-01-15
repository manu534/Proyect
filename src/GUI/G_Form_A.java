package GUI;

import Logic.Actor;
import Logic.AntiHeroe;
import Logic.Poder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.util.ArrayList;

public class G_Form_A extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton VOLVERButton;
    private JButton SIGUIENTEButton;
    private JPanel Form;
    private JTextField textField4;

    public G_Form_A(AntiHeroe antiHeroe) {
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Form);
        if (antiHeroe != null && antiHeroe.getActor() != null) {
            textField1.setText(antiHeroe.getActor().getNombre());
            textField2.setText(String.valueOf(antiHeroe.getActor().getEdad()));
            textField3.setText(antiHeroe.getActor().getPais());
            textField4.setText(String.valueOf(antiHeroe.getActor().getEstatura()));
        }
        VOLVERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                F_Form_A form= new F_Form_A(antiHeroe);
               form.setVisible(true);
                dispose();
            }
        });
        SIGUIENTEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = textField1.getText();
                int edad = Integer.parseInt(textField2.getText());
                String pais = textField3.getText();
                double estatura = Double.parseDouble(textField4.getText());
                Poder poder = antiHeroe.getPoder();
                String descripcion = antiHeroe.getDescripcion();
                String frase = antiHeroe.getFrase();
                Actor actor = new Actor(nombre, edad, pais, estatura, 0, new ArrayList<>(), poder, descripcion, frase);
                antiHeroe.setActor(actor);
                H_Form_A form = new H_Form_A(antiHeroe);
                form.setVisible(true);
                dispose();


            }
        });
    }
}
