import java.util.List;

public class Heroe extends Avatar
{
    int nivel_bondad;
    String equipo;
    Tipo tipo;
    String villano;

    public Heroe(){}
    public Heroe(String nombre, String nacionalidad, int born, String genere, String Estado, String alias, String origen, int servicio, int nivel_bondad, String equipo, Tipo tipo, String villano)
    {
        super(nombre, nacionalidad, born, genere, Estado, alias, origen, servicio);
        this.nivel_bondad = nivel_bondad;
        this.equipo = equipo;
        this.tipo = tipo;
        this.villano = villano;
    }

    public int getNivel_bondad()
    {
        return nivel_bondad;
    }

    public void setNivel_bondad(int nivel_bondad)
    {
        this.nivel_bondad = nivel_bondad;
    }

    public String getEquipo()
    {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public Tipo getTipo()
    {
        return tipo;
    }

    public void setTipo(Tipo tipo)
    {
        this.tipo = tipo;
    }

    public String getVillano()
    {
        return villano;
    }

    public void setVillano(String villano)
    {
        this.villano = villano;
    }
}
