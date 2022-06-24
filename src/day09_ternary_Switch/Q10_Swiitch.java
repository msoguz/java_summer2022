package day09_ternary_Switch;

import java.util.Scanner;

public class Q10_Swiitch {
    public static void main(String[] args) {
        /*
         Kullanicidanbir sayi girmesini isteyin
         Girilen sayi;
         10 ise "Iki basamakli en kucuk sayi",
         100 ise "Uc basamakli en kucuk sayi"
         1000 ise "Dort basamakli en kucuk sayi"
         diger durumlarda "Girdigin sayiyi degistir" yazdirin.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu giriniz");
        int sayi= scan.nextInt();

        switch(sayi) {
            case 10:
                System.out.println("Iki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("Uc basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("Dort basamakli en kucuk sayi");
                break;
            default:
                System.out.println("Girdigin sayiyi degistir");


        }
    }
}
