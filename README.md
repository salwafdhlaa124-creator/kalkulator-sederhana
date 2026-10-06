import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Kalkulator extends JFrame implements ActionListener {

    JTextField layar;
    double angkaPertama = 0;
    String operator = "";

    public Kalkulator() {

        // Judul aplikasi
        setTitle("Kalkulator Sederhana");

        // Ukuran jendela
        setSize(350, 450);

        // Posisi di tengah layar
        setLocationRelativeTo(null);

        // Menutup aplikasi ketika tombol X ditekan
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Layout utama
        setLayout(new BorderLayout(10, 10));

        // =========================
        // LAYAR KALKULATOR
        // =========================
        layar = new JTextField();
        layar.setFont(new Font("Arial", Font.BOLD, 30));
        layar.setHorizontalAlignment(JTextField.RIGHT);
        layar.setEditable(false);

        add(layar, BorderLayout.NORTH);

        // =========================
        // TOMBOL KALKULATOR
        // =========================
        JPanel panelTombol = new JPanel();
        panelTombol.setLayout(new GridLayout(4, 4, 5, 5));

        String[] tombol = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        
