package day34_inheritance;

public class ToyotaCorolla extends Toyota {

    public static void main(String[] args) {

        /*
        child class'tan parent class'a erisimde acces modifier kurallarini bypass edemeyiz.
        ornegin parent class'taki private class uyelerini child class'tan kullanamayiz
        ayni sekilde parent ve child farkli package'larda ise parent class'taki default access
        modifier'i olan class uyelerini child class'dan kullanamayiz.
         */
        ToyotaCorolla arb1= new ToyotaCorolla();

        System.out.println(arb1.marka);//Toyota
        System.out.println(arb1.model);//Model belirtilmedi
    }
}
