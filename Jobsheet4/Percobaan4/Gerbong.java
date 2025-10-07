package Jobsheet4.Percobaan4;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    public Gerbong(String kode, int jumlah) { 
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi() { 
        for (int i = 0; i < arrayKursi.length; i++) { 
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public void setKode(String kode) { 
        this.kode = kode;
    }

    public String getKode() { 
        return kode;
    }

    public Kursi[] getArrayKursi() { 
        return arrayKursi;
    }

    // MODIFIKASI: Mencegah penumpang menduduki kursi yang sudah terisi
    public void setPenumpang(Penumpang penumpang, int nomor) { 
        int index = nomor - 1;

        // 1. Cek validitas nomor kursi
        if (index >= 0 && index < arrayKursi.length) {
            
            // 2. Cek apakah kursi sudah terisi (penumpang tidak null)
            if (this.arrayKursi[index].getPenumpang() == null) {
                // KASUS BERHASIL: Kursi kosong, isikan penumpang
                this.arrayKursi[index].setPenumpang(penumpang);
                System.out.println("Berhasil: Penumpang " + penumpang.getNama() + " berhasil duduk di kursi " + nomor);
            } else {
                // KASUS GAGAL 1: Kursi sudah terisi
                System.out.println("Gagal: Kursi nomor " + nomor + " sudah terisi oleh " + this.arrayKursi[index].getPenumpang().getNama());
            }
        } else {
            // KASUS GAGAL 2: Nomor kursi tidak valid
            System.out.println("Gagal: Nomor kursi tidak valid.");
        }
    }

    public String info() { 
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) { 
            info += kursi.info();
        }
        return info;
    }
}