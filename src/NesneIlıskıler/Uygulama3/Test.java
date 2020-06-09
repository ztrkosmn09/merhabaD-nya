package NesneIlıskıler.Uygulama3;

public class Test {
    public static void main(String[] args) {
        Ogrenci ogrenci1=new Ogrenci("Osman","Yılmaz",1990,"031130",null);
        Adress adres1=new Adress("Aydın","Efeler","Zeybek","1453","9");
        ogrenci1.setAdress(adres1);
        bilgileriYazdır(ogrenci1);
        System.out.println("------------------------------");
        Ogrenci ogr2=new Ogrenci("Seyma","Ozturk",1988,"25456",null);
        Adress adres2=new Adress("Ankara","Etimesgut","Yapracık","578","26");
        ogr2.setAdress(adres2);
        bilgileriYazdır(ogr2);
    }
    public static void bilgileriYazdır(Ogrenci ogr){
        System.out.println("Adı: "+ogr.getAd());
        System.out.println("Soyadı: "+ogr.getSoyad());
        System.out.println("Dogum yılı: "+ogr.getDogumyılı());
        System.out.println("Okul numarası: "+ogr.getOkulNumaraları());
        Adress adress=ogr.getAdress();
        System.out.println("Sehir: "+adress.getSehir()+"\n"+"Ilce: "+adress.getIlce()+"\n"+"Mahalle: "+adress.getMahalle()
                +"\n"+"Sokak: "+adress.getSokak()+"\n"+"Evno: "+adress.getEvNo());
    }
}
