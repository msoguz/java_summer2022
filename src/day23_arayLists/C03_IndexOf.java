package day23_arayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_IndexOf {

    public static void main(String[] args) {

        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Biskrem");
        urunler.add("Cay");

        System.out.println(urunler);//[Nutella, Ikram, Biskrem, Cay]
        System.out.println(urunler.indexOf("Ikram"));//1
        System.out.println(urunler);//[Nutella, Ikram, Biskrem, Cay]

        /*
        indexOf method'u bize bilgi dndurur. Listemizi degistirmez.

         */

        System.out.println(urunler.lastIndexOf("Ikram"));//1

        /*
        indexOf methodu urunu aramaya sifirinci index'ten,
        lastIndexOf method'u ise aramaya son index'ten baslar.
        arama bitip, urun bulundugunda ikisi de bulunan urunun index'ini verir.
         */


        urunler.add("Ikram");
        System.out.println(urunler);//[Nutella, Ikram, Biskrem, Cay, Ikram]
        System.out.println(urunler.indexOf("Ikram"));//1
        System.out.println(urunler.lastIndexOf("Ikram"));//4


        System.out.println(urunler.indexOf("Hobby")); //-1
        System.out.println(urunler.lastIndexOf("Hobby"));//-1



    }
}
