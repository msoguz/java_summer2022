package day25_constructor;

public class Car {

    /*
    Bu class bizim kaliphanemiz.
    Bir araba olusturmak icin ihtiyacimiz olan variable ve methodlari bu classta belirleriz.
    Sonra farkli classlarda araba olusturmamiz gerekirse bu class'ta bir obje olusturp burada
    belirlenen variable ve methodlara gore araba uretiriz.

     */

    String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";
    int yil;
    int fiyat;


    public void benzinliArac(){

        System.out.println("Bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz){
        System.out.println("Bu araba max" + hiz + "km hiz yapar");
    }

}
