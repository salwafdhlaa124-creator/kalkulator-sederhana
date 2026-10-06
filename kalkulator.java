import java.util.Scanner;

class OperasiKalkulator {
    double angka1;
    double angka2;

    double tambah() {
        return angka1 + angka2;
    }

    double kurang() {
        return angka1 - angka2;
    }

    double kali() {
        return angka1 * angka2;
    }

    double bagi() {
        return angka1 / angka2;
    }
}

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        OperasiKalkulator kalkulator = new OperasiKalkulator();

        System.out.print("Masukkan angka pertama: ");
        kalkulator.angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        kalkulator.angka2 = input.nextDouble();

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Penjumlahan : " + kalkulator.tambah());
        System.out.println("Pengurangan : " + kalkulator.kurang());
        System.out.println("Perkalian   : " + kalkulator.kali());

        if (kalkulator.angka2 != 0) {
            System.out.println("Pembagian   : " + kalkulator.bagi());
        } else {
            System.out.println("Pembagian   : Tidak bisa dibagi 0");
        }

        input.close();
    }
}

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        OperasiKalkulator kalkulator = new OperasiKalkulator();

        System.out.print("Masukkan angka pertama: ");
        kalkulator.angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        kalkulator.angka2 = input.nextDouble();

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Penjumlahan : " + kalkulator.tambah());
        System.out.println("Pengurangan : " + kalkulator.kurang());
        System.out.println("Perkalian   : " + kalkulator.kali());

        if (kalkulator.angka2 != 0) {
            System.out.println("Pembagian   : " + kalkulator.bagi());
        } else {
            System.out.println("Pembagian   : Tidak bisa dibagi 0");
        }

        input.close();
    }
}
