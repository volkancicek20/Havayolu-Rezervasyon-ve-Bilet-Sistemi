
import java.util.ArrayList;


public class Musteri extends Yolcu{
    ArrayList<String> musteriler = new ArrayList<>();
    public Musteri(String kullanici_adi, String sifre) {
        super(kullanici_adi, sifre);
        musteriler.add(kullanici_adi);
        System.out.println("Hosgeldiniz "+musteriler.get(0));
    }
}
