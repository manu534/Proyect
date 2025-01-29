package Logic;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

public class GestorPersonajes {

    //Atributos

    private List<Personaje> personajes;
    private int siguienteId = 1;

    //Constructor

    public GestorPersonajes() {
        this.personajes = new ArrayList<>();
    }

    // Métodos personajes

    public int generarId() {
        return siguienteId++;
    }

    public void crearPersonaje(Personaje personaje) {
        if (personaje == null) {
            throw new IllegalArgumentException("El personaje no puede ser null");
        }
        if (personaje.getNombreActor() == null || personaje.getNombreActor().isEmpty()) {
            throw new IllegalArgumentException("El nombre del personaje no puede ser vacío");
        }
        this.personajes.add(personaje);
    }

    public void modificarPersonaje(Personaje personaje) {
        for (int i = 0; i < personajes.size(); i++) {
            if (personajes.get(i).getId() == personaje.getId()) {
                personajes.set(i, personaje);
                break;
            }
        }
    }

    public void eliminarPersonaje(Personaje personaje) {
        if (personaje != null) {
            int confirmacion = JOptionPane.showConfirmDialog(null,
                    "¿Estás seguro de que quieres eliminar este personaje?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                this.personajes.remove(personaje);
            }
        }
    }

    public Personaje buscarPersonaje(String nombre) {
        for (Personaje personaje : personajes) {
            if (personaje.getNombreActor().equalsIgnoreCase(nombre)) {
                return personaje;
            }
        }
        return null;
    }

    //Txt

    public void guardarDatosTXT(String nombreArchivo) {
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            for (Personaje personaje : personajes) {

                writer.write("Personaje: " + personaje.getNombreReal() + "\n");
                writer.write("  ID: " + personaje.getId() + "\n");
                writer.write("  Alias: " + personaje.getNombreActor() + "\n");
                writer.write("  Edad: " + personaje.getEdad() + "\n");
                writer.write("  Nacionalidad: " + personaje.getNacionalidad() + "\n");
                if (personaje instanceof AntiHeroe) {
                    AntiHeroe antiheroe = (AntiHeroe) personaje;
                    writer.write("  Frase Célebre: " + antiheroe.getFrase() + "\n");
                    writer.write("  Métodos Cuestionables: " + String.join(", ", antiheroe.getMetodosCuestionables()) + "\n");
                }
                // Escribir la información de los poderes

                writer.write("  Poderes:\n");
                for (Poder poder : personaje.getPoderes()) {
                    writer.write("    - " + poder.getPoder() + "\n");
                    writer.write("      Nivel: " + poder.getNivel() + "\n");
                    writer.write("      Tipo: " + poder.getTipo() + "\n");
                    writer.write("      Descripción: " + poder.getDescripcion() + "\n");
                }
                // Escribir la información del actor

                if (personaje.getActor() != null) {
                    Actor actor = personaje.getActor();
                    writer.write("  Actor: " + actor.getNombreActor() + "\n");
                    writer.write("    Edad: " + actor.getEdad() + "\n");
                    writer.write("    Nacionalidad: " + actor.getNacionalidad() + "\n");
                    // Escribir la información de las películas del actor
                    writer.write("    Películas:\n");
                    for (Actor.Papel papel : actor.getPeliculas()) {
                        writer.write("      - " + papel.getTitulo() + "\n");
                        writer.write("        Año: " + papel.getAnio() + "\n");
                        writer.write("        Personaje: " + papel.getPersonaje() + "\n");
                    }
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            System.err.println("Error al guardar los datos en el archivo TXT: " + e.getMessage());
        }
    }

    // Getters y setters

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public int getSiguienteId() {
        return siguienteId;
    }

    public void setSiguienteId(int siguienteId) {
        this.siguienteId = siguienteId;
    }
}
