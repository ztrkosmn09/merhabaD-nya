package Kalıtım.uygulama1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Ogretmen ogretmen1=new Ogretmen("Osman","Ozturk",1985);
        ogretmen1.setBrans("Matematik");
        Ogrenci ogrenci1=new Ogrenci("Numan","Ozturk",2013,"2547",null);
        ArrayList<String> dersler=new ArrayList<>();
        dersler.add("Deutsch");
        dersler.add("Mathematij");
        dersler.add("Phyisch");
        ogrenci1.setDersler(dersler);
        System.out.println(ogrenci1.toString());


    }




}
