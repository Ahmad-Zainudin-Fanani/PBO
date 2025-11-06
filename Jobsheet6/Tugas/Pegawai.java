package Jobsheet6.Tugas;

public class Pegawai {
    private String nip;
    private String nama;
    private String alamat;

    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    // Base class: default gaji = 0, akan dioverride oleh subclass
    public int getGaji() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - %s", nama, nip, alamat);
    }
}
