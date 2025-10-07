package Jobsheet4.Percobaan3;

public class Mainpertanyaan {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis); // Asisten NULL
        
        System.out.println(keretaApi.info()); 
    }
}