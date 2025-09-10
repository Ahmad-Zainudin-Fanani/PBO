package Jobsheet1.Langkah2_praktikum;

public class SepedaGunung extends Sepeda{
    private String tipeSuspensi;

    public void setTipeSuspensi(String newValue){
        tipeSuspensi =newValue;
    }

    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Tipe suspensi: " + tipeSuspensi);
    }

}
