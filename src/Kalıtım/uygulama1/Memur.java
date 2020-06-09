package Kalıtım.uygulama1;

public class Memur extends Kısı{

    public Memur(String ad, String soyad, int dogumYılı) {
        super(ad, soyad, dogumYılı);
    }
    private String ısı;

    public String getIsı() {
        return ısı;
    }

    public void setIsı(String ısı) {
        this.ısı = ısı;
    }
}
