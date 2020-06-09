package NesneIlıskıler.UygulamaAssa;

public class Araba {
    private String marka;
    private String model;
    private int üretimYılı;


    public Araba(String marka, String model, int üretimYılı) {
        this.marka = marka;
        this.model = model;
        this.üretimYılı = üretimYılı;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getÜretimYılı() {
        return üretimYılı;
    }

    public void setÜretimYılı(int üretimYılı) {
        this.üretimYılı = üretimYılı;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", üretimYılı=" + üretimYılı +
                '}';
    }
}
