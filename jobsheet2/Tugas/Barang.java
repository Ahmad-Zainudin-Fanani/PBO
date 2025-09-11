package jobsheet2.Tugas;

public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;   // dalam %

    public int hitungHargaJual() {
        int potongan = (int)(diskon / 100 * hargaDasar);
        return hargaDasar - potongan;
    }

    public void tampilData() {
        System.out.println("Kode Barang   : " + kode);
        System.out.println("Nama Barang   : " + namaBarang);
        System.out.println("Harga Dasar   : Rp" + hargaDasar);
        System.out.println("Diskon        : " + diskon + "%");
        System.out.println("Harga Jual    : Rp" + hitungHargaJual());
    }
}
