package Jobsheet1.Tugas_Praktikum;

public class GamingLaptop extends Laptop{
    String gpu;
    boolean rgbKeyboard;

    public GamingLaptop(String merk, int ram, String gpu, boolean rgbKeyboard) {
        super(merk, ram);
        this.gpu = gpu;
        this.rgbKeyboard = rgbKeyboard;
    }

    public void mainGame() {
        System.out.println(merk + " sedang digunakan untuk bermain game dengan GPU " + gpu);
    }

    public void aktifkanRGB() {
        if (rgbKeyboard)
            System.out.println("Keyboard RGB aktif!");
        else
            System.out.println("Tidak ada RGB di keyboard ini.");
    }

    public void info() {
        super.info();
        System.out.println("GPU: " + gpu + ", RGB Keyboard: " + rgbKeyboard);
    }
}
