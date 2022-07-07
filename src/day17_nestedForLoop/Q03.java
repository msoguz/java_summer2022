package day17_nestedForLoop;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir pozitif tamsayi giriniz");
        int sayi = scan.nextInt();

        for (int i =sayi; i <=sayi ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.print(i+"x"+j+"="+(i*j) + "  ");
            }
        }
    }
}
