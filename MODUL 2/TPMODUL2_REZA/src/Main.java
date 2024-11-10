
public class Main {
    public static void main(String args[]) {
        Hewan hewan = new Hewan("Ini adalah Momo! ", 2);
        
        // objek dari Hewan 
        hewan.suara();
        hewan.makan();
        hewan.makan(" Ikan");
        hewan.infoHewan();

        // kucing
        Kucing kucing = new Kucing ("Mochi ", 2, "Persia");
        kucing.suara();
        kucing.makan();
        kucing.makan(" Royal Canin");
        kucing.infoHewan();

        //Burung 
        Burung burung = new Burung(" Jeff ", 3, " Biru Muda");
        burung.suara();
        burung.makan();
        burung.makan(" Jagung");
        burung.infoHewan();
    }
}
