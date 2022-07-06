package day17_nestedForLoop;

public class Q01_ {
    public static void main(String[] args) {

        // While loop kullanarak 3'den 13'e kadar tum tek sayilari ekrana yazdirin.


        int baslangic=3;
        int bitis=13;

        int sayi=baslangic;


        while(sayi<=bitis){
            if(sayi%3==0){
                System.out.print(sayi+ " ");
            }
            sayi++;

        }


    }
}
