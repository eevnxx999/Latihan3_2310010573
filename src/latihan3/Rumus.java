package latihan3;

public class Rumus {
    //Nama  : M. Irham Maulana Sari
    //NPM   : 2310010573
    //Kelas : BJM Regular 4B Pagi
    
    int sisi, panjang, lebar, hasil;
    
    public Rumus(){
        sisi = 0;
        panjang = 0;
        lebar = 0;
        hasil = 0;
    }
    
    public int getHasil(){
        return hasil;
    }
    
    public void hitungLuasPersegi(){
        hasil = sisi * sisi;
    }
    
    public void hitungLuasPersegiPanjang(){
        hasil = panjang * lebar;
    }
    
    
}
