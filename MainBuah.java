//Nama : Ahmad Radiyah
//NIM : 13020240023
//Hari / Tanggal :Jumat, 17 April 2026
//Jam : 17.09 WITA
import java.util.Scanner;

public class MainBuah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Buah[] katalog = {
                new Buah("Apel", 15000, 10),
                new Buah("Jeruk", 12000, 8),
                new Buah("Mangga", 20000, 5)
        };

        double total = 0;
        int pilih, qty;

        for (int i = 0; i < katalog.length; i++) {
            System.out.println((i + 1) + ". " + katalog[i].getInfo());
        }

        do {
            System.out.print("\nPilih (0=stop): ");
            pilih = input.nextInt();

            if (pilih == 0)
                break;

            if (pilih < 1 || pilih > katalog.length) {
                System.out.println("Pilihan tidak valid!");
                continue;
            }

            System.out.print("Jumlah(kg): ");
            qty = input.nextInt();

            Buah b = katalog[pilih - 1];

            if (b.tersedia(qty)) {
                double subtotal = b.hitungTotal(qty);
                total += subtotal;
                b.beli(qty);

                System.out.println("OK +Rp" + (int) subtotal);
            } else {
                System.out.println("Stok tidak cukup!");
            }

        } while (true);

        System.out.println("\nTotal: Rp" + (int) total);
        input.close();
    }
}
