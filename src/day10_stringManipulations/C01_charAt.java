package day10_stringManipulations;

public class C01_charAt {
    public static void main(String[] args) {
        String str = "Java ogrenmek ne guzel";

        System.out.println(str.charAt(0)); // ilk harfi yazdirir

        System.out.println(str.toUpperCase().charAt(7)); // R

        System.out.println(str.charAt(21));  //L

        // son harfi bulmak icin st'in uzunlugunun 1 eksigini index olarak gireriz
        // eger index olarak uzunlugu veya daha buyuk bir sayiyi girersek Java exception verir


        // charAt() methodu kullandigimizda sonuc char olacagi icin artik manipulation yapamayiz.
        // String methodlarindan kullanmamiz gereken bir method varsa charAt()'den once kullanmaliyiz.



    }
}
