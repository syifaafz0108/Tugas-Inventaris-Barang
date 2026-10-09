# Program Inventaris Barang (Tugas PBO)

Halo! Ini adalah program Java sederhana buat nyatet dan ngelola stok barang pakai konsep *Object-Oriented Programming* (OOP) dan *HashMap* (Java Collections).

## Apa aja isi project ini?
Ada 2 file utama di dalam folder ini:
1. **`Produk.java`**
   File ini tugasnya jadi cetak biru (blueprint) buat bikin objek produk. Di dalamnya ada data `kodeproduk`, `nama`, dan `stok`. Variabelnya dibikin privat (`private`) biar aman, terus kita siapin jalan keluar-masuk data pakai *Getter* dan *Setter*.
2. **`MainInventarisProduk.java`**
   Ini file utamanya buat ngejalanin program. Di sini kita ngelakuin beberapa hal:
   - Bikin wadah `HashMap` supaya nyari barang gampang banget tinggal panggil kodenya.
   - Nambahin 5 data barang awal (buku tulis, tip-x, penghapus, dll).
   - Nampilin daftar barang awal pakai perulangan (*for-each*).
   - Nyobain ngubah jumlah stok barang tertentu.
   - Nyobain ngehapus salah satu barang dari daftar.
   - Nampilin daftar barang terakhir buat ngecek kalau stok dan penghapusan tadi udah beres.

---

## Cara Jalankan Programnya:
1. Pastikan kedua file (`Produk.java` dan `MainInventarisProduk.java`) disimpen di **satu folder yang sama**.
2. Buka Terminal (CMD / Command Prompt / VS Code Terminal) di folder itu.
3. Ketik perintah ini buat nge-compile filenya:
   ```bash
   javac Produk.java MainInventarisProduk.java