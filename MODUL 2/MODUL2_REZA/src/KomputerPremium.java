class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;
    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium (int jumlahKomputer,String namaWarnet, float hargaPerJam, boolean ruangPrivat){
        super(jumlahKomputer,namaWarnet,hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    @Override
    public void infoKomputer(){
        super.infoKomputer();
        if (ruangPrivat){
            System.out.println("Fasilitas Ruang Premium: " );
            System.out.println("Ruangan Ber Ac Pribadi " );
            System.out.println("Sofa gaming exclusive ");
            System.out.println("Komputer spesifikasi tinggi " );
            System.out.println("koneksi internet dedictated 100mbps ");
        }
        else {
            System.out.println("Fasilitas Ruang Standar ");
            System.out.println("ruangan gerah ");
            System.out.println("Sofa majapahit ");
            System.out.println("komputer spesifikasi rendah ");
            System.out.println("koneksi internet dedictated 1 mbps ");
        }
    }
   

    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void pesan(int nomorKomputer){
        System.out.println("memesan komputer nomor: "+ nomorKomputer);
    }
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void tambahlayanan(String makanan){
        System.out.println("Menambah layanan makanan: " + makanan);
    }
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void tambahlayanan(String makanan,String minuman){
        System.out.println("Menambah layanan makanan: "+ makanan+ "menambah minuman " + minuman);
    }
    
}
