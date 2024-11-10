public class Kucing extends Hewan {
    private String ras;

    // construtor
    public Kucing (String nama,int umur,String ras){
        super(nama,umur);
        this.ras = ras ;
    }
    
    @Override
    public void suara(){
        System.out.println( nama + "mengeong: Meow...");

    }
    @Override
    public void infoHewan(){
        System.out.println("📜 Informasi Kucing 📜");
        System.out.println("Nama       : " + nama);
        System.out.println("Umur       : " + umur + " tahun");
        System.out.println("Ras        : " + ras);
        System.out.println("=================================");
    }
}
