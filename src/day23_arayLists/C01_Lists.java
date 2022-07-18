package day23_arayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        System.out.println("Listenin boyutu : " + sayilar1.size());//3

        sayilar1.add(2);

        sayilar1.addAll(sayilar1);
        System.out.println(sayilar1); //[5, 3, 2, 2, 5, 3, 2, 2]

        System.out.println("Listenin yeni boyutu : " + sayilar1.size());//8

        sayilar1.set(2,8); // 2. index'teki sayiyi 8 yapar ve bize sildigi elemani getirir.Ama sout icinde yazdirirsak.
        System.out.println(sayilar1); //[5, 3, 8, 2, 5, 3, 2, 2]



        System.out.println(sayilar1.set(0,12));// 5 // bize silinen index'i getirir.

        System.out.println(sayilar1);//[12, 3, 8, 2, 5, 3, 2, 2]

        /*
        set method'u istenen index'teki eski elementi silip yerine verdigimiz yeni elementi set eder.
        eger eski elementi silmek istemiyorsak add(index,deger) methodu'nu kullanabiliriz.

        sett() method'u sildigi eski elemnti bize dondurur. (sout icinde yazdirirsak)

         */


    }
}
