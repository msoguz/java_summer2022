package practice06;

import java.util.Scanner;

public class Q09_Arrays {
    public static void main(String[] args) {

        /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

        int [] arr=new int[8];
        Scanner scan= new Scanner(System.in);

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+ ". indexteki sayiyi giriniz : ");
            arr[i] = scan.nextInt();
            System.out.println(arr[i]);
            if(arr[i]%3==0){
                count++;

            }
        }
        System.out.println("3'e bolunebilen " + count + " sayi vardir");

    }
}
