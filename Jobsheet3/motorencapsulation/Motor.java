package Jobsheet3.motorencapsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin(){
        kontakOn = true;
    }
    
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatan(){
        if (kontakOn == true) {
            if (kecepatan < 100) {
                // Kecepatan akan bertambah 20
                kecepatan += 20;
                
                // Pastikan tidak melebihi 100 setelah penambahan
                if (kecepatan > 100) {
                    kecepatan = 100;
                    System.out.println("Kecepatan maksimal sudah tercapai! (100)\n");
                }
            } else {
                System.out.println("Kecepatan maksimal sudah tercapai! (100)\n");
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin off! \n");
        }
    }
    
    public void kurangiKecepatan(){
        if (kontakOn == true){
            if (kecepatan > 0) {
                 kecepatan -= 5;
            } else {
                kecepatan = 0;
            }
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }

    public void printStatus(){
        if (kontakOn == true){
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}