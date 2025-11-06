package Jobsheet6.Tugas;

public class Dosen extends Pegawai {
    private int jumlahSKS;
    public static final int TARIF_SKS = 150_000; // contoh tarif per SKS

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int sks) {
        this.jumlahSKS = sks;
    }

    @Override
    public int getGaji() {
        return jumlahSKS * TARIF_SKS;
    }
}
