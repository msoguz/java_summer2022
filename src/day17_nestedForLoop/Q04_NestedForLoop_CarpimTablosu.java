package day17_nestedForLoop;

public class Q04_NestedForLoop_CarpimTablosu {
    public static void main(String[] args) {


        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i + "x"+ j + "=" + (i*j));
            }
            System.out.println("*********************************");
        }

    }
}
