package Jobsheet1.Tugas_Praktikum;

public class Laptop {
    String merk;
    int ram;

    public Laptop(String merk, int ram) {
        this.merk = merk;
        this.ram = ram;
    }

    public void nyalakan() {
        System.out.println(merk + " sedang dinyalakan...");
    }

    public void matikan() {
        System.out.println(merk + " sedang dimatikan...");
    }

    public void info() {
        System.out.println("Laptop Merk: " + merk + ", RAM: " + ram + "GB");
    }
}