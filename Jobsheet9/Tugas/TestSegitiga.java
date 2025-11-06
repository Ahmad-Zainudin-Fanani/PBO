package Jobsheet9.Tugas;

public class TestSegitiga {
    public static void main(String[] args) {
      Segitiga s = new Segitiga();

      System.out.println("Sisa sudut (diketahui A=60°): " + s.totalSudut(60));
      System.out.println("Sisa sudut (A=60°, B=45°): " + s.totalSudut(60, 45));

      System.out.println("Keliling (3,4,5): " + s.keliling(3, 4, 5));
      System.out.printf("Keliling (a=3, b=4, segitiga siku-siku): %.2f%n", s.keliling(3, 4));
    }
}