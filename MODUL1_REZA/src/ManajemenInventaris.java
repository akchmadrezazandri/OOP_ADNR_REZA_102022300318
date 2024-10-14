import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    // Deklarasi ArrayList untuk menyimpan barang
    ArrayList<Barang> daftarbarang = new ArrayList<>();

    // Method untuk menambah barang elektronik
    public void tambahBarang(){
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Masukkan nama barang: ");
        String nama = scanner.nextLine();
        System.out.println("Masukkan Jumlah Barang: ");
        int jumlah = scanner.nextInt();
        System.out.println("Masukkan Harga Barang: ");
        double harga = scanner.nextInt();
        System.out.println("Masukkan Garansi Barang: ");
        String garansi= scanner.nextLine();
        BarangElektronik tambahBarangElektronik=new BarangElektronik(garansi, nama, jumlah, harga);
        daftarbarang.add(tambahBarangElektronik);
        
    }
        // Scanner 

        // Input Nama Barang, Jumlah Barang, Harga Barang, Garansi Barang

        // Membuat objek barang elektronik baru


    // Method untuk menambah barang non-elektronik
    public void t

        // Scanner


        // Input Nama Barang, Jumlah Barang, Harga Barang, Material Barang

        // Membuat objek barang non-elektronik baru


    // Method untuk menampilkan semua barang memakai if-else (jika tidak ada barang akan menampilkan tidak ada barang dalam inventaris)

}
