package Jobsheet9.Tugas;

class Manusia {
    public void bernafas() {
        System.out.println("Manusia bernapas.");
    }
    public void makan() {
        System.out.println("Manusia makan secara umum.");
    }
}

class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen makan sambil diskusi riset.");
    }
    public void lembur() {
        System.out.println("Dosen lembur menyusun materi & penelitian.");
    }
}

class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan hemat di kantin.");
    }
    public void tidur() {
        System.out.println("Mahasiswa tidur setelah belajar.");
    }
}

public class DemoDMD {
    public static void main(String[] args) {
        // Dynamic Method Dispatch:
        // referensi bertipe Manusia menunjuk objek turunan yang berbeda
        Manusia ref;

        ref = new Dosen();
        ref.bernafas();           // milik Manusia
        ref.makan();              // versi Dosen (override) -> ditentukan saat runtime
        // ((Dosen) ref).lembur(); // akses khusus Dosen (opsional)

        System.out.println();

        ref = new Mahasiswa();
        ref.bernafas();           // milik Manusia
        ref.makan();              // versi Mahasiswa (override)
    }
}
