package GUI;

import Logic.Actor;
import Logic.AntiHeroe;
import Logic.GestorPersonajes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

public class G_Form_A extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton VOLVERButton;
    private JButton SIGUIENTEButton;
    private JPanel Form;
    GestorPersonajes gestorPersonajes;
    AntiHeroe antiHeroe;

    public G_Form_A(GestorPersonajes gestorPersonajes, AntiHeroe antiheroe) {
        this.gestorPersonajes = gestorPersonajes;
        this.antiHeroe = antiheroe;
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Form);

        VOLVERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                F_Form_A form = new F_Form_A(gestorPersonajes, antiHeroe);
                form.setVisible(true);
                dispose();
            }
        });
        SIGUIENTEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Capturar datos del actor

                    String nombreActor = textField1.getText();
                    int anioNacimiento = Integer.parseInt(textField2.getText());
                    String nacionalidad = textField3.getText();

                    // Validar datos
                    if (nombreActor.isEmpty() || nacionalidad.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
                        return;
                    }

                    // Calcular la edad del actor

                    int edadActor = Calendar.getInstance().get(Calendar.YEAR) - anioNacimiento;

                    // Crear un nuevo objeto Actor

                    Actor nuevoActor = new Actor(
                            antiHeroe.getId(),
                            nombreActor,
                            edadActor,
                            nacionalidad,
                            new ArrayList<>()

                    );

                    // Asociar el Actor al AntiHeroe

                    antiheroe.setActor(nuevoActor);
                    antiheroe.setId(gestorPersonajes.generarId());
                    antiheroe.setEdad(edadActor);
                    antiheroe.setNacionalidad(nacionalidad);

                    // Agregar el AntiHeroe al GestorPersonajes

                    gestorPersonajes.crearPersonaje(antiheroe);

                    H_Form_A form = new H_Form_A(gestorPersonajes, antiheroe, nuevoActor); // Pasar el Actor
                    form.setVisible(true);
                    dispose();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al procesar los datos: " + ex.getMessage());
                }
            }
        });
    }
}