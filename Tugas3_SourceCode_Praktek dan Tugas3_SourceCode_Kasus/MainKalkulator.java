//Nama : Ahmad Radiyah
//NIM : 13020240023
//Hari / Tanggal :Jumat, 17 April 2026
//Jam : 17.09 WITA
import java.util.Scanner;

public class MainKalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kalkulator calc = new Kalkulator(0, 0, '+');

        char lagi;
        do {
            System.out.print("Angka 1  : ");
            double angka1 = input.nextDouble();
            System.out.print("Angka 2  : ");
            double angka2 = input.nextDouble();
            System.out.print("Operator : ");
            char operator = input.next().charAt(0);

            double hasil = calc.hitung(angka1, angka2, operator);
            System.out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);

            System.out.print("\nhitung lagi? (y/n): ");
            lagi = input.next().charAt(0);
        } while (lagi == 'y');


        System.out.print("\nProgram selesai");
    }
}
