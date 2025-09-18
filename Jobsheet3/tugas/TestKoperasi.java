package Jobsheet3.tugas;
import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPeminjaman());

        // Meminta input untuk pinjaman
        System.out.println("\nMasukkan nominal pinjaman:");
        System.out.print("Nominal: ");
        int pinjaman = scanner.nextInt();
        donny.pinjam(pinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        // Meminta input untuk angsuran
        System.out.println("\nMasukkan nominal angsuran:");
        System.out.print("Nominal: ");
        int angsuran = scanner.nextInt();
        donny.angsur(angsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

    }
}