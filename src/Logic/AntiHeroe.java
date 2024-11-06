package Logic;

public class AntiHeroe extends Personaje {
    protected String descripcion;
    protected String frase;
    public AntiHeroe(String name, int age, String descripcion, String frase) {
        super(name, age);
        this.descripcion = descripcion;
        this.frase = frase;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
}