package day19_scope;

import javax.sound.midi.Soundbank;

public class C03_ClassVariables {





    public static void main(String[] args) {
        /*
        Farkli bir class'da calisirken herhangi bir class adini yazip .'ya basarsak adini yazdigimiz class'daki
        tum STATIC class uyelerini gorebilir ve kullanabiliriz(hem static variable hem de static methodlari).
         */

        C02_StaticVariables.staticMethod(); //10
        System.out.println(C02_StaticVariables.staticSayi); //10
        System.out.println(C02_StaticVariables.degersizStaticVar); //0

        /*
        Class level variable'lara deger atayip atamamak bize kalmistir .istersek deger atamasi yapariz istemezsek deger atamayiz..
        Eger atamissak java atadigimiz o degeri kabul eder.Deger atamazsak Java bu variable'lara default bir deger atamasi yapar.
        int==>0
        String==> null
        boolean==> false
        char==> '' hiclik
         */

        /*
        Baska class'daki instance variable'lara(static olmayanlara) obje olusturarak ulasabiliriz.
         */
        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();  //10
        //Bu method icinde staticSayi=20 oldu
        System.out.println(obje1.isim); // Mehmet
        System.out.println(obje1.degersizInstanceVariable);//0


        System.out.println(C02_StaticVariables.staticSayi); //20

        /*
        Farkli bir class'tan C02 clasindan method ve variable'lari kullndigimizda
        C02 class'inin tamami degil sadece benim cagirdigim class uyeleri calisir.

         */
    }
}
