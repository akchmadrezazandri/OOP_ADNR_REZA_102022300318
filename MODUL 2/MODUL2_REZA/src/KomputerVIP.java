class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean VipCard;
    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(int jumlahKomputer,String namaWarnet, float hargaPerJam,boolean VipCard){
        super(jumlahKomputer,namaWarnet,hargaPerJam);
        this.VipCard = VipCard;
    }
    
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    @Override
    public void infoKomputer(){
        super.infoKomputer();
        if (VipCard){
            System.out.println("Benefit Member VIP: ");
            System.out.println("Diskon Minuman Setiap 3 Jam Bermain ");
            System.out.println("Gratis Minuman Setiap 4 Jam Bermain ");
            System.out.println("Prioritas Booking Komputer Gaming ");
        }

        else{
            System.out.println("JANGAN NGAREP BENEFIT, MAAF");
        }
    }
    // To do: Buatlah method Login sesuai dengan ketentuan
    public void login (String Username){
        System.out.println("Login dengan username " + Username);
    }
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void bermain(int jam){
        System.out.println("Bermain Selama  " + jam + "jam");
    }
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan
    
    public void bermain(int jam, int menitTambahan){
        System.out.println("Nambah Biling Selama " + jam + "jam " + menitTambahan );
    }


}