public class Persona
{
    private String nombre;
    private String nacionalidad;
    private int edad;
    private String genero;
    private String Estado;

   //constructor Persona


    public Persona() {}

    public Persona(String nombre, String nacionalidad, int edad, String genere, String Estado)
    {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.genero = genere;
        this.edad= edad;
        this.Estado=Estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}

