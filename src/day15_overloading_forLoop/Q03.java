package day15_overloading_forLoop;

public class Q03 {
    public static void main(String[] args) {

        // 100'den baslayarak 50'ye (50 dahil) kadar olan sayilari aralarinda virgul olarak ayni satirda yazdirin.

        int bas=100;
        int bitis=50;

        for (int i = bas; i >=bitis; i--) {
                if(i>bitis){
                    System.out.print(i +", ");
                }else{
                    System.out.print(i);
                }

        }
    }
}
