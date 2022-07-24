package day28_staticBlock;

public class C02_PassByValue {

    public static void main(String[] args) {

        double satisFiyati=100;

        System.out.println(indirimliFiyat(satisFiyati));

        System.out.println(satisFiyati);

        System.out.println(indirimliFiyat(satisFiyati));
        //iki farkli method'da satisFiyati isminde variable olabilir.
        //java buna itiraz etmez cunku scop'lari farklidir.
    }

    public static double indirimliFiyat(double orjinalFiyat){
        //methodumuz %10 indirim yapip yeni fiyati main method'a dondursun.

        double satisFiyati=orjinalFiyat*0.9;

        return satisFiyati*0.9;

    }
}
