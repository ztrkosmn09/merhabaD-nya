package NesneYonetinliProgramlama.araba;

public class Araba {
    String markası;
    String modeli;
    int year;
    String renk;



    public Araba(String markası, String modeli, int year, String renk) {
        this.markası = markası;
        this.modeli = modeli;
        this.year = year;
        this.renk = renk;
    }

    public String getMarkası() {
        return markası;
    }

    public void setMarkası(String markası) {
        this.markası = markası;
    }

    public String getModeli() {
        return modeli;
    }

    public void setModeli(String modeli) {
        this.modeli = modeli;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
}
