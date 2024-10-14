public class Barang {
    //Atribut
    private String nama ;
    private int jumlah ;
    private double harga;
    // Constructor Barang
    public Barang (String nama,int jumlah,double harga){
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getnama(){
        return nama;
    }    
    public int getjumlah(){
        return jumlah;
    }
    public double getharga(){
        return harga;
    }

    // Method tampilkanData
    public void tampilkanData(){
        System.out.println("Masukkan Nama Barang: "+ nama);
        System.out.println("Masukkan Jumlah Barang: " + jumlah);
        System.out.println("Masukkan Harga Barang: "+ harga);
    }
}
