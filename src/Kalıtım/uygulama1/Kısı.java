package Kalıtım.uygulama1;

public class Kısı {
    private String ad;
    private String soyad;
    private int dogumYılı;

    public Kısı(String ad, String soyad, int dogumYılı) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumYılı = dogumYılı;
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

    public int getDogumYılı() {
        return dogumYılı;
    }

    public void setDogumYılı(int dogumYılı) {
        this.dogumYılı = dogumYılı;
    }

    @Override
    public String toString() {
        return "Kısı{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", dogumYılı=" + dogumYılı +
                '}';
    }
}
