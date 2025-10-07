package Jobsheet4.Percobaan4;

public class MainPercobaan4 {
    public static void main(String[] args) {
        // Percobaan Awal
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        
        // Memasukkan Mr. Krab ke Kursi nomor 1 (Berhasil)
        gerbong.setPenumpang(p, 1);
        
        System.out.println("\n--- TAMPILAN AWAL ---");
        System.out.println(gerbong.info()); 

        // Jawaban Pertanyaan 4 (Menggunakan Gerbong yang sudah dimodifikasi)
        Penumpang budi = new Penumpang("54321", "Budi Santoso");
        System.out.println("--- PERCOBAAN PENUMPANG BARU DI KURSI 1 ---");
        // Akan GAGAL karena kursi 1 sudah terisi oleh Mr. Krab
        gerbong.setPenumpang(budi, 1);
        
        System.out.println("\n--- TAMPILAN SETELAH PERCOBAAN BUDI ---");
        System.out.println(gerbong.info()); 
    }
}
