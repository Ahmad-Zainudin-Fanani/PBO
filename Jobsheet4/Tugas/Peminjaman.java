package Jobsheet4.Tugas;

public class Peminjaman {
    private Anggota anggota; // Relasi Aggregasi: Peminjaman has-a Anggota
    private DetailPinjam[] listDetail; // Relasi One-to-Many: Peminjaman has-many DetailPinjam
    private String tglPinjam;
    private int jumlahItem = 0; // Counter untuk item yang sudah dimasukkan

    // Konstruktor
    public Peminjaman(String tglPinjam, Anggota anggota, int maxItem) {
        this.tglPinjam = tglPinjam;
        this.anggota = anggota;
        this.listDetail = new DetailPinjam[maxItem]; // Inisialisasi array kosong
    }

    // Method untuk menambahkan DetailPinjam ke array
    public void addDetailPinjam(DetailPinjam detail) {
        if (jumlahItem < listDetail.length) {
            listDetail[jumlahItem] = detail;
            jumlahItem++;
            // Logika: Kurangi stok buku setelah dipinjam
            detail.getBuku().setStok(detail.getBuku().getStok() - detail.getKuantitas());
            System.out.println("Buku '" + detail.getBuku().getJudul() + "' berhasil ditambahkan ke list pinjaman.");
        } else {
            System.out.println("Gagal: List pinjaman sudah penuh.");
        }
    }

    // Method untuk menghitung total kuantitas buku yang dipinjam
    public int hitungTotalKuantitas() {
        int total = 0;
        for (int i = 0; i < jumlahItem; i++) {
            total += listDetail[i].getKuantitas();
        }
        return total;
    }

    // Method info()
    public String info() {
        String info = "\n--- DETAIL PEMINJAMAN ---\n";
        info += "Tanggal Pinjam: " + tglPinjam + "\n";
        info += "Anggota: " + anggota.info() + "\n";
        info += "Daftar Buku Dipinjam (" + jumlahItem + " item):\n";
        
        for (int i = 0; i < jumlahItem; i++) {
            info += listDetail[i].info() + "\n";
        }
        info += "Total Kuantitas Buku: " + hitungTotalKuantitas() + "\n";
        return info;
    }
}
