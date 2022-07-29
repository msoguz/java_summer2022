package day04_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1=50;
        byte sayi2= (byte) sayi1;

        System.out.println(sayi2);    //50

        /*
        Genis data turundeki degeri dar data turundeki variable'a atamak isterseniz
        Java sizin genis data turundeki degerin dar data turunun
        sinirlarina uyup uymayacagini calistirana kadar bilemez. Ama Java risk almaz.
        Riski sifira indirmek icin burada bir sorun olursa sorumlulugu kabul etmenizi bekler.
        Bunun icin degerin onune parantez icinde istedigimiz data turunu yazmamiz yeterlidir.

        Bu riski ustlendigimizde uc durum olusabilir.
        1- Bizim degerimiz dar kalip degerlerine uygun olursa hicbir kayip olmadan cast olur.
        2- double bir sayiyi int'a cast etmek gibi durumlarda data kaybi yasayabiliriz.
        3- genis kaliptan degeri dar kaliba koydugumuzda sinirlari asan durumlarda veri baskalasabilir.

        
         */
    }
}
