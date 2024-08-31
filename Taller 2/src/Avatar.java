import java.util.List;

public class Avatar extends Persona
{
    private String alias;
    private String origen;
    private int servicio;

    public Avatar(){}

    public Avatar(String nombre, String nacionalidad, int born, String genere, String Estado, String alias, String origen, int servicio)
    {
        super(nombre, nacionalidad, born, genere, Estado);
        this.alias = alias;
        this.origen = origen;
        this.servicio = servicio;
    }

    public String getAlias()
    {
        return alias;
    }

    public void setAlias(String alias)
    {
        this.alias = alias;
    }

    public String getOrigen()
    {
        return origen;
    }

    public void setOrigen(String origen)
    {
        this.origen = origen;
    }

    public int getServicio()
    {
        return servicio;
    }

    public void setServicio(int servicio)
    {
        this.servicio = servicio;
    }
}
