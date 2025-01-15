package Logic;

public class Poder  {
    protected String nombre;
    protected int level;
    protected String tipo;

    public Poder(String nombre, int level, String tipo) {
        this.nombre = nombre;
        this.level = level;
        this.tipo = tipo;
    }
    public enum Tipo {
        Fisico,
        Mental,
        Sobrenatural,
        Tecnologico,
    }

    public int getLevel() {
        return level;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
