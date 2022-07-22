package day29_passByValue_Immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*
        Bir list olusturalim, 2 ayri method'dan birinde sadece elemanlari degistirelim,
        digerinde yeni bir list atayip ayni sayida yeni eleman ekleyelim ve her iki
        method call'dan sonra main method icerisinde kontrol edelim.

         */

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");

        System.out.println("ilk basta list : " + list);

        elemanlariDegistir(list);
        System.out.println("elemanDegistir mathodundan sonra list : " + list);

        listDegistir(list);
        System.out.println("listDegistir mathodundan sonra list : " + list);
    }

    public static void listDegistir(List<String> list) {
        list=new ArrayList<>();
        list.add("Nutella");
        list.add("Cay");
        list.add("Cokokrem");

        System.out.println("ListDegistir methodunda : " + list);



    }

    public static void elemanlariDegistir(List<String> list) {

        list.set(0, "Oguz");
        list.set(1,"Murat");
        list.set(2,"Fatih");

        System.out.println("elemanlariDegistir methodunda : " + list);


    }
}
