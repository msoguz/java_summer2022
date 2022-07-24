package practicesAll.practice08;


import java.util.Arrays;
import java.util.Scanner;

public class Q01_Arrays {
    public static void main(String[] args) {
         /*
            kullanıcının girdigi bir array'in en buyuk elemani ile
            en kucuk elemanının  farkını bulan bir method create ediniz.
    */

       farkiniBul();
    }

    private static void farkiniBul() {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen array uzunlugunu giriniz : ");

        int uzunluk=scan.nextInt();
        int arr[]=new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Array'in " + (i+1) + ". elemanini giriniz. "); //i-> oldugunda 0. eleman diyecek, biz index degil, direkt eleman sorduk.
            arr[i]= scan.nextInt(); // for'daki index, bu satirda kullanici tarafindan dongu bitene kadar girilen elemanlar okunur.

        }
        Arrays.sort(arr);
        System.out.println("Array'deki en buyuk eleman ile en kucuk eleman arasindaki fark : " + (arr[uzunluk-1]-arr[0]));


        //  odev: bu soruyu Math classi kullanrak cozunuz..
    }
}
