package day15_overloading_forLoop;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {

        //Kullanicidan 2 tamsayi isteyin.
        // girilen sayilar ve aralarindaki tum tamsayilari toplayip yazdiran bir program yaziniz

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz");

        int toplam=0;


        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        for (int i =sayi1 ; i <=sayi2 ; i++) {
            toplam+=i;

        }
        System.out.println("Toplam : " + toplam);
    }
}
