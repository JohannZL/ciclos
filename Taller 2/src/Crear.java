import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Crear extends JFrame
{
    private JPanel panel;
    private JButton btn2;
    private JButton btn1;
    private JLabel opcion;
    private JButton btn3;
    public int cont=0;


    public Crear()
    {
        setTitle("Personaje");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        opcion = new JLabel("Crea tu personaje");
        btn1 = new JButton("Heroe");
        btn2 = new JButton("Antiheroe");
        btn3 = new JButton("Personajes");

        this.setContentPane(panel);
        panel.add(opcion);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        setLocationRelativeTo(null);
        setSize(400,400);
        setVisible(true);
        btn1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Personaje personaje = new Personaje();
                personaje.setVisible(true);
                setVisible(false);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Personaje personaje = new Personaje();
                personaje.setVisible(true);
                setVisible(false);
                cont++;
            }
        });
    }
}
