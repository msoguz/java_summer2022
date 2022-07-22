package day28_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*
        %25 indirimli fiyati hesaplayip bize donduren bir method olusturun.
         */

        double satisFiyati=100;
        double indirimOrani=25;


        double indirimliFiyat=indirimliFiyatHesapla(satisFiyati, indirimOrani);

        System.out.println("indirimli Fiyat : " + indirimliFiyat);
        System.out.println("indirimli Fiyat : " + indirimliFiyat);
        System.out.println("indirimli Fiyat : " + indirimliFiyat);
        System.out.println("indirimli Fiyat : " + indirimliFiyat);

    }

    public static double indirimliFiyatHesapla(double satisFiyati, double indirimOrani) { // buradaki satisfiyatinin yerine xyz yazsak da calisir.
                                                                    //yani buradaki ismin java acisindan bir onemi yok.
                                                                    // java kod takibi acisindan buraya yukaridaki variable'nin
                                                                    // adi olan satisFiyati olarak yaziyoruz.

        double indirimliFiyat=satisFiyati*0.75;


        return indirimliFiyat;
    }
}
