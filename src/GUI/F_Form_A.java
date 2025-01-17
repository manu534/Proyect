package GUI;

import Logic.AntiHeroe;
import Logic.GestorPersonajes;
import Logic.Poder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class F_Form_A extends JFrame {

    private JTextField txt_nombre;
    private JButton SIGUIENTEButton;
    private JButton VOLVERButton;
    private JComboBox combobox_Nivel;
    private JComboBox comobobox_Tipo;
    private JPanel Form;
    private JTextField txt_Decripcion;
    private JButton añadirPoderButton;
    GestorPersonajes gestorPersonajes;
    AntiHeroe antiheroe;

    public F_Form_A(GestorPersonajes gestorPersonajes, AntiHeroe antiHeroe) {
        this.gestorPersonajes = gestorPersonajes;
        this.antiheroe = antiHeroe;
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Form);
        SIGUIENTEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    G_Form_A form = new G_Form_A(gestorPersonajes, antiheroe);
                    form.setVisible(true);
                    dispose();

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al procesar los datos: " + ex.getMessage());
                }
            }
        });
        VOLVERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                E_Form_A form = new E_Form_A(gestorPersonajes, antiheroe);
                form.setVisible(true);
                dispose();
            }
        });
        añadirPoderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Poder nuevoPoder = new Poder();

                // Capturar datos del poder
                String nombrePoder = txt_nombre.getText();
                int nivel = Integer.parseInt((String) Objects.requireNonNull(combobox_Nivel.getSelectedItem()));
                String tipoStr = (String) comobobox_Tipo.getSelectedItem();
                String descripcion = txt_Decripcion.getText();

                Poder.Tipo tipo = Poder.Tipo.valueOf(tipoStr);

                // Validar datos

                if (nombrePoder.isEmpty() || descripcion.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
                    return;
                }

                nuevoPoder.setPoder(nombrePoder);
                nuevoPoder.setNivel(nivel);
                nuevoPoder.setTipo(tipo);
                nuevoPoder.setDescripcion(descripcion);

                // Añadir poder

                antiheroe.agregarPoder(nuevoPoder);

                //Limpiar campos del Formulario

                txt_nombre.setText("");
                combobox_Nivel.setSelectedIndex(0);
                comobobox_Tipo.setSelectedIndex(0);
                txt_Decripcion.setText("");
            }
        });
    }
}
