public class Buah {
    String nama;
    double harga;
    int stok;

    public Buah(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    public String getInfo(){
        return nama + "  Rp " + harga + "  (Stok  : " + stok +"kg)";
    }
    public double hitungTotal(int qty) {
        return harga * qty;
    }
    public boolean tersedia(int qty) {
        return stok >= qty;
    }
    public void beli(int qty) {
        stok -= qty;
    }
}
