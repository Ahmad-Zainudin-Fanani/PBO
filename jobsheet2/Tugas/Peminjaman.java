package jobsheet2.Tugas;

public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public double harga;
    public int lamaSewa;

    public void tampilDataPeminjaman() {
        System.out.println("ID Member     : " + id);
        System.out.println("Nama Member   : " + namaMember);
        System.out.println("Nama Game     : " + namaGame);
        System.out.println("Harga / Hari  : Rp" + harga);
        System.out.println("Lama Sewa     : " + lamaSewa + " hari");
        System.out.println("Total Bayar   : Rp" + hitungTotalBayar());
    }

    public double hitungTotalBayar() {
        return harga * lamaSewa;
    }
}