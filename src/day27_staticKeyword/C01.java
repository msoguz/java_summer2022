package day27_staticKeyword;

public class C01 {

    static int sayi=10;
    int rakam=5;

    public static void main(String[] args) {
        /*
        class level'da iki tur variable olusturabiliriz:
        1- static (class) variable
        2-  instance (obje) variable
        static (class) variable'lar tum class'tan kullanilabilinirken instance variable'lar
        static olmayan methodlardan direkt kullanilabilir.
        instance variable'lara static method'dan ulasmak istersek obje olusturmamiz gerekir.

        instance variable'lar obje variable'i oldugu icin herhangi bir satirda
        instance variable'in degerinin ne oldugunu bulmak icin
        OBJE OLUSTURULAN STIRDAN itibaren kod incelenmelidir.

        static (class) variable'lar class variable'i oldugu icin herhangi bir
        satirda static variable'in degerini bulmak icin CLASSIN BASINDAN itibaren kod incelenmelidir.
        */

        C01 obj1=new C01();
        System.out.println("obj1'in rakam degeri : " + obj1.rakam);   //5
        System.out.println("obj1'in sayi degeri : " + sayi); //  10

        obj1.rakam+=1;
        sayi+=1;

        System.out.println("1 artirildiktan sonra obj1'in rakam degeri : " + obj1.rakam);//6
        System.out.println("1 artirildiktan sonra obj1'in sayi degeri : " + obj1.sayi);//11


        C01 obj2=new C01();

        System.out.println("obj2'in rakam degeri : " + obj2.rakam);   //5
        System.out.println("obj2'in sayi degeri : " + obj2.sayi); //  11

        obj2.rakam++;  // 5+1=6
        obj2.sayi++;  //

        System.out.println("1 artirildiktan sonra obj2'in rakam degeri : " + obj1.rakam);//6
        System.out.println("1 artirildiktan sonra obj2'in sayi degeri : " + obj1.sayi);//12


    }
}
