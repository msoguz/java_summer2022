package day17_nestedForLoop;

public class Q02 {
    public static void main(String[] args) {
        //For Loop ve While Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90' a tam bolunebilen sayilari yazdirin.

        int baslangic=100;
        int bitis=999;

        int sayi =baslangic;

        //while loop ile
        while (sayi<=999){
            if(sayi%15==0 && sayi%20==0 &&sayi%90==0){
                System.out.print(sayi+ " ");
            }
            sayi++;

        }
        System.out.println(" ");
        //for loop ile;



        for (int i = 100; i <=999 ; i++) {
            if (i% 15 == 0 && i % 20 == 0 && i % 90 == 0) {

                System.out.print(i + " ");
            }

        }
    }
}
