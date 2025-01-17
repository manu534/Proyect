package Logic;


import java.util.ArrayList;
import java.util.List;

public class AntiHeroe extends Personaje {

    // Atributos

    private String frase;
    private List<String> metodosCuestionables;


    // Constructor

    public AntiHeroe(int id, String nombre, int edad, String nacionalidad, String alias,String nombreReal,int edadPersonaje,String frase ) {
        super(id, nombre, edad, nacionalidad, alias,nombreReal,edadPersonaje);
        this.frase = frase;
        this.metodosCuestionables = new ArrayList<>();
    }


    // Getters y setters

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public List<String> getMetodosCuestionables() {
        return metodosCuestionables;
    }

    public void setMetodosCuestionables(List<String> metodosCuestionables) {
        this.metodosCuestionables = metodosCuestionables;
    }

    public void agregarMetodoCuestionable(String metodo) {
        this.metodosCuestionables.add(metodo);
    }


}