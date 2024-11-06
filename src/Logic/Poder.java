package Logic;

public class Poder extends Personaje {
    protected String nombre;
    protected int level;
    protected String tipo;

    public Poder(String nombre, int level, String tipo) {
        this.nombre = nombre;
        this.level = level;
        this.tipo = tipo;
    }
    enum tipo {
        Fisico,
        Mental,
        Sobrenatural,
        Tecnologico,
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
