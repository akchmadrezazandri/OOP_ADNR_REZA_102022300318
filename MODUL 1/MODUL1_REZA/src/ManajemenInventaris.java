import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    // Deklarasi ArrayList untuk menyimpan barang
    private ArrayList<Barang> daftarBarang = new ArrayList<>();

    // Method untuk menambah barang elektronik
    public void tambahBarangElektronik() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Barang: ");
        String namaBarang = scanner.nextLine();
        System.out.print("Masukkan Jumlah Barang: ");
        int jumlahBarang = scanner.nextInt();
        System.out.print("Masukkan Harga Barang: ");
        double hargaBarang = scanner.nextDouble();
        scanner.nextLine(); // Tambahkan ini untuk menangkap newline
        System.out.print("Masukkan Garansi Barang: ");
        String garansiBarang = scanner.nextLine();
        BarangElektronik barang = new BarangElektronik(namaBarang, jumlahBarang, hargaBarang, garansiBarang);
        daftarBarang.add(barang);
    }

    // Method untuk menambah barang non-elektronik
    public void tambahBarangNonElektronik() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Barang: ");
        String namaBarang = scanner.nextLine();
        System.out.print("Masukkan Jumlah Barang: ");
        int jumlahBarang = scanner.nextInt();
        System.out.print("Masukkan Harga Barang: ");
        double hargaBarang = scanner.nextDouble();
        scanner.nextLine(); // Tambahkan ini untuk menangkap newline
        System.out.print("Masukkan Material Barang: ");
        String materialBarang = scanner.nextLine();
        BarangNonElektronik barang = new BarangNonElektronik(namaBarang, jumlahBarang, hargaBarang, materialBarang);
        daftarBarang.add(barang);
    }

    public void menampilkanSemuaBarang() {
        if (daftarBarang == null) {
            System.out.println("Daftar barang kosong!");
        }
        else {
            System.out.println("Daftar Barang:");
            for (Barang barang : daftarBarang) {
                barang.tampilkanData();
            }
        }
    }
}