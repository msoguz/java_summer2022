package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C04_MdaIstenenArrayiOlusturma {
    public static void main(String[] args) {

        /* soru-4:
        Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin toplamini  birer birer bulan ve
         herbir sonucu yeni bir array’in elemani yapan ve
         yeni array’i  ekrana  yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6,7} }
         Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
         */

        int[][] input={{1,2,3},{4,5,},{6,7,}};
        int[] yeniArray=new int[input.length];
        int toplam=0;

        for (int i = 0; i < input.length ; i++) {    // dis loop outer array'i gezer.
            for (int j = 0; j <input[i].length ; j++) { // ic loop ise inner array'leri gezer.

                toplam+=input[i][j];

            }
            yeniArray[i]=toplam;
            toplam=0;


        }

        System.out.println("istenen yeni array : " + Arrays.toString(yeniArray)); //istenen yeni array : [6, 9, 13]
    }
}