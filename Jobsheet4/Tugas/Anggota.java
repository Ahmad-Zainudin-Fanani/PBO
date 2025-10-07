package Jobsheet4.Tugas;

public class Anggota {
    private String nip;
    private String nama;

    public Anggota(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    // Getters
    public String getNip() { return nip; }
    public String getNama() { return nama; }

    public String info() {
        return "NIP: " + nip + ", Nama: " + nama;
    }
}
