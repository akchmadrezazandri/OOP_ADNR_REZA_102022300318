public class Hewan {
    protected String nama;
    protected int umur;

    // constructor
    public Hewan (String nama,int umur){
        this.nama = nama;
        this.umur = umur;  
    }
    // method
    public void suara(){
        System.out.println(nama +"Mengeong");
    }

    public void makan(){
        System.out.println(nama + "Sedang Makan");
    }
    public void makan(String makanan){
        System.out.println(nama + "Sedang Makan" + makanan);
    }
    public void infoHewan(){
        System.out.println("Nama: " + nama + ": Umur: " + umur);
        System.out.println("=================================");
    }

}
