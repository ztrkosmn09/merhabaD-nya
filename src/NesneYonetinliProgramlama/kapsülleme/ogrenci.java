package NesneYonetinliProgramlama.kapsülleme;

public class ogrenci {
    private String ad;
    private String soyad;
    private int dogumyılı;
    private String okulno;

    public ogrenci(String ad, String soyad, int dogumyılı, String okulno) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumyılı = dogumyılı;
        this.okulno = okulno;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        if (ad.length()<3) {
            System.out.println("uygun olmayan ad girisi yapıldı.varsayılan olarak kullanıcı atandu");
            this.ad="kullanıcı";
        }
        else{ this.ad = ad;}
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
        if(dogumyılı<1900 || dogumyılı>2020){
            System.out.println("uygun giris yapmadınız varsayılan deger olarak 0 atandı");
            this.dogumyılı=0;
        }
        this.dogumyılı = dogumyılı;
    }

    public String getOkulno() {
        return okulno;
    }

    public void setOkulno(String okulno) {
        this.okulno = okulno;
    }
}
