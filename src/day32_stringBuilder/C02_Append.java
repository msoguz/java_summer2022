package day32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java daha ne yapsin");
        sb.append("?");  // soru isareti ekledik. append sona ekler.
        System.out.println(sb);  //Java dah ne yapsin?

        //append istedigimiz string'i en sona ekler. int, char, string, boolean ekler.

        sb.append("Java",2,4);
        System.out.println(sb); //Java her seyi dusunmus valla, daha ne yapsin?va


        sb.insert(4, " her seyi dusunmus,");
        System.out.println(sb);

        // araya ekleme yapmak istersek append degil insert kullanmaliyiz.

        sb.insert(22,"valla valla", 5,11);
        System.out.println(sb);  //Java her seyi dusunmus valla, daha ne yapsin?




    }
}
