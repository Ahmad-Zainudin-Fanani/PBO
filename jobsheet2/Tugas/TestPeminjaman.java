package jobsheet2.Tugas;

public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman pj1 = new Peminjaman();
        pj1.id = 1;
        pj1.namaMember = "Budi";
        pj1.namaGame = "FIFA 2025";
        pj1.harga = 15000;
        pj1.lamaSewa = 3;

        pj1.tampilDataPeminjaman();
    }
}
