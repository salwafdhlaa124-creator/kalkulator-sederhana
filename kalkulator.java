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

    add(panel, BorderLayout.CENTER);

        JButton samaDengan = new JButton("=");
        samaDengan.setFont(new Font("Arial", Font.BOLD, 22));
        samaDengan.addActionListener(this);
        add(samaDengan, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String tombol = e.getActionCommand();

        if (tombol.matches("[0-9]")) {
            layar.setText(
                layar.getText().equals("0") ? tombol : layar.getText() + tombol
            );
        }
        else if (tombol.equals("C")) {
            layar.setText("0");
            angkaPertama = 0;
            operator = "";
        }
        else if (tombol.equals("DEL")) {
            String teks = layar.getText();
            layar.setText(teks.length() > 1 ? teks.substring(0, teks.length() - 1) : "0");
        }
        else if ("+-*/".contains(tombol)) {
            angkaPertama = Double.parseDouble(layar.getText());
            operator = tombol;
            layar.setText("0");
        }
        else if (tombol.equals("=") && !operator.isEmpty()) {
            double angkaKedua = Double.parseDouble(layar.getText());
            double hasil = 0;

            switch (operator) {
                case "+": hasil = angkaPertama + angkaKedua; break;
                case "-": hasil = angkaPertama - angkaKedua; break;
                case "*": hasil = angkaPertama * angkaKedua; break;
                case "/":
                    if (angkaKedua == 0) {
                        layar.setText("Error");
                        return;
                    }
                    hasil = angkaPertama / angkaKedua;
                    break;
            }

            layar.setText(String.valueOf(hasil));
            operator = "";
        }
    }

    public static void main(String[] args) {
        new Kalkulator();
    }
}
