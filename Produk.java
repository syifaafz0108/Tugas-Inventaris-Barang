public class Produk {
    private String kodeproduk;
    private String nama;
    private int stok;

    // Constructor
    public Produk(String kodeProduk, String nama, int stok) {
        this.kodeproduk = kodeProduk;
        this.nama = nama;
        this.stok = stok;
    }
    
    // Getter
    public String getKodeproduk() {
        return kodeproduk;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    // Setter
    public void setKodeproduk(String kodeproduk) {
        this.kodeproduk = kodeproduk;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}