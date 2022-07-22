package day28_staticBlock;

public class C01_StaticBlock {

    static int sayi;

    static{
        /*
        static block class uyelerinin tamamindan once calisir.(main method'dan bile once)
        static block class olusturuldugunda calisir
        genellikle de class'la ilgili on ayarlamalar veya static variabl'lara deger atamak icin kullanilir.

        static blok'larin class icerisinde nerede oldugu onemli degildir.
        once static block'lar calisir.

        birden fazla static block varsa yukaridan asagi dogru calisir.

         */
        System.out.println("Static Block calisti");
    }

    public static void main(String[] args) {
        System.out.println("Main method calisti");
        System.out.println(sayi);
    }
    static{
        System.out.println("Main method'un altindaki static block caisti.");
    }

}
