package NesneYonetinliProgramlama.Uygulama1;

import java.util.ArrayList;

public class OgrenciIslemleri {

    public void bilgileriGoster(Ogrencı ogrencı){
        System.out.println("Adı: "+ogrencı.getAd());
        System.out.println("SoyAdı: "+ogrencı.getSoyad());
        System.out.println("Dogum Tarihi: : "+ogrencı.getDoguöYılı());
        System.out.println("OkulNo: "+ogrencı.getOkulNum());
        System.out.println("Okulu: "+Ogrencı.getOkulu());   // okulu static tanımladıgımız icin Ogrencı class ın dan  ulasabiliriz.
        System.out.println("Aldıgı Dersler : "+ogrencı.getDersler());

    }
    public  void derslerıGoster(Ogrencı ogrencı){
        System.out.println(ogrencı.getAd()+" nın dersleri: ");
        for (String ders:ogrencı.getDersler()){
            System.out.println(ogrencı.getDersler());
        }
    }
    public  void ogrencıDersArama(Ogrencı ogrencı,String ders){
        boolean durum=true;
        ArrayList<String> dersler=ogrencı.getDersler();
        for (String d:dersler){
            if (d.equalsIgnoreCase(ders)){
                System.out.println(ogrencı.getAd()+" ad lı ogrenci bu dersi alıyor.");
                durum=false;
                break;
            }
        }
        if (durum) System.out.println(ogrencı.getAd()+" ad lı ogrenci bu dersi almıyor.");
    }
}
