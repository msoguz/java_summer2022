package day10_stringManipulations;

public class C05_length {
    public static void main(String[] args) {

        String str="Java ogren, isi kap";

        System.out.println(str.length());  //str'nin karakter sayisini dondurur.  19
        System.out.println(str.charAt(str.length()-1)); //son karakterini yazdiralim p
        System.out.println(str.charAt(str.length()-3)); //sondan 3. karakter k

        /*
        Java'da null pointer bir deger degil, karsisina yazildigi variable'in hic bir deger almadiginin isaretcisidir.
         */

        String str2=""; //str2'ye bir deger atanmis mi EVET
                        // Bu deger nedir? HICLIK
        System.out.println(str2.length()); // 0

        String str3=null; // str3'e bir deger atanmis midir? HAYYIR
                          // null bu deger atamamayi isaret etmektedir.
        System.out.println(str3.length()); //Exception in thread "main" java.lang.NullPointerException



    }
}
