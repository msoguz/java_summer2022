package day09_ternary_Switch;

import java.util.Scanner;

public class Q11_Switch {
    public static void main(String[] args) {
        /*
        Kullanicidan SDET kisaltmasindaki harflerinden birini yazmasini isteyin.
        S girerse "Software"
        D girerse "Develeper"
        E girerse "Engineer"
        T girerse "In Testing"
        yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println();
        char harf= scan.next().toUpperCase().charAt(0);

        switch (harf) {
            case 'S' :
                System.out.println("Software");
                break;
            case 'D' :
                System.out.println("Development");
                break;
            case 'E':
                System.out.println("Engineer");
                break;
            case 'T' :
                System.out.println("In Testing");
                break;
            default:
                System.out.println("Lutfen gecerli bir harf giriniz");


        }
    }
}
