public class Burung extends Hewan {
    private String warnaBulu;

    // construtor
    public Burung(String nama,int umur,String warnaBulu){
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }
    @Override
    public void suara(){
        System.out.println( nama + "Berkicau");
    }

    @Override
    public void infoHewan(){
        System.out.println("📜 Informasi Burung 📜");
        System.out.println("Nama       : " + nama);
        System.out.println("Umur       : " + umur + " tahun");
        System.out.println("Warna Bulu : " + warnaBulu);
        System.out.println("=================================");
    }
}
