package Jobsheet1.Tugas_Praktikum;

public class Smartphone {
    String merk;
    int kamera;

    public Smartphone(String merk, int kamera) {
        this.merk = merk;
        this.kamera = kamera;
    }

    public void telepon() {
        System.out.println(merk + " sedang menelepon...");
    }

    public void kirimPesan() {
        System.out.println(merk + " sedang mengirim pesan...");
    }

    public void info() {
        System.out.println("Smartphone Merk: " + merk + ", Kamera: " + kamera + "MP");
    }
}
