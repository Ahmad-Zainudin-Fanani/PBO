package UTS;
// ===== Class Guru =====
class Guru {
    private String nama;

    public Guru(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void mengajar() {
        System.out.println(nama + " sedang mengajar.");
    }
}

// ===== Class Sekolah (Aggregation) =====
class Sekolah {
    private String namaSekolah;
    private Guru guru;

    public Sekolah(String namaSekolah, Guru guru) {
        this.namaSekolah = namaSekolah;
        this.guru = guru;
    }

    public void infoSekolah() {
        System.out.println("Nama Sekolah: " + namaSekolah);
        System.out.println("Guru: " + guru.getNama());
    }
}

// ===== Main Class =====
public class DemoAgregasiSederhana {
    public static void main(String[] args) {
        Guru guru1 = new Guru("Pak Budi");
        Sekolah sekolah1 = new Sekolah("SD Negeri Ngijo", guru1);
        
        sekolah1.infoSekolah();
        guru1.mengajar();
    }
}