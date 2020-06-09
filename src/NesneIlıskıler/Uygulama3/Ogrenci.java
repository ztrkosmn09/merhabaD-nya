package NesneIlıskıler.Uygulama3;
public class Ogrenci {
    private String ad;
    private String soyad;
    private int dogumyılı;
    private String okulNumaraları;
    private Adress adress;

    public Ogrenci(String ad, String soyad, int dogumyılı, String okulNumaraları, Adress adress) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumyılı = dogumyılı;
        this.okulNumaraları = okulNumaraları;
        this.adress = adress;
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

    public String getOkulNumaraları() {
        return okulNumaraları;
    }

    public void setOkulNumaraları(String okulNumaraları) {
        this.okulNumaraları = okulNumaraları;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", dogumyılı=" + dogumyılı +
                ", okulNumaraları='" + okulNumaraları + '\'' +
                ", adress=" + adress +
                '}';
    }
}
