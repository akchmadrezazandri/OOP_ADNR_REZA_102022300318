public class Penumpang {
    private String NIK;
    private String namadepan;
    private String namabelakang;

    public Penumpang(String NIK, String namadepan, String namabelakang){
        this.NIK = NIK;
        this.namadepan = namadepan;
        this.namabelakang = namabelakang;

    }
    public void tampildaftarpenumpang(){
        System.out.println("NIK: " + NIK);
        System.out.println("Nama Depan: " + namadepan);
        System.out.println("Nama Belakang: " + namabelakang);
    }

}
