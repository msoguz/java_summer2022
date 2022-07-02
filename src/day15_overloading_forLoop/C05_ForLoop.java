package day15_overloading_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {

        // 1'den 5'e kadar olan(5 dahil) tamsayilari toplayin.
        int toplam=0;


        for (int i = 1; i <=5 ; i++) {
            toplam+=i;


        }
        System.out.println("toplam :" + toplam);//15
        // 10 dahil , 20 dahil aradaki sayilarin toplamini yazdirin.
        toplam=0;

        for (int i = 10; i <=20 ; i++) {
            toplam+=i;

        }
        System.out.println("toplam = " + toplam); //165


        //30 dahil 50 dahil araadaki cift sayilarin toplamini yazdirin
        toplam=0;

        for (int i = 30; i <=50 ; i+=2) {
        toplam+=i;

        }
        System.out.println("toplam = " + toplam); //440


        // 2. YONTEM : " +***********************************************************************"
        toplam=0;

        for (int i = 30; i <=50 ; i++) {
            if(i%2==0){
                toplam+=i;

            }
        }

        System.out.println("toplam = " + toplam); //440

         // 1500 ile 1600 (ainirlar dahil) arasinda 7 ile bolunebilen sayilari toplayin.

        toplam=0;

        for (int i = 1500; i <=1600 ; i++) {
            if(i%7==0){
                toplam+=i;

            }
        }

        System.out.println("1500 -1600 arasi 7 ile bolunebilen sayilarin toplami = " + toplam);



    }

}
