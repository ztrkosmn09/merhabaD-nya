package NesneIlıskıler.UygulamaAssa;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Ogrenci.setOkul("Süleyman Dem,rel Üniversitesi");
        Adress adres1=new Adress("AYDIN","Efeler","Zeybek","1543","9");
        Ogrenci ogrenci1=new Ogrenci("Osman","Ozturk",1985,"031130");
        ArrayList<String>  dersler=new ArrayList<>();
        dersler.add("Matemetik");
        dersler.add("Fizik");
        dersler.add("Kimya");
        ogrenci1.setDersler(dersler);
        ogrenci1.setAdress(adres1);
        ArrayList<String> numaralar=new ArrayList<>();
        numaralar.add("0555 419 4556");
        numaralar.add("0505 807 4886");
        ogrenci1.setTelefonNumaraları(numaralar);
        Araba araba1=new Araba("Honda","Jazz",2005);
        Araba araba2=new Araba("Ford","Focus",1999);
        ArrayList<Araba> arabas=new ArrayList<>();
        arabas.add(araba1);
        arabas.add(araba2);
        ogrenci1.setArabas(arabas);

       bilgileriYazdır(ogrenci1);

    }
    public static void bilgileriYazdır(Ogrenci ogrenci){
        System.out.println("Adi: "+ogrenci.getAd());
        System.out.println("SoyAdi: "+ogrenci.getSoyad());
        System.out.println("Dogum yılı: "+ogrenci.getDogumyılı());
        System.out.println("Okul Numarası: "+ogrenci.getOkulNumaraları());
        System.out.println("Telefon Numaraları: "+ogrenci.getTelefonNumaraları());
        System.out.println("Dersleri: "+ogrenci.getDersler());
        System.out.println("Okulu: "+Ogrenci.getOkul());
        System.out.println("Adres: "+ogrenci.getAdress());
        ArrayList<Araba> arabas=ogrenci.getArabas();
        for (Araba araba:arabas
             ) {
            System.out.println(araba);

        }


    }
}
