package Jobsheet3.tugas;

public class Anggota {
    private String noKTP;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPinjaman;

    // Konstruktor
    public Anggota(String noKTP, String nama, int limitPeminjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0;
    }

    // Metode Getter
    public String getNama() {
        return nama;
    }

    public int getLimitPeminjaman() {
        return limitPeminjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // Method untuk meminjam uang
    public void pinjam(int uang) {
        if ((this.jumlahPinjaman + uang) <= limitPeminjaman) {
            this.jumlahPinjaman += uang;
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
    }

    // Method untuk mengangsur dengan validasi 10%
    public void angsur(int uang) {
        if (uang < 0.1 * this.jumlahPinjaman) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        } else {
            this.jumlahPinjaman -= uang;
        }
    }
}