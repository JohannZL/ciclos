import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Lista extends JFrame
{
    private JPanel lista;
    DefaultTableModel modelo = new DefaultTableModel();
    public Lista()
    {
        setTitle("lista de actores");
        lista = new JPanel();
        lista.setLayout(null);
        modelo.addColumn("Nombre");
        modelo.addColumn("Nacionalidad");
        modelo.addColumn("Edad");
        modelo.addColumn("Genero");
        modelo.addColumn("Experiencia");
        modelo.addColumn("Estado");
        modelo.addColumn("Nombre artistico");

        this.setContentPane(lista);
    }
}
