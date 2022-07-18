package day25_constructor;

public class C03 {

    /*
    Proje olustururken bazi class'lar run etmek icin degil
    variable ve method olusturup bunlari baska classlardan kullanmak
    icin olusturulur.
     */

    /*
    Default constructor parametresizdir. Goremesek bile ihtiyac oldugunda calisir.

    Class icerisinde parametreli veya parametresiz herhangi bir constructor
    olusturursak java default constructor'i siler.

     */

    C03 (){

    }
    /*
    Olusturdugumuz parametresiz bu constructor
    default constructor ile birebir aynidir.
    Ama biz olusturdugumuz icin buna default constructor demeyiz.
    Parametresiz constructor deriz.

     */

    String isim="Etka";

    public  void method01(){
        System.out.println("C03 method calisti");

    }
}
