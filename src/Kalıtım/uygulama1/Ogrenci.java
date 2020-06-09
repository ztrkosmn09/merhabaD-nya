package Kalıtım.uygulama1;

import java.util.ArrayList;

public class Ogrenci extends Kısı{
    public Ogrenci(String ad, String soyad, int dogumYılı) {
        super(ad, soyad, dogumYılı);
    }
    private String okulNo;
    private ArrayList<String> dersler;

    public Ogrenci(String ad, String soyad, int dogumYılı, String okulNo, ArrayList<String> dersler) {
        super(ad, soyad, dogumYılı);
        this.okulNo = okulNo;
        this.dersler = dersler;
    }

    public String getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(String okulNo) {
        this.okulNo = okulNo;
    }

    public ArrayList<String> getDersler() {
        return dersler;
    }

    public void setDersler(ArrayList<String> dersler) {
        this.dersler = dersler;
    }

    @Override
    public String toString() {
        return "Adı: "+getAd()+"\n"+"Soyad: "+getSoyad()+"\n"+
                "okulNo='" + okulNo + '\n' +
                "dersler=" + dersler ;
    }
}
