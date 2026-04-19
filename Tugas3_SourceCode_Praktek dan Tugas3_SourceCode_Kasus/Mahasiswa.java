public class Mahasiswa {
    String nama, nim;
    int[] nilai;
    int jumlahMK;

    public Mahasiswa(String nama, String nim, int jumlahMK) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = new int[jumlahMK];
    }
    public void inputNilai(int index, int nilai) {
        this.nilai[index] = nilai;
    }
    public double hitungRataRata(){
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return (double) total / nilai.length;
    }
    public char tentukanGrade(){
        double rata = hitungRataRata();
        if (rata >= 85)
            return 'A';
        else if (rata >= 75)
            return 'B';
        else if (rata >= 65)
            return 'C';
        else
            return 'D';
    }
    public boolean lulus(){
        return hitungRataRata() >= 60;
    }
    
    public void tampilRapor() {
        System.out.println("\n=== RAPOR ===");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("Nilai:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("MK-" + (i + 1) + " : " + nilai[i]);
        }
        System.out.printf("Rata  : %.2f\n", hitungRataRata());
        System.out.println("Grade : " + tentukanGrade());
        System.out.println("Lulus : " + lulus());
    }
}
