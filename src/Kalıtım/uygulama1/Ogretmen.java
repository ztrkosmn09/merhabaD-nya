package Kalıtım.uygulama1;

public class Ogretmen extends Kısı{
    public Ogretmen(String ad, String soyad, int dogumYılı) {
        super(ad, soyad, dogumYılı);
    }
    private String brans;

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}
