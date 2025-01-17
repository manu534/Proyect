package Logic;

import java.util.List;
public class Actor extends Persona{

    //Atributos

    private List<Papel> peliculas;

    //Constructor

    public Actor(int id, String nombre, int edad, String nacionalidad, List<Papel> peliculas) {
        super(id, nombre, edad, nacionalidad);
        this.peliculas = peliculas;


    }

    //Getters y setters actor

    public List<Papel> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Papel> peliculas) {
        this.peliculas = peliculas;
    }

    //Clase papel

    public static class Papel{
        private String titulo;
        private int anio;
        private String personaje;

        public Papel(String titulo, int anio, String personaje) {
            this.titulo = titulo;
            this.anio = anio;
            this.personaje = personaje;
        }

        // Getters y setters

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public int getAnio() {
            return anio;
        }

        public void setAnio(int anio) {
            this.anio = anio;
        }

        public String getPersonaje() {
            return personaje;
        }

        public void setPersonaje(String personaje) {
            this.personaje = personaje;
        }

    }
}

