package UTS;

class PewarisanHewan {
    private String nama;

    PewarisanHewan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

class Kucing extends PewarisanHewan {
    private String ras;

    Kucing(String nama, String ras) {
        super(nama);
        this.ras = ras;
    }

void tampilkanData() {
    System.out.println("Nama: " + super.getNama());
    System.out.println("Ras: " + ras);
    }
}

public class DemoSuperPrivate {
    public static void main(String[] args) {
        Kucing k = new Kucing("Miko", "Persia");
        k.tampilkanData();
    }
}