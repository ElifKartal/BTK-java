package Methods;

public class ErkekOgrenci extends Ogrenci {
    private String isim;
    public int numara;

    public ErkekOgrenci(String isim, int numara) {
        super(isim, numara);
        this.isim = isim;
        this.numara = numara;
    }

    public String ogrencininIsmi() {
        return "erkek ogrenci: " + isim;
    }
}