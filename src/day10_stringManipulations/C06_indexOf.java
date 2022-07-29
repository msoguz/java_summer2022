package day10_stringManipulations;

public class C06_indexOf {
    public static void main(String[] args) {


        String str = "Java ogrenmek cok guzel";
        System.out.println(str.indexOf("o"));//5
        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("t")); // bana int dondurur.
                                              // int'de yok diye bir deger bulunmuyor.
                                              // 0 dersek J'nin index'idir.
                                              // negatif bir deger donerse biz aranan string'in str'da olmadigini anlariz

                                              // Java -1 dondurmeyi tercih etmistir.

        String str5="sdfggdfg ghfghjghf ;klkhlj sdfgdsfg sdffghhshhhhsdfh hhsdhswerepoiuytrr";

        // str5'de p harfi  var mi?
        if (str5.indexOf("p")==-1) {
            System.out.println("str5'de istenen harf kullanilmamistir");
        }else{
            System.out.println("str5'de istenen harf kullanilmis");

        }



    }
}
