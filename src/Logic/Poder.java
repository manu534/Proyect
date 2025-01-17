package Logic;

public class Poder {

    //Atributos

    private String poder;
    private int nivel;
    private Tipo tipo;
    private String descripcion;

    //Constructor

    public enum Tipo {
        Fisico("Fuerza, velocidad, resistencia"),
        Mental("Telepatía, telequinesis"),
        Energetico("Control de elementos, proyección de energía"),
        Magico("Hechizos, conjuros"),
        Mutacion("Garras, alas, sentidos agudizados"),
        Tecnologico("Armadura, armas de energía"),;
        private String ejemplos;

        Tipo(String ejemplos) {
            this.ejemplos = ejemplos;
        }

        public String getEjemplos() {
            return ejemplos;
        }
    }

    // Getters y setters

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
