package Logic;


public class Heroe extends Personaje {

    // Atributos

    private int nivelHeroismo;
    private String frase;

    // Constructor

    public Heroe(int id, String nombre, int edad, String nacionalidad, String alias,String nombreReal,int edadPersonaje, int nivelHeroismo,String frase) {
        super(id, nombre, edad, nacionalidad, alias,nombreReal,edadPersonaje);
        this.nivelHeroismo = nivelHeroismo;
        this.frase = frase;
    }

    // Getters y setters

    public int getNivelHeroismo() {
        return nivelHeroismo;
    }

    public void setNivelHeroismo(int nivelHeroismo) {
        this.nivelHeroismo = nivelHeroismo;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
}