package NesneYonetinliProgramlama.Uygulama2;

import java.util.ArrayList;

public class Ogrenci {
    private String isim;
    private String soyisim;
    private int dogumYılı;
    private String okulNo;
    private ArrayList<String > dersler;

    public Ogrenci(String isim, String soyisim, int dogumYılı, String okulNo, ArrayList<String> dersler) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumYılı = dogumYılı;
        this.okulNo = okulNo;
        this.dersler = dersler;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getDogumYılı() {
        return dogumYılı;
    }

    public void setDogumYılı(int dogumYılı) {
        this.dogumYılı = dogumYılı;
    }

    public String getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(String okulNo) {
        this.okulNo = okulNo;
    }
    public void setDersler(ArrayList<String> dersler){this.dersler=dersler;}
    public ArrayList<String> getDersler(){return dersler;}

    @Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", dogumYılı=" + dogumYılı +
                ", okulNo='" + okulNo + '\'' +
                ", dersler=" + dersler +
                '}';
    }
}
