package Jobsheet4.Tugas;

public class Buku {
    private String kode;
    private String judul;
    private int stok;

    public Buku(String kode, String judul, int stok) {
        this.kode = kode;
        this.judul = judul;
        this.stok = stok;
    }

    // Getters
    public String getKode() { return kode; }
    public String getJudul() { return judul; }
    public int getStok() { return stok; }
    
    // Setters
    public void setStok(int stok) { this.stok = stok; }

    public String info() {
        return "Kode Buku: " + kode + ", Judul: " + judul + ", Stok: " + stok;
    }
}
