import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        List<String> fortuna = new ArrayList<>();
        fortuna.add("El amor es lo único que podemos percibir que trasciende las dimensiones del tiempo y del espacio.");
        fortuna.add("Este mundo es un tesoro, pero hace tiempo nos dice que nos tenemos que largar.");
        fortuna.add("El amor no es algo que hayamos inventado, es observable, poderoso… Tiene que significar algo.");
        fortuna.add("La única forma que conocen los humanos de llegar a alguna parte es dejando algo atrás.");
        fortuna.add("El amor es lo único que somos capaces de percibir que trasciende las dimensiones del tiempo y del espacio.");

        JFrame ventana = new JFrame("Rueda de la fortuna");
        ventana.setSize(600, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);
        ventana.getContentPane().setBackground(new Color(0, 51, 102));

        JLabel lblFortuna = new JLabel("<html>?</html>");
        lblFortuna.setFont(new Font("Arial", Font.BOLD, 16));
        lblFortuna.setForeground(Color.WHITE);
        lblFortuna.setHorizontalAlignment(SwingConstants.CENTER);
        lblFortuna.setVerticalAlignment(SwingConstants.CENTER);
        lblFortuna.setBounds(50, 50, 500, 100);

        JButton btnFortuna = new JButton("Presioname :)");
        btnFortuna.setFont(new Font("Arial", Font.BOLD, 14));
        btnFortuna.setBounds(200, 250, 200, 50);
        btnFortuna.setForeground(Color.WHITE);
        btnFortuna.setBackground(new Color(0, 102, 204));
        btnFortuna.setOpaque(true);
        btnFortuna.setBorderPainted(false);


        btnFortuna.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblFortuna.setText("<html>" + fortuna.get(random.nextInt(fortuna.size())) + "</html>");
            }
        });

        ventana.add(btnFortuna);
        ventana.add(lblFortuna);
        ventana.setVisible(true);
    }
}
