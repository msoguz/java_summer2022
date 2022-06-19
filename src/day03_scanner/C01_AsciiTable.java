package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {

        // 6- Bir tamsayi ve bir de char degisken olusturun ve bunlarin toplamini yazdirin.

        int sayi=10;
        char harf='a';
        String str="banan";


        System.out.println(sayi+harf); // 10 a degil 107 oldu
        System.out.println(str+harf); // banana

        System.out.println(sayi*harf);

        System.out.println(harf+2); //99
        System.out.println(str+sayi+harf); //banan10a

        //char yeniHarf=harf+2;


        /*
        1- char  datat turu isleme girdigi degiskenin turune gore farkli davranabilir.
        Eger matematiksel bir degere girdigi variable sayisal bir degerse sayi gibi davranir.
        sayi+harf sayi variable'i int oldugundan harf variable'i ascii tablosundan 97 degerini kullanir.

        char yeniHarf=harf+2; java once sagdaki islemi yapar, sagda int+char gorunce ascii degerini
                                sonra atama islemi yapmaya calisir.
                                char yeniHarf=99;
                                bu atama java acisindan kabul edilebilir degildir.
         2- str+harf) ; // banana String variable cok gucludur, hangi data turu ile isleme girerse girsin
                            diger data turunu kendine benzetir
        */

        // peki konsolda verilen variable'lari kullanarak 10a gormek istersek nasil yazdirmaliyiz.

        System.out.println(""+sayi+harf);  //10a

        char deger='1';
        System.out.println(deger+harf); //146


    }

}
