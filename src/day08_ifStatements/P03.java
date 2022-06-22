package day08_ifStatements;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {

        /*
        Kullanicidan artik yil olup olmadigini kontrol etmek icin bir yil girmesini isteyin
        i)   4 ile bolunemeyen yillar artik yil degildir
        ii)  4 ile bolunup 100 ile bolunemeyen yillar artik yildir.
        iii) 4'un kati olmasina ragmen 100 'un kati olan yillardan sadece 400 ile bolunebilen
                yillar artik yildir.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir yil giriniz");
        int yil= scan.nextInt();

        if (yil%4!=0) {
            System.out.println("Artik yil degildir");
        }else if (yil%100!=0){
            System.out.println("Artik yil");
        }else if (yil%400!=0){
            System.out.println("Artik yil degildir");
        }else{
            System.out.println("Artik yil");
        }
    }
}
