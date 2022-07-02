package day15_overloading_forLoop;

public class Q03 {
    public static void main(String[] args) {

        // 100'den baslayarak 50'ye (50 dahil) kadar olan sayilari aralarinda virguul olarak ayni satirda yazdirin.

        int sayi=100;

        for (int i = 100; i >=50 ; i--) {

            System.out.print(i+",");
        }
    }
}
