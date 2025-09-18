package Jobsheet3.motorencapsulation;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();

        // Bagian 1: Status Awal dan Percobaan saat Mesin Mati
        System.out.println("=== Percobaan Saat Mesin Mati ===");
        motor.printStatus();
        motor.tambahKecepatan(); 
        motor.printStatus();

        // Bagian 2: Menyalakan Mesin dan Menambah Kecepatan Bertahap
        System.out.println("\n=== Menyalakan Mesin dan Menambah Kecepatan ===");
        motor.nyalakanMesin();
        motor.printStatus();

        // Menambah kecepatan 20, 40, 60, 80, 100
        motor.tambahKecepatan();
        motor.printStatus();
        
        motor.tambahKecepatan();
        motor.printStatus();
        
        motor.tambahKecepatan();
        motor.printStatus();
        
        motor.tambahKecepatan();
        motor.printStatus();
        
        // Bagian 3: Mencoba Menambah Kecepatan di Atas Batas 100
        System.out.println("\n=== Mencoba Melebihi Batas Kecepatan ===");
        motor.tambahKecepatan();
        motor.printStatus();

        // Bagian 4: Mematikan Mesin
        System.out.println("\n=== Mematikan Mesin ===");
        motor.matikanMesin();
        motor.printStatus();
    }
}