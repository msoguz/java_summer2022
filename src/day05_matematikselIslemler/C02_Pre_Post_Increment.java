package day05_matematikselIslemler;

public class C02_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi=10;

        System.out.println("pre-increment:" +  ++sayi);//11


        System.out.println("post-increment :" +  sayi++);//11 ==>once yazdirdi sonra artirdi


        System.out.println("post-increment'ten sonra :" +  sayi);//12
    }
}
