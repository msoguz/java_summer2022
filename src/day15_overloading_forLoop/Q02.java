package day15_overloading_forLoop;

public class Q02 {
    public static void main(String[] args) {

        // 10 ile 30 (10 ve 30 dahil) arasindaki sayilari aralarinda virgul olarak ayni satirda yazdiralim.

        int baslangic=10;
        int bitis=30;

        for (int i =baslangic; i <=bitis; i++) {
                if(i<bitis) {
                    System.out.print(i + ", ");
                }else {
                    System.out.println(i);
                }
        }
    }
}
