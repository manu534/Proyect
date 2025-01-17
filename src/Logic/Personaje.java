package Logic;

import java.util.ArrayList;
import java.util.List;

public class Personaje extends Persona {

    //Atributos
    private String nombreReal;
    private String alias;
    private int edadPersonaje;
    private List<Poder> poderes;
    private Actor actor;

    //Constructor

    public Personaje(int id, String nombreActor, int edadActor, String nacionalidad, String alias, String nombreReal, int edadPersonaje) {
        super(id, nombreActor, edadActor, nacionalidad);
        this.alias = alias;
        this.poderes = new ArrayList<>();
        this.edadPersonaje = edadPersonaje;
        this.nombreReal = nombreReal;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }
    // Getters y setters


    public int getEdadPersonaje() {
        return edadPersonaje;
    }

    public void setEdadPersonaje(int edadPersonaje) {
        this.edadPersonaje = edadPersonaje;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public List<Poder> getPoderes() {
        return poderes;
    }

    public void setPoderes(List<Poder> poderes) {
        this.poderes = poderes;
    }

    // Metodo para agregar un poder a la list

    public void agregarPoder(Poder poder) {
        this.poderes.add(poder);
    }
}