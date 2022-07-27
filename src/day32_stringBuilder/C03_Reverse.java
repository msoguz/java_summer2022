package day32_stringBuilder;

public class C03_Reverse {
    public static void main(String[] args) {

        //Verilen bir inputu tersine cevirip bize donduren bir method olusturun.


        String input="Hey gidi for Loop gunler";

        String tersInput=tersineCevir(input);

        System.out.println(tersInput); //relnug pooL rof idig yeH

    }

    public static String tersineCevir(String input) {

        StringBuilder sb=new StringBuilder(input);

        return sb.reverse().toString();  // StringBuilder return etmedigi icin toString methodu ile String'e cevirdik.



    }
}
