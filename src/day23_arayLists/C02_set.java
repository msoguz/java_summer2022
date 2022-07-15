package day23_arayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {

        /*
        elimizde urunlerin bulundugu bir liste var.
        urun listesindeki istenen siradaki urunu istedigimiz yeni urun ile degistirip
        eski urunu var olan eski eski urunler listesine ekleyelim.

         */
        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Biskrem");
        urunler.add("Cay");


        List<String> eskiUrunler=new ArrayList<>();

        //Listedeki ikramin yerine biskrem koyalim,
        // ikrami da eeski urunler listesine ekleyelim.

        String yeniUrun="Biskrem";
        String silinecekUrun="Ikram";

        int temp=urunler.indexOf("silinecekUrun");
        String silinenUrun= urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Liste : "+ urunler);
        System.out.println("eskiUrunler Listesi :" + eskiUrunler);




    }
}
