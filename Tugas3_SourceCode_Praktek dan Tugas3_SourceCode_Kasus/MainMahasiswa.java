//Nama : Ahmad Radiyah
//NIM : 13020240023
//Hari / Tanggal :Jumat, 17 April 2026
//Jam : 17.09 WITA

import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = input.nextLine();

        System.out.print("NIM : ");
        String nim = input.nextLine();

        System.out.print("Jumlah MK : ");
        int jumlah = input.nextInt();

        Mahasiswa mhs = new Mahasiswa(nama, nim, jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nilai MK-" + (i+1) + ": ");
            int nilai = input.nextInt();
            mhs.inputNilai(i, nilai);
        }
        mhs.tampilRapor();

        input.close();    
    }
}
