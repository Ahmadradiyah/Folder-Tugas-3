//Nama : Ahmad Radiyah
//NIM : 13020240023
//Hari / Tanggal :Ahad, 19 April 2026
//Jam : 20.09 WITA

import java.util.Scanner;

public class MainKonversi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total detik: ");
        long totalDetik = input.nextLong();

        KonversiWaktu kw = new KonversiWaktu(totalDetik);

        System.out.println("\nTotal detik: " + totalDetik);
        System.out.println("====================");
        System.out.println("Waktu: " + kw.getWaktu());
        System.out.println("====================");

        System.out.println("\nTotal Detik   : " + totalDetik);
        System.out.println("detikSaat ini : " + kw.getDetik());
        System.out.println("menitSaat ini : " + kw.getMenit());
        System.out.println("jamSaat ini   : " + kw.getJam());

        System.out.println("\n--- Contoh lain ---");

        int input1 = 3661;
        KonversiWaktu ex1 = new KonversiWaktu(input1);
        System.out.println("Input  : " + input1);
        System.out.println("Output : " + ex1.getWaktu());

        int input2 = 86400;
        System.out.println("\nInput  : " + input2);
        if (input2 == 86400) {
            System.out.println("Output : 00:00:00 (tepat 1 hari)");
        } else {
            KonversiWaktu ex2 = new KonversiWaktu(input2);
            System.out.println("Output : " + ex2.getWaktu());
        }

        input.close();
    }
}