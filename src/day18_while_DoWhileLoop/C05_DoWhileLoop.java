package day18_while_DoWhileLoop;

public class C05_DoWhileLoop {
    public static void main(String[] args) {

        //9'dan 190'a kadar 7^nin kati olan tum tam sayilari ekrana yazdiriniz.

        int bas=9;
        int bitis=190;

        int temp=bas;

        // while Loop ile: *********************

        while(temp<bitis){
            if(temp%7==0){
                System.out.print(temp + " ");
            }
            temp++;

        }
        // Do While Loop ile: *******************
        System.out.println(" "); // alt satira gecmek icin

        temp=bas; //temp'i eski degerine dondurmek icin...

        do{
            if(temp%7==0){
                System.out.print(temp + " ");
            }
            temp++;

        }while (temp<bitis);
    }
}
