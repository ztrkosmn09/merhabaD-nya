package NesneYonetinliProgramlama.Uygulama1;

import java.util.ArrayList;

public class Ogrencı {
    private static String okulu;
    private String  ad;
    private String soyad;
    private int doguöYılı;
    private String okulNum;
    private ArrayList<String > dersler;

    public Ogrencı(String ad, String soyad, int doguöYılı, String okulNum, ArrayList<String> dersler) {
        this.ad = ad;
        this.soyad = soyad;
        this.doguöYılı = doguöYılı;
        this.okulNum = okulNum;
        this.dersler = dersler;
    }

    public static String getOkulu() {
        return okulu;
    }

    public static void setOkulu(String okulu) {
        Ogrencı.okulu = okulu;
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

    public int getDoguöYılı() {
        return doguöYılı;
    }

    public void setDoguöYılı(int doguöYılı) {
        this.doguöYılı = doguöYılı;
    }

    public String getOkulNum() {
        return okulNum;
    }

    public void setOkulNum(String okulNum) {
        this.okulNum = okulNum;
    }

    public ArrayList<String> getDersler() {
        return dersler;
    }

    public void setDersler(ArrayList<String> dersler) {
        this.dersler = dersler;
    }

    @Override
    public String toString() {
        return "Ogrencı{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", doguöYılı=" + doguöYılı +
                ", okulNum='" + okulNum + '\'' +
                ", dersler=" + dersler +
                '}';
    }
}
