package day04_dataCasting;

public class Odev01 {
    public static void main(String[] args) {


        //byte veri tipinde bir degisken olusturun, short, int, float ve double veri type'lerinde bir degisken olusturup,
        //adim adim widening yapin ve yazdirin.

        byte sayi = 15;

        short sayi1 = 30;
        int sayi2 = sayi + sayi1;

        double sayi3 = sayi * sayi1;

        float sayi4=sayi2/sayi;

        sayi3 = (double) sayi1 / sayi;

        System.out.println("sayi4:" + sayi4);
        System.out.println("sayi3 = " + sayi3);
        System.out.println("sayi2 = " + sayi2);
    }
}