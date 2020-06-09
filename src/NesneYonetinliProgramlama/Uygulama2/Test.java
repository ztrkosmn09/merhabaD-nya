package NesneYonetinliProgramlama.Uygulama2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci("Osman","Ozturk",1985,"031130",null);
        ArrayList<String> dersler=new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");
        ogr1.setDersler(dersler);
        Ogrenci ogr2=new Ogrenci("Ali","Unal",1994,"12345",null );
        Ogrenci ogr3=new Ogrenci("Enes","Unal",1990,"98745",null );
        Ogrenci ogr4=new Ogrenci("Hakkı","Yavuz",1988,"18525",null);

        OgrenciIslemleri ogrenciIslemleri=new OgrenciIslemleri();
        ogrenciIslemleri.ogrencıAdd(ogr1);
        ogrenciIslemleri.ogrencıAdd(ogr2);
        ogrenciIslemleri.ogrencıAdd(ogr3);
        ogrenciIslemleri.ogrencıAdd(ogr4);

        System.out.println("-------------------------");
        ogrenciIslemleri.ogrencıListele();


    }
}
