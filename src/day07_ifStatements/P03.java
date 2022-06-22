package day07_ifStatements;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {

        /*

		Kullanicidan gun isimlerinden birinin ilk harfini isteyin
		ve o harfle baslayan gun isimlerini yazdirin

		Ornek: 	ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
		ilkHarf=S output = “Sali”
		 *** Buyuk kucuk harf problem olmamasi icin toUpperCase() methodunu kullanin
		*/

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gun isimlerinden birinin ilk harfini giriniz");

        char harf= scan.next().toLowerCase().charAt(0);

        if( harf=='p'){
            System.out.println("pazartesi, persembe veya pazar");
        }
        if( harf=='s'){
            System.out.println("sali");
        }
        if( harf=='c'){
            System.out.println("carsamba, cuma veya cumartesi");
        }
        if( harf!='p' && harf!='s' && harf!='c')
            System.out.println("Lutfen gecerli bir harf giriniz");

    }
}
