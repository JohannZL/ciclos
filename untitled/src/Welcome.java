import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome
{
    private JButton btn1;
    private JPanel panel1;

    public Welcome()
    {
        panel1 = new JPanel();
        btn1 = new JButton();
        panel1.add(btn1);
            

        btn1.addActionListener(new ActionListener() {
            int touch=1;
            String palabra;
            @Override
            public void actionPerformed(ActionEvent e) {
                if(touch==1)
                {
                    palabra="Vez";
                    JOptionPane.showMessageDialog(null, "me tocaron"+" "+touch+" "+palabra);
                } else
                {
                    palabra="Veces";
                    JOptionPane.showMessageDialog(null, "me tocaron"+" "+touch+" "+palabra);
                }
                touch++;
            }
        });


    }
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("ventana");
        frame.setContentPane(new Welcome().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
