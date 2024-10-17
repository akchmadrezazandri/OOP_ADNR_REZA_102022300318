public class BarangNonElektronik extends Barang {
    //Atribut
    private String material;

    // Constructor BarangNonElektronik
    public BarangNonElektronik(String nama,int jumlah,double harga,String material){
        super(nama, jumlah, harga);
        this.material = material;
    }

    // Getter dan Setter untuk material
    public String getBarangElektronik(){
        return material;
    }
    public String setBarangElektornik(){
        return material;
    }
    // Override method tampilkanData
    @Override
    public void tampilkanData() {
        super.tampilkanData();
        //Tampilan
        System.out.println("Masukkan Material Barang: "+ material);

    }
}
