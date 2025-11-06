package Jobsheet6.Tugas;

public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int idx = 0;

    public DaftarGaji(int kapasitas) {
        listPegawai = new Pegawai[kapasitas];
    }

    public void addPegawai(Pegawai p) {
        if (idx < listPegawai.length) {
            listPegawai[idx++] = p;
        } else {
            System.out.println("Daftar penuh, tidak bisa menambah pegawai lagi.");
        }
    }

    public void printSemuaGaji() {
        System.out.println("=== Daftar Gaji Pegawai ===");
        for (int i = 0; i < idx; i++) {
            Pegawai p = listPegawai[i];
            System.out.printf("%-25s | Gaji: Rp %,d%n", p.getNama(), p.getGaji());
        }
    }
}
