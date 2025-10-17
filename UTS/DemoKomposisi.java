package UTS;
class Jantung {
    public void berdetak() {
        System.out.println("Jantung berdetak...");
    }
}

// Class Manusia (Composition)
class Manusia {
    private String nama;
    private Jantung jantung;

    public Manusia(String nama) {
        this.nama = nama;
        this.jantung = new Jantung();
    }
    
    public void hidup() {
        System.out.println(nama + " sedang hidup.");
        jantung.berdetak();
    }
}

// Main Class
public class DemoKomposisi {
    public static void main(String[] args) {
        Manusia m1 = new Manusia("Andi");
        m1.hidup();
    }
}