package Jobsheet4.Tugas;

public class DetailPinjam {
    private Buku buku; // Relasi Aggregasi: DetailPinjam has-a Buku
    private int kuantitas;

    public DetailPinjam(Buku buku, int kuantitas) {
        this.buku = buku;
        this.kuantitas = kuantitas;
    }

    // Getters
    public Buku getBuku() { return buku; }
    public int getKuantitas() { return kuantitas; }

    // Metode untuk menampilkan detail item
    public String info() {
        return "- Buku: " + buku.getJudul() + " (" + buku.getKode() + "), Jumlah: " + kuantitas;
    }
}
