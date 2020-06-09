package NesneIlıskıler.Uygulama3;

public class Adress {
    private String sehir;
    private String ilce;
    private String mahalle;
    private String sokak;
    private String evNo;

    public Adress(String sehir, String ilce, String mahalle, String sokak, String evNo) {
        this.sehir = sehir;
        this.ilce = ilce;
        this.mahalle = mahalle;
        this.sokak = sokak;
        this.evNo = evNo;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }

    public String getEvNo() {
        return evNo;
    }

    public void setEvNo(String evNo) {
        this.evNo = evNo;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "sehir='" + sehir + '\'' +
                ", ilce='" + ilce + '\'' +
                ", mahalle='" + mahalle + '\'' +
                ", sokak='" + sokak + '\'' +
                ", evNo='" + evNo + '\'' +
                '}';
    }
}
