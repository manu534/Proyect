package GUI;

import Logic.AntiHeroe;
import Logic.GestorPersonajes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class E_Form_A extends JFrame {

    private JTextField txtName_A;
    private JTextField txtFrase_A;
    private JTextField txt_Metodos_A;
    private JButton SIGUIENTEButton;
    private JPanel Form;
    private JSpinner Edad_Jspiner;
    private JTextField Alias;
    GestorPersonajes gestorPersonajes;
     AntiHeroe antiheroe;


    public E_Form_A(GestorPersonajes gestorPersonajes,AntiHeroe antiHeroe) {
        this.antiheroe = antiHeroe;
        this.gestorPersonajes = gestorPersonajes;
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Form);
        SIGUIENTEButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try {

                    String alias = Alias.getText();
                    String frase = txtFrase_A.getText();
                    int edad = (int) Edad_Jspiner.getValue();
                    String metodosStr = txt_Metodos_A.getText();
                    List<String> metodosCuestionables = Arrays.asList(metodosStr.split(";"));
                    String nombreReal = txtName_A.getText();

                    if (alias.isEmpty() || frase.isEmpty() || metodosCuestionables.isEmpty() || nombreReal.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
                        return;
                    }

                    AntiHeroe antiheroeTemp = new AntiHeroe(gestorPersonajes.generarId(),"",0,"",alias,nombreReal,edad,frase);

                    antiheroeTemp.setMetodosCuestionables(metodosCuestionables);

                    F_Form_A form = new F_Form_A(gestorPersonajes, antiheroeTemp);
                    form.setVisible(true);
                    dispose();

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al procesar los datos: " + ex.getMessage());
                }
            }
        });
    }
}
