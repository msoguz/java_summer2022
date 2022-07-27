package day32_stringBuilder;

public class C08_equals {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str="Java";

        System.out.println(sb1.equals(sb2));   //false
        System.out.println(sb1.equals(sb1));  //true

        //StringBuilder'da equals method'u ancak ayni obje olursa true doner
        //String'deki gibi dusunmemek lazim

        System.out.println(sb1.equals(str));//false

        System.out.println(sb1.compareTo(sb2));//0 ==> aradaki fark 0 anlaminda

        StringBuilder sb3 = new StringBuilder("Jave");
        System.out.println(sb1.compareTo(sb3));// -4 ==> a hafi ile e harfi arasinda 4 birim fark oldugu icin -4 verdi.

        /*
        compareTo() method'u iki StringBuilder'i bastan baslayarak harf harf karsilastirir.
        ilk harfler ayni ise ikincilere gecer, ikinciler ayni ise 3. lere gecer ve \
        ilk farkli olan harfe kadar gider farkli olan iki harfin ascii kodlari arasindaki farki verir.

         */






    }
}
