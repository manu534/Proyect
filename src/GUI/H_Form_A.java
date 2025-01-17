package GUI;

import Logic.Actor;
import Logic.AntiHeroe;
import Logic.GestorPersonajes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H_Form_A extends JFrame {
    private JTextField txt_nombrepelicula;
    private JTextField txt_personaje;
    private JButton VOLVERButton;
    private JButton SIGUIENTEButton;
    private JPanel form;
    private JTextField txt_aino;
    private JButton añadirPeliculaButton;
    GestorPersonajes gestorPersonajes;
    AntiHeroe antiHeroe;
    Actor actor;
    public H_Form_A(GestorPersonajes gestorPersonajes, AntiHeroe antiheroe, Actor actor) {
        this.antiHeroe = antiheroe;
        this.actor=actor;
        setSize(900, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(form);
        VOLVERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                G_Form_A form = new G_Form_A(gestorPersonajes,antiHeroe);
                form.setVisible(true);
                dispose();
            }
        });

        SIGUIENTEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        añadirPeliculaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Captura papel

                String titulo = txt_nombrepelicula.getText();
                int anio = Integer.parseInt(txt_aino.getText());
                String personaje = txt_personaje.getText();

                // Validar datos

                if (titulo.isEmpty() || personaje.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
                    return;
                }

                // Crear un nuevo objeto

                Actor.Papel nuevoPapel = new Actor.Papel(titulo, anio, personaje);

                // Agrega el papel al actor

                antiheroe.getActor().getPeliculas().add(nuevoPapel);

                // Limpiar campos del formulario

                txt_nombrepelicula.setText("");
                txt_aino.setText("");
                txt_personaje.setText("");
            }
        });
    }
}
