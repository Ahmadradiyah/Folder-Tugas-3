public class KonversiWaktu {

    long totalDetik;
    long detikSekarang;
    long totalMenit;
    long menitSekarang;
    long totalJam;
    long jamSekarang;

    public KonversiWaktu(long totalDetik) {
        this.totalDetik = totalDetik;
        konversi();
    }

    private void konversi() {
        detikSekarang = totalDetik % 60;

        totalMenit = totalDetik / 60;
        menitSekarang = totalMenit % 60;

        totalJam = totalMenit / 60;
        jamSekarang = totalJam % 24;
    }

    public String getWaktu() {
        return String.format("%02d:%02d:%02d", jamSekarang, menitSekarang, detikSekarang);
    }

    public long getDetik() {
        return detikSekarang;
    }

    public long getMenit() {
        return menitSekarang;
    }

    public long getJam() {
        return jamSekarang;
    }
}
