package day08_ifStatements;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
         /*
         Kullanicidan iki sayi isteyin;
         sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
         sayilarin ikisi de negatif ise sayilarin carpimini yazdirin,
         sayilarin ikisi farkli isaretli ise "farkli isaretli sayilarla islem yapamazsin" yazdirin,
         sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.

          */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz.");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        int carpim=sayi1*sayi2;
        int toplam = sayi1+sayi2;


        if (sayi1>0 && sayi2>0){
            System.out.println("sayilarin toplami :" + toplam);
        }else if (sayi1<0  && sayi2<0){
            System.out.println("sayilarin carpimi: " + carpim);
        }else if (sayi1<0 || sayi2<0){
            System.out.println("farkli isaretli sayilarla islem yapamazsin");
        }else {
            System.out.println("sifir carpmaya gore yutan elemandir");
        }


    }
}
