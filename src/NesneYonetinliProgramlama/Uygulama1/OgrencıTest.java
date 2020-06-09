package NesneYonetinliProgramlama.Uygulama1;

import java.util.ArrayList;

public class OgrencıTest {
    public static void main(String[] args) {
        ArrayList<String> dersler=new ArrayList<>();
        ArrayList<String> dersler2=new ArrayList<>();
        dersler2.add("Almanca");
        dersler2.add("ıngılızce");
        dersler2.add("Fransızca");
        dersler2.add("Türkce");
        dersler.add("Matematık");
        dersler.add("Fizik");
        dersler.add("Kimya");
        dersler.add("Biyoloji");
        Ogrencı ogr1=new Ogrencı("Osman","Ozturk",1985,"031130",dersler);
        Ogrencı ogr2=new Ogrencı("Enes","Cınar",1994,"12345",dersler2);
        Ogrencı ogr3=new Ogrencı("Numan","Ekrem",2013,"2345",dersler2);

        OgrenciIslemleri ogrenciIslemleri=new OgrenciIslemleri();
        /*ogrenciIslemleri.bilgileriGoster(ogr1);
        ogrenciIslemleri.bilgileriGoster(ogr2);
        ogrenciIslemleri.bilgileriGoster(ogr3);*/
        ogrenciIslemleri.ogrencıDersArama(ogr1,"Matematık");
        ogrenciIslemleri.ogrencıDersArama(ogr1,"Elektrik");
        ogrenciIslemleri.ogrencıDersArama(ogr2,"kimya");


    }



}
