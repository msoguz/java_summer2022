package day18_while_DoWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        /*
        While Loop'da once kontrol edip sonra islem yaptigimiz icin islem bittikten sonra
         Loop'un kirilmasi icin bir kez ddaha basa donmemiz gerekir.
        Bu durumda fazlada bir islem yapilmis olur.
         */
        int sayi=7;

        while(sayi<10){
            System.out.println(sayi);
             sayi++;
        }

        /*
        Do While Loop ile calistigimizda yukarida bahsedilen dezavantaj ortadan kalkar.
         */

        sayi=7;
        do{

            System.out.println(sayi);

            sayi++;
        }while(sayi<10);

    }
}
