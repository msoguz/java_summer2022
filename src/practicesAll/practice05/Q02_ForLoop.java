package practicesAll.practice05;

public class Q02_ForLoop {
    public static void main(String[] args) {

        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

        System.out.println("For loop ile : ");

        for (int i = 0; i <=255 ; i++) {
            char c= (char) i;   // casting yaptik, chara donusturduk. sayi, harf ve karakter.
            System.out.println(i+ " -> " + c);

        }
        System.out.println("While loop ile : ");

        int i=0;

        while (i<=255) {
            char sembol= (char) i; // casting yaptik, chara donusturduk. sayi, harf ve karakter.
            System.out.print(i+ "-" + sembol);
            i++;
        }

        System.out.println("do-While loop ile :");

        int a=0;
        do {
            char karakter= (char) a; // casting yaptik, chara donusturduk. sayi, harf ve karakter.
            System.out.println(a+ " " + karakter);
            a++;
        }while (a<=255);


    }
}
