package Jobsheet9.Tugas;

public class Segitiga {
    // atribut (sesuai diagram, tidak wajib dipakai di perhitungan)
    private int sudut;

    public void setSudut(int sudut) {
        this.sudut = sudut;
    }

    public int getSudut() {
        return sudut;
    }

    // OVERLOADING 1: hitung sisa sudut jika diketahui 1 sudut
    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    // OVERLOADING 2: hitung sisa sudut jika diketahui 2 sudut
    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    // OVERLOADING 3: keliling jika semua sisi diketahui
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // OVERLOADING 4: keliling segitiga siku-siku jika diketahui 2 sisi tegak (a, b)
    // c dihitung dengan Pythagoras: c = sqrt(a^2 + b^2)
    public double keliling(int sisiA, int sisiB) {
        double c = Math.sqrt((double) sisiA * sisiA + (double) sisiB * sisiB);
        return sisiA + sisiB + c;
    }
}
