public class Yolcu {
    private String kullanici_adi;
    private String sifre;

    public Yolcu(String kullanici_adi, String sifre) {
        this.kullanici_adi = kullanici_adi;
        this.sifre = sifre;
    }
    public String getkullanici_adi() {
        return kullanici_adi;
    }

    public void setkullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getsifre() {
        return sifre;
    }

    public void setsifre(String sifre) {
        this.sifre = sifre;
    } 
}
