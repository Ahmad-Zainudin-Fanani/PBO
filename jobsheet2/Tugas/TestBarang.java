package jobsheet2.Tugas;

public class TestBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        brg1.kode = "BRG001";
        brg1.namaBarang = "Keyboard Gaming";
        brg1.hargaDasar = 500000;
        brg1.diskon = 10;

        brg1.tampilData();
    }
}
