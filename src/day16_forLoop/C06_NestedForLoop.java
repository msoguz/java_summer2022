package day16_forLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        /*
        Bazen tek degisken sorunu cozmeye yetmez
        *
        * *
        * * *
        * * * *
        * * * * *

         */

        // uc tane yanyana * yap  (* * *)
        for (int i = 1; i <= 3; i++) {
            System.out.print("* ");

        }
        System.out.println("");
        // 4 tane yanyana * yap  (* * * *)
        for (int i = 1; i <= 4; i++) {
            System.out.print("* ");

        }
        System.out.println("");

        //Bu tur durumlarda ic ice (Nested) loop kullanmak gerekir.
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }

            System.out.println("");
        }


    }
}