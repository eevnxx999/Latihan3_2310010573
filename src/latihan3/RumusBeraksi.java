package latihan3;

public class RumusBeraksi {
    public static void main(String[] args) {
        Rumus Sari = new Rumus();
        
        Sari.sisi = 5;
        Sari.panjang = 10;
        Sari.lebar = 4;
        
        Sari.hitungLuasPersegi();
        System.out.println("Hasil luas persegi : " + Sari.getHasil());
        
        Sari.hitungLuasPersegiPanjang();
        System.out.println("Hasil luas persegi panjang : " + Sari.getHasil());
    }
}
