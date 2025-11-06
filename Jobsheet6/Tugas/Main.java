package Jobsheet6.Tugas;

public class Main {
    public static void main(String[] args) {
        // Buat beberapa objek Dosen
        Dosen d1 = new Dosen("1987654321", "Dr. Andi", "Kediri");
        d1.setSKS(12);

        Dosen d2 = new Dosen("1987000111", "Prof. Sari", "Malang");
        d2.setSKS(16);

        Dosen d3 = new Dosen("1977123456", "Ir. Bima", "Surabaya");
        d3.setSKS(10);

        // Buat daftar gaji dan masukkan pegawai
        DaftarGaji dg = new DaftarGaji(10);
        dg.addPegawai(d1);
        dg.addPegawai(d2);
        dg.addPegawai(d3);

        // Tampilkan nama & gaji
        dg.printSemuaGaji();
    }
}
