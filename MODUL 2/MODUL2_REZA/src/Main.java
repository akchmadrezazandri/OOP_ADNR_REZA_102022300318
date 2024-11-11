public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer komputer = new Komputer(20, "Warnet reza",5000);
        // To do: Panggillah Method Informasi dari class Komputer
        komputer.infoKomputer();

        System.out.println();


        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP komputerVIP = new KomputerVIP(15, "Warnet Reza", 6000,true);
        // To do: Panggillah Method Informasi dari class KomputerVIP
        komputerVIP.infoKomputer();
        // To do: Panggillah Method Login
        komputerVIP.login("asep");
    
        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        komputerVIP.bermain(2);
        komputerVIP.bermain(2, 36);

        System.out.println();


        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium komputerPremium = new KomputerPremium(10, "warnet reza ", 8000, true);
        // To do: Panggillah Method Informasi dari class KomputerPremium
        komputerPremium.infoKomputer();

        komputerPremium.pesan(5);
        // To do: Panggillah Method Pesan
        komputerPremium.tambahlayanan("mie goreng");
        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
       komputerPremium.tambahlayanan("mie goreng", "es teh");
    }
}