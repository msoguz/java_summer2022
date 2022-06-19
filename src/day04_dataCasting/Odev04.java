package day04_dataCasting;

public class Odev04 {

    public static void main(String[] args) {

        // double 255.36 sayisini int'a ve sonra da olusturdugunuz int sayiyi byt'a cevirip yazdirin;

            double sayi=255.36;

            int sayi1=(int)sayi;

            byte sayi2=(byte)sayi1;

        System.out.println("sayi = " + sayi);
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

    }
}
