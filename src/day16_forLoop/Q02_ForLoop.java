package day16_forLoop;

import java.util.Scanner;

public class Q02_ForLoop {
    public static void main(String[] args) {

        /*
		 Soru 7 ) Interview Question
		 Kullanicidan bir String isteyin ve Stringi tersten yazdirin.
		 */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen tersten yazdirmak icin bir String yaziniz.");

        String kelime= scan.nextLine();

        for (int i = 0; i <kelime.length(); i++)  {
            System.out.print(kelime.substring(kelime.length()-1 - i, kelime.length()-i));
            
        }
    }
}
