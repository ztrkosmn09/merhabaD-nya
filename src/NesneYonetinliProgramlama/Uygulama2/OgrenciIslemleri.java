package NesneYonetinliProgramlama.Uygulama2;

import java.util.ArrayList;

public class OgrenciIslemleri {
    private static ArrayList<Ogrenci> ogrencis=new ArrayList<>();

    public static ArrayList<Ogrenci> getOgrencis() {
        return ogrencis;
    }

    public static void setOgrencis(ArrayList<Ogrenci> ogrencis) {
        OgrenciIslemleri.ogrencis = ogrencis;
    }
    public void ogrencıAdd(Ogrenci ogrenci){
        boolean durum=ogrencis.add(ogrenci);
        if (durum) System.out.println(ogrenci.getIsim()+" Basarıyla eklendi.");
        else System.out.println("Bir hata olustu.");
    }
    public void ogrencıRemove(Ogrenci ogrenci){
        boolean durum=ogrencis.remove(ogrenci);
        if (durum) System.out.println(ogrenci.getIsim()+" Basarıyla silindi.");
        else System.out.println("Bir hata olustu.");
    }
    public void ogrencıListele(){
        for (Ogrenci as:ogrencis){
            System.out.println(as);
        }
    }
}
