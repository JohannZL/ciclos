import java.util.List;

public class Actor extends Persona
{
    private String nombre_artistico;
    private int experiencia;
    private List<Papel> Papeles;


    //constructor de actor

    public Actor(){}

    public Actor(String nombre, String nacionalidad, int edad, String genere,String Estado, String nombre_artistico, int experiencia, List<String> papeles)
    {
        super(nombre, nacionalidad, edad, genere,Estado);
        this.nombre_artistico = nombre_artistico;
        this.experiencia = experiencia;
    }

    public String getNombre_artistico() {
        return nombre_artistico;
    }

    public void setNombre_artistico(String nombre_artistico) {
        this.nombre_artistico = nombre_artistico;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public List<Papel> getPapeles() {
        return Papeles;
    }

    public void setPapeles(List<Papel> papeles) {
        Papeles = papeles;
    }
}
