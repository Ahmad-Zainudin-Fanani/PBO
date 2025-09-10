package Jobsheet1.Tugas_Praktikum;

interface Wearable {
    void pakai();
}

public class HybridDevice extends Smartphone implements Wearable {
    int kapasitasBaterai;
    boolean tahanAir;

    public HybridDevice(String merk, int kamera, int kapasitasBaterai, boolean tahanAir) {
        super(merk, kamera);
        this.kapasitasBaterai = kapasitasBaterai;
        this.tahanAir = tahanAir;
    }

    public void pakai() {
        System.out.println(merk + " dipakai di pergelangan tangan seperti smartwatch.");
    }

    public void navigasi() {
        System.out.println(merk + " digunakan untuk navigasi.");
    }

    public void info() {
        super.info();
        System.out.println("Baterai: " + kapasitasBaterai + "mAh, Tahan Air: " + tahanAir);
    }
}
