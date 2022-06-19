package day04_dataCasting;

public class Odev02 {
    public static void main(String[] args) {

        // int veri tipinde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin

        int sayi1=40;

        short sayi2=(short) sayi1;

        byte sayi3=(byte)sayi2;

        System.out.println("sayi2 = " + sayi2);

        System.out.println("sayi3 = " + sayi3);

    }
}
