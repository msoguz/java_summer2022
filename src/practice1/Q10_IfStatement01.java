package practice1;

import java.util.Scanner;

public class Q10_IfStatement01 {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scan=new Scanner(System.in);

        System.out.print("Lutfen y/n ikilisinden birini giriniz :");

        char karakter=scan.next().charAt(0);

        if (karakter=='Y' || karakter=='y') {
            System.out.println("YES");
        }else if (karakter=='N' || karakter=='n') {
        }else{
            System.out.println("yanlis giris yaptiniz, lutfen y/n ikilisinden birini tercih ediniz");

        }


    }
}
