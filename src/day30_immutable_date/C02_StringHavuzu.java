package day30_immutable_date;

public class C02_StringHavuzu {

    public static void main(String[] args) {


        String str1 = "Ali Can";
        String str2 = str1 + "";
        String str3 = new String("Ali Can");
        String hiclik = "";
        String str4 = str1.concat(hiclik);

        System.out.println(str1==str2);// false
        System.out.println(str1.equals(str2));//true

        System.out.println(str1.equals(str3));//true
        System.out.println(str1==str3);//false

        System.out.println(str2.equals(str4));//true
        System.out.println(str2==str4);//false


        System.out.println("s1-s4 : " + str1.equals(str4));//true
        System.out.println("s1-s4 : " + (str1==str4));//true

        /*
        yeni bir String olustururken
        1- esitligin sag tarafinda new keyword'u olursa java direkt yeni bir obje ve ref olusturur.
        2- eger esitligin saginda bir method calisiyor veya + islemi yapiliyorsa String immutable oldigindan degisikligi
        kaydetmek uzerer hemen bir kopya String ve referansi olusturur, sonra degeri hesaplayip bu yeni kopya objenin
        icine koyar.
         */


        String str5="Ali Can";
        String str6=str1;

        System.out.println(str1.equals(str5));// true
        System.out.println(str5==str1);//true

        System.out.println(str1.equals(str6));//true
        System.out.println(str1==str6);//true

        /*
        Eger yeni bir String objesi olusturulurken new kelimesi kullanilmaz veya esitligin saginda bir + islemi olmazsa Java bakar
        Eger daha once olusturulan String obje'lerden (String Havuzu) birebir ayni String varsa o obje'yi ve refferansini
        kullanir. Birebir aynisi yoksa yeni bir obje olusturur.
         */

        System.out.println(str5.equals(str6));//true
        System.out.println(str5==str6);//true


    }
}
