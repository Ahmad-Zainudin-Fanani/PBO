package UTS;

// public class Hewan {
//     private String nama = "Harimau";
// }

// class Kucing extends Hewan {
//     void tampilkan() {
//         System.out.println(super.nama);
//     }
// }

public class Hewan {
    private String nama = "Harimau";

    public String getNama() {
        return this.nama;
    }
}

class Kucing extends Hewan {
    
    void tampilkan() {
        System.out.println(super.getNama());
    }

    public static void main(String[] args) {
        Kucing kucingSaya = new Kucing();
        kucingSaya.tampilkan();
    }
}