package Logic;

public class Papel extends Persona{
    protected String personaje;
    protected int a_no;
    protected String nombrePelicula;

    public Papel(String nombrePelicula,int a_no, String personaje) {
        this.nombrePelicula = nombrePelicula;
        this.personaje = personaje;
    }

    public Papel() {

    }

    public int getA_no() {
        return a_no;
    }

    public void setA_no(int a_no) {
        this.a_no = a_no;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }
}
