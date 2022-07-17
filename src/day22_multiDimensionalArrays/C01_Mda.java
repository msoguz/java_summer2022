package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {

        /* tek katli array'larda array'i direkt yazdiramiyoruz. Cunku array non-primitive data turudur.
        Her non-primitive data direkt yazdirilamayabilir.

        Ancak array'in icerisindeki elementleri direkt yazdirabiliriz.
        Cunku genelde primitive data turu veya String elementler kullaniliyordu.
        Multi Dimensional Array'laerde en dikkat edecegimiz konu ulasmak istedigimiz elementin bir array mi yoksa
        primitive data mi oldugudur.
        */
        int[][] sayilar={{1,2,4,5}, {3,4}};

        /*
        Burada sayilar arrray'ini dusunursek icinde iki tane inner array var.
        sayilar[0]==> [1,2,4,5]

        Ancak en icerideki elemenlere ulasabilirsek direkt yazdirabiliriz.
         */

        System.out.println(sayilar[0]);   //[I@3ac3fd8b
        System.out.println(Arrays.toString(sayilar[0]));  //[1, 2, 4, 5]


        System.out.println(sayilar[0][1]); //  2  - sifirinci inner array'in 1. index'teki elementi.
        System.out.println(sayilar[1][0]);// 3 1. inner array'in sifirinci 1. index'teki elementi.


        System.out.println(Arrays.toString(sayilar) ); //[[I@3ac3fd8b, [I@5594a1b5] bize iki referans verir.

        System.out.println(Arrays.deepToString(sayilar));  //[[1, 2, 4, 5], [3, 4]] ==> bu sekilde direkt yazdirabiliriz.

        /*
         array'i iki sekilde declare edebiliyorduk
         1- elemanlari direk yazabiliriz
         int[][] sayilar= {{1,2,4,5},{3,4}};

         2- outer ve inner array'lerin uzunluklarini belirterek olusturabiliriz
         int[][] sayilar= new int[3][4];
         ancak 2.yontemle yaptigimizda inner array'lerin farkli uzunlukta olma ihtimali kalmaz
         bu ornek icin outer array'in 3 tane inner array'i vardir
         her bir inner array'in ise 4 er elemani vardir
         eger inner arrayleri farkli uzunluklarda olusturmak istiyorsaniz
         mecburen 1.yontemi kullanmalisiniz
         */

    }

}
