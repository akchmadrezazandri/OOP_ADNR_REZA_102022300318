public class Penerbangan {
    private String nomorpenerbangan;
    private String bandarakeberangkatan;
    private String bandaratujuan;
    private String waktukeberangkatan;
    private String waktukedatangan;
    private float hargatiket;

    public Penerbangan(String nomorpenerbangan, String bandarakeberangkatan, String bandaratujuan, String waktukeberangkatan, String waktukedatangan, float hargatiket){
        this.nomorpenerbangan = nomorpenerbangan;
        this.bandarakeberangkatan = bandarakeberangkatan;
        this.bandaratujuan = bandaratujuan;
        this.waktukeberangkatan = waktukeberangkatan;
        this.waktukedatangan = waktukedatangan;
        this.hargatiket = hargatiket;
    }
    
    public  String getnomorpenerbangan (){
        return nomorpenerbangan;
    }
    public String getbandarakeberangkatan (){
        return bandarakeberangkatan;
    }
    public String getbandaratujuan(){
        return bandaratujuan;
    }
    public String getwaktukeberangkatan(){
        return waktukeberangkatan;
    }
    public String getwaktukedatangan(){
        return waktukedatangan;
    }
    public Float gethargatiket(){
        return hargatiket;
    }
    public void tampilDaftarPenerbangan(){
        System.out.println("Nomor Penerbangan" + nomorpenerbangan );
        System.out.println("Bandara Keberangkatan" + bandarakeberangkatan);
        System.out.println("Bandara Keberangkatan" + bandarakeberangkatan);
        System.out.println("Bandara Tujuan" + bandaratujuan);
        System.out.println("Waktu Keberangkatan" + waktukeberangkatan);
        System.out.println("waktu Kedatangan" + waktukedatangan);
        System.out.println("Harga Tiket"  + hargatiket);
    }
}