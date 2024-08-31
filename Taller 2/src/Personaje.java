import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

public class Personaje extends JFrame
{
    private JPanel panel2;
    private JButton guardar;
    private JButton tabla;
    //etiquetas
    private JLabel nombre;
    private JLabel edad;
    private JLabel genero;
    private JLabel civil;
    private JLabel nacionalidad;
    private JLabel artista;
    private JLabel experiencia;
    private JLabel real;
    private JLabel origen;
    private JLabel genre;
    private JLabel estado;
    private JLabel alias;
    private JLabel activo;
    private JLabel bondad;
    private JLabel villano;

    //textos
    private JTextField nombre2;
    private JTextField edad2;
    private JTextField genero2;
    private JTextField nacionalidad2;
    private JTextField artista2;
    private JTextField experiencia2;
    private JTextField real2;
    private JTextField origen2;
    private JTextField genre2;
    private JTextField alias2;
    private JTextField activo2;
    private JTextField bondad2;
    private JTextField villano2;
    private JComboBox civil2;
    private JComboBox estado2;
    private JTable tablas;
    DefaultTableModel modelo;



    //tabla

    public Personaje()
    {
        setTitle("Heroe o Villano");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel2 = new JPanel();
        guardar = new JButton("Guardar");
        nombre = new JLabel("Nombre del actor");
        edad = new JLabel("Año de nacimiento");
        nombre2 = new JTextField();
        edad2 = new JTextField();
        genero = new JLabel("Genero");
        genero2 = new JTextField();
        civil = new JLabel("Estado civil");
        nacionalidad = new JLabel("Nacionalidad");
        nacionalidad2 = new JTextField();
        artista = new JLabel("Nombre artistico");
        artista2 = new JTextField();
        experiencia = new JLabel("Años de experiencia");
        experiencia2 = new JTextField();
        tabla = new JButton("Registro");
        real = new JLabel("Nombre del Heroe");
        real2 = new JTextField();
        origen = new JLabel("Lugar de origen");
        origen2 = new JTextField();
        genre = new JLabel("Genero");
        genre2 = new JTextField();
        estado = new JLabel("Estado civil");
        alias2 = new JTextField();
        alias= new JLabel("Alias");
        activo = new JLabel("Tiempo de servicio");
        activo2 = new JTextField();
        bondad= new JLabel("Bondad");
        bondad2 = new JTextField();
        villano= new JLabel("Villano");
        villano2 = new JTextField();
        civil2= new JComboBox();
        civil2 = new JComboBox<>(new String[]{"Casado", "Soltero", "Divorciado"});
        estado2 = new JComboBox<>(new String[]{"Casado", "Soltero", "Divorciado"});
        modelo = new DefaultTableModel(new String[]{"Nombre", "Edad", "Genero", "Estado civil", "Nacinalidad","Artista","Experiencia"}, 0);
        tablas = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tablas);



        //componentes y ubicacion en la ventana
        panel2.setLayout(null);
        this.setContentPane(panel2);
        panel2.add(guardar);
        guardar.setBounds(170,600,100,30);
        panel2.add(tabla);
        tabla.setBounds(290,600,100,30);

       //etiquetas y cuadro de texto del actor
        panel2.add(nombre);
        nombre.setBounds(10,20,100,30);
        panel2.add(nombre2);
        nombre2.setBounds(130,20,140,30);
        panel2.add(edad);
        edad.setBounds(10,60,140,30);
        panel2.add(edad2);
        edad2.setBounds(130,60,140,30);
        panel2.add(genero);
        genero.setBounds(10,100,140,30);
        panel2.add(genero2);
        genero2.setBounds(130,100,140,30);
        panel2.add(civil);
        civil.setBounds(10,140,140,30);
        panel2.add(civil2);
        civil2.setBounds(130,140,140,30);
        panel2.add(nacionalidad);
        nacionalidad.setBounds(10,180,140,30);
        panel2.add(nacionalidad2);
        nacionalidad2.setBounds(130,180,140,30);
        panel2.add(artista);
        artista.setBounds(10,220,140,30);
        panel2.add(artista2);
        artista2.setBounds(130,220,140,30);
        panel2.add(experiencia);
        experiencia.setBounds(10,260,140,30);
        panel2.add(experiencia2);
        experiencia2.setBounds(130,260,140,30);

        //etiquetas y cuadros de texto del personaje
        panel2.add(real2);
        real2.setBounds(390,20,140,30);
        panel2.add(real);
        real.setBounds(280,20,140,30);
        panel2.add(origen);
        origen.setBounds(280,60,140,30);
        panel2.add(origen2);
        origen2.setBounds(390,60,140,30);
        panel2.add(genre);
        genre.setBounds(280,100,140,30);
        panel2.add(genre2);
        genre2.setBounds(390,100,140,30);
        panel2.add(estado);
        estado.setBounds(280,140,140,30);
        panel2.add(estado2);
        estado2.setBounds(390,140,140,30);
        panel2.add(alias);
        alias.setBounds(280,180,140,30);
        panel2.add(alias2);
        alias2.setBounds(390,180,140,30);
        panel2.add(activo);
        activo.setBounds(280,220,140,30);
        panel2.add(activo2);
        activo2.setBounds(390,220,140,30);
        panel2.add(bondad);
        bondad.setBounds(280,260,140,30);
        panel2.add(bondad2);
        bondad2.setBounds(390,260,140,30);
        panel2.add(villano);
        villano.setBounds(280,300,140,30);
        panel2.add(villano2);
        villano2.setBounds(390,300,140,30);
        scrollPane.setBounds(50, 350, 700, 200);
        panel2.add(scrollPane);





        //tamaño de ventana
        setSize(800,800);
        setLocationRelativeTo(null);
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create and populate Actor object
                Actor x = new Actor();
                x.setNombre(nombre2.getText());
                x.setEdad(Integer.parseInt(edad2.getText()));
                x.setGenero(genero2.getText());
                x.setExperiencia(Integer.parseInt(experiencia2.getText()));
                x.setEstado(civil2.getSelectedItem().toString());
                x.setNombre_artistico(artista2.getText());
                x.setNacionalidad(nacionalidad2.getText());

                modelo.addRow(new Object[]{
                        x.getNombre(),
                        x.getEdad(),
                        x.getGenero(),
                        x.getEstado(),
                        x.getNacionalidad(),
                        x.getNombre_artistico(),
                        x.getExperiencia(),
                });
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            }
        });

        tabla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                setVisible(false);
            }
        });
    }

}
