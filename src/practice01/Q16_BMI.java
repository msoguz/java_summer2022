package practice01;

import java.util.Scanner;

public class Q16_BMI {
    public static void main(String[] args) {

        /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */

        Scanner scan= new Scanner(System.in);
        System.out.print( "kg olarak agirliginizi giriniz :" );

        double agirlik=scan.nextDouble();

        System.out.print("cm olarak boyunuzu giriniz :");
        double boy=scan.nextDouble();
        boy/=100;       // cm cinsinden aldigimiz boy uzunlugunu m ye cevirdik.

        double vki=agirlik/(boy*boy);

        System.out.println("vki = " + vki);




    }
}
