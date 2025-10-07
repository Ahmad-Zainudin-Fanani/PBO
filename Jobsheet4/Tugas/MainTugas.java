package Jobsheet4.Tugas;

public class MainTugas {
    public static void main(String[] args) {
        // 1. Instansiasi Anggota
        Anggota a1 = new Anggota("001", "Fanani");
        
        // 2. Instansiasi Buku
        Buku b1 = new Buku("B001", "OOP with Java", 5);
        Buku b2 = new Buku("B002", "Basis Data Lanjut", 3);
        
        // Cek stok awal
        System.out.println("Stok Awal B1: " + b1.getStok());
        System.out.println("Stok Awal B2: " + b2.getStok());

        // 3. Instansiasi Peminjaman (Max 5 item buku berbeda)
        Peminjaman p1 = new Peminjaman("2025-01-15", a1, 5);
        
        // 4. Instansiasi DetailPinjam dan masukkan ke Peminjaman
        DetailPinjam dp1 = new DetailPinjam(b1, 2); // Pinjam 2 buku B1
        DetailPinjam dp2 = new DetailPinjam(b2, 1); // Pinjam 1 buku B2

        p1.addDetailPinjam(dp1);
        p1.addDetailPinjam(dp2);

        // 5. Tampilkan Informasi Peminjaman
        System.out.println(p1.info());
        
        // 6. Cek sisa stok setelah peminjaman
        System.out.println("\n--- SISA STOK BUKU ---");
        System.out.println("Sisa Stok B1 (OOP with Java): " + b1.getStok()); // Stok berkurang 5-2 = 3
        System.out.println("Sisa Stok B2 (Basis Data Lanjut): " + b2.getStok()); // Stok berkurang 3-1 = 2
    }
}
