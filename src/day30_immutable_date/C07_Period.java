package day30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {

        // iki tarih arasindaki sureyi bulma

        LocalDate tarih1=LocalDate.of(1978,4,07);
        LocalDate bugun=LocalDate.now();

        Period period= Period.between(bugun, tarih1);
        System.out.println(period);//P-44Y-3M-16D
    }
}
