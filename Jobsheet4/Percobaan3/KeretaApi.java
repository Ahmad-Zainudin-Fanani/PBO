package Jobsheet4.Percobaan3;

public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    public KeretaApi(String nama, String kelas, Pegawai masinis) { 
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    public KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten) { 
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    // ... (Setter dan Getter)

    // Method info() yang menyebabkan NullPointerException jika asisten null
    //public String info() { 
        //String info = "";
        //info += "Nama: " + this.nama + "\n";
        //info += "Kelas: " + this.kelas + "\n";
        //info += "Masinis: \n" + this.masinis.info() + "\n";
        //info += "Asisten: \n" + this.asisten.info() + "\n"; // BARIS ERROR JIKA ASISTEN NULL
        //return info;
    //}

     public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: \n" + this.masinis.info() + "\n";
        
        // PERBAIKAN: Cek apakah asisten tidak NULL
        if (this.asisten != null) {
             info += "Asisten: \n" + this.asisten.info() + "\n";
        } else {
             info += "Asisten: \n" + "Tidak ada Asisten Bertugas\n\n";
        }
       
        return info;
     }
}