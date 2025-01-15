package Logic;

public class AntiHeroe extends Personaje {
    protected String descripcion;
    protected String frase;
    private Poder poder;
    private Actor actor;

    public AntiHeroe(String name, int age, String descripcion, String frase) {
        super(name, age);
        this.descripcion = descripcion;
        this.frase = frase;
        this.poder = new Poder("", 0, "");
    }

    public AntiHeroe(String name, int age, String descripcion, String frase,Poder poder) {
        super(name, age);
        this.descripcion = descripcion;
        this.frase = frase;
        this.poder = poder;
    }
    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Poder getPoder() {
        return poder;
    }

    public void setPoder(Poder poder) {
        this.poder = poder;
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