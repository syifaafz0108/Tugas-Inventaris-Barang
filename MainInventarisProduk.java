import java.util.HashMap;

public class MainInventarisProduk {
    public static void main(String[] args) {
        
        // 1. Membuat HashMap inventaris 
        HashMap<String, Produk> mapInventarisProduk = new HashMap<>();

        // 2. Menambahkan minimal 5 produk ke dalam HashMap
        mapInventarisProduk.put("P001", new Produk("P001", "Buku Tulis", 50));
        mapInventarisProduk.put("P002", new Produk("P002", "Tip x", 100));
        mapInventarisProduk.put("P003", new Produk("P003", "Penghapus", 30));
        mapInventarisProduk.put("P004", new Produk("P004", "Penggaris", 45));
        mapInventarisProduk.put("P005", new Produk("P005", "Buku Gambar", 25));

        // 3. Cetak daftar awal (Iterasi dengan For-Each menggunakan keySet)
        System.out.println("=== DAFTAR INVENTARIS AWAL ===");
        for (String key : mapInventarisProduk.keySet()) {
            Produk p = mapInventarisProduk.get(key);
            System.out.println("Kode: " + p.getKodeproduk() + " | Nama: " + p.getNama() + " | Stok: " + p.getStok());
        }

        // 4. Simulasi ubah stok via .get(kode).setStok()
        String kodeUbah = "P002";
        if (mapInventarisProduk.containsKey(kodeUbah)) {
            mapInventarisProduk.get(kodeUbah).setStok(120);
            System.out.println("\n[INFO] Stok untuk produk dengan kode " + kodeUbah + " berhasil diubah.");
        }

        // 5. Simulasi hapus satu produk via .remove(kode)
        String kodeHapus = "P003";
        if (mapInventarisProduk.containsKey(kodeHapus)) {
            mapInventarisProduk.remove(kodeHapus);
            System.out.println("[INFO] Produk dengan kode " + kodeHapus + " telah dihapus dari inventaris.\n");
        }

        // 6. Cetak daftar akhir setelah perubahan
        System.out.println("=== DAFTAR INVENTARIS AKHIR ===");
        for (String key : mapInventarisProduk.keySet()) {
            Produk p = mapInventarisProduk.get(key);
            System.out.println("Kode: " + p.getKodeproduk() + " | Nama: " + p.getNama() + " | Stok: " + p.getStok());
        }
    }
}