package day23_arayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {

        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        Collections.sort(urunler);

        System.out.println(urunler);//[Cay, Cekirdek, Ikram, Nutella]

        /*
        List ile gelen sort method'unda siralama ozelligini girmek gerekir.
        Bunun yerine Collections class'indan sort method'unu kullaniriz.
        Bu method listemizi natural order'a(dogal) gore siralar.
         */

    }
}
