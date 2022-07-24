package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {

    public static void main(String[] args) {

        LocalTime time1=LocalTime.now();
        System.out.println(time1);//19:12:20.879248200

        /*
        Bizim olusturdugumuz date ve time canli saat veya tarih degildir.
        LocalTime.now(); kullandigimiz satirda o anki taih veya saati alip bizim variable'imiza store eder.
        time1 variable'inin degeri sabittir.
         */

      //  Thread.sleep(3000);
        time1=LocalTime.now();

        System.out.println(time1);//19:31:59.828194500
        System.out.println(time1.getSecond());//59
        System.out.println(time1.plusSeconds(10000));//22:18:39.828194500
    }
}
