package day18_while_DoWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan tamsayilar alin kullanici cift sayi girdigi muddetce sayilari yazdirin.
        Tek sayi girdiginde islemi bitirin.
         */




        Scanner scan= new Scanner(System.in);

        int sayi=0;


        //***************************  While Loop ile:  ***********************************

        /*
        Loop'larda kullanacagimiz variable'lari loop'tan once olusturmaliyiz.
        While Loop'ta, loop'dan once olusturdugumuz bu variable'a atayacagimiz degeri iyi dusunmemiz gerekir.
         Cunku yanlis bir deger atarsak loop hic devreye girmez.
         */

        while(sayi%2==0) {

            System.out.println("Lutfen bir sayi giriniz.");
            sayi= scan.nextInt();
            if(sayi%2==0) {
                System.out.println("Girilen sayi cift  : " + sayi);
            }else{
                System.out.println("Girilen sayi tek, benden bu kadar");
            }
        }
        //***************************** Do While Loop ile:    ********************************

        // Do While Loop'ta onceden olusturulan variable'a hangi deger atandiginin hicbir onemi yok, kodumuz her durumda calisir.


        /*
        Do-While'in dezavantaji:
        ilk calistirma kontrol yapilmadan oldugu icin loop'un body'sinde yanlis bir islem yapilmamasina dikkat etmek gerekir.
         */

        do{
            System.out.println("Lutfen bir sayi giriniz.");
            sayi= scan.nextInt();
            if(sayi%2==0) {
                System.out.println("Girilen sayi cift  : " + sayi);
            }else{
                System.out.println("Girilen sayi tek, benden bu kadar");
            }


        }while (sayi%2==0);
    }
}
