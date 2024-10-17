import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari manajemenInventaris
        ManajemenInventaris manajemenInventaris = new ManajemenInventaris();      
        Scanner scanner = new Scanner(System.in);
        // Loop menu list
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Barang Eletronik");
            System.out.println("2. Tambah Barang Non Eletronik");
            System.out.println("3. Lihat Daftar Barang");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    manajemenInventaris.tambahBarangElektronik();
                    break;
                case 2:
                    manajemenInventaris.tambahBarangNonElektronik();

                case 3:
                    manajemenInventaris.menampilkanSemuaBarang();
                    break;
                case 4:
                    System.out.println("Terima kasih, sampai jumpa lagi!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan menu yang anda masukkan salah!");
            }
        }       
    }
}