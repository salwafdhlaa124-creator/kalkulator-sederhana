import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Kalkulator extends JFrame implements ActionListener {
    JTextField layar = new JTextField("0");
    double angkaPertama;
    String operator = "";

    public Kalkulator() {
        setTitle("Kalkulator Sederhana");
        setSize(350, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5, 5));

        layar.setFont(new Font("Arial", Font.BOLD, 30));
        layar.setHorizontalAlignment(JTextField.RIGHT);
        layar.setEditable(false);
        add(layar, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] tombol = {
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "C","0","DEL","+"
        };

        for (String s : tombol) {
            JButton b = new JButton(s);
            b.setFont(new Font("Arial", Font.BOLD, 22));
            b.addActionListener(this);
            panel.add(b);
        }
