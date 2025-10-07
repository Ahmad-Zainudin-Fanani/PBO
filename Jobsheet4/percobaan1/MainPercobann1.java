package Jobsheet4.percobaan1;

public class MainPercobann1 {
    public static void main(String[] args) {
        // Objek L (Constructor Berparameter)
        //Processor p = new Processor("Intel i5", 3);
        //Laptop L = new Laptop("Thinkpad", p);
        Laptop L = new Laptop("Thinkpad", new Processor("Intel i5", 3)); 
        L.info();

        // Objek L1 (Constructor Default + Setter)
        Processor p1 = new Processor();
        p1.setMerk("Intel i5");
        p1.setCache(4);
        
        Laptop L1 = new Laptop();
        L1.setMerk("Thinkpad");
        L1.setProc(p1);
        L1.info();
    }
}