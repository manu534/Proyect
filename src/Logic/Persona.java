package Logic;

//Abstract nos esta indicando que esta clase no se deja instanciar directamente, es decir solo sera una base para las demas clases
public abstract class Persona {

    //Atributos

    private int id;
    private String nombreActor;
    private int edadActor;
    private String nacionalidad;

    //Constructor

    public Persona(int id, String nombreActor, int edad, String nacionalidad ) {
        this.id = id;
        this.nombreActor = nombreActor;
        this.edadActor = edad;
        this.nacionalidad = nacionalidad;
    }

    // Getters y setters para los atributos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreActor() {
        return nombreActor;
    }

    public void setNombreActor(String nombreActor) {
        this.nombreActor = nombreActor;
    }

    public int getEdad() {
        return edadActor;
    }

    public void setEdad(int edad) {
        this.edadActor = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

}