package NesneIlıskıler.UygulamaAssa;

import java.util.ArrayList;

public class Ogrenci {
    private String ad;
    private String soyad;
    private int dogumyılı;
    private ArrayList<String > telefonNumaraları;
    private String okulNumaraları;
    private static String okul;
    private ArrayList<String> dersler;
    private Adress adress;
    private ArrayList<Araba> arabas;

    public Ogrenci(String ad, String soyad, int dogumyılı, String okulNumaraları) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumyılı = dogumyılı;
        this.okulNumaraları = okulNumaraları;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getDogumyılı() {
        return dogumyılı;
    }

    public void setDogumyılı(int dogumyılı) {
        this.dogumyılı = dogumyılı;
    }

    public ArrayList<String> getTelefonNumaraları() {
        return telefonNumaraları;
    }

    public void setTelefonNumaraları(ArrayList<String> telefonNumaraları) {
        this.telefonNumaraları = telefonNumaraları;
    }

    public String getOkulNumaraları() {
        return okulNumaraları;
    }

    public void setOkulNumaraları(String okulNumaraları) {
        this.okulNumaraları = okulNumaraları;
    }

    public static String getOkul() {
        return okul;
    }

    public static void setOkul(String okul) {
        Ogrenci.okul = okul;
    }

    public ArrayList<String> getDersler() {
        return dersler;
    }

    public void setDersler(ArrayList<String> dersler) {
        this.dersler = dersler;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public ArrayList<Araba> getArabas() {
        return arabas;
    }

    public void setArabas(ArrayList<Araba> arabas) {
        this.arabas = arabas;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", dogumyılı=" + dogumyılı +
                ", telefonNumaraları=" + telefonNumaraları +
                ", okulNumaraları='" + okulNumaraları + '\'' +
                ", dersler=" + dersler +
                ", adress=" + adress +
                ", arabas=" + arabas +
                '}';
    }
}
