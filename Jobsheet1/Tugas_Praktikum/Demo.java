package Jobsheet1.Tugas_Praktikum;

public class Demo {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Asus", 8);
        Smartphone hp1 = new Smartphone("Samsung", 48);
        GamingLaptop gaming = new GamingLaptop("MSI", 16, "RTX 4060", true);
        HybridDevice hybrid = new HybridDevice("Xiaomi Watch", 12, 500, true);


        laptop1.nyalakan();
        laptop1.info();
        laptop1.matikan();

        hp1.telepon();
        hp1.info();

        gaming.nyalakan();
        gaming.mainGame();
        gaming.aktifkanRGB();
        gaming.info();

        hybrid.kirimPesan();
        hybrid.navigasi();
        hybrid.pakai();
        hybrid.info();
    }
}
