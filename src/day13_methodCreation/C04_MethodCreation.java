package day13_methodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {

      // input olarak verilen iki int'i toplayip sonucu yazdiran bir method olusturun

        int input1=10;
        int input2=20;

        // method 4 adimda olurturulur.
        // 1. adim method call.
        //2. adim argument eklenmesi gerekiyorsa ekleyelim.
        // eger methodun return type'i void'den farkli olacaksa
        // bir variable olusturup method call'i assign edelim.

        topla(input1, input2);




    }

    public static void topla(int input1, int input2) {

        // 3. adim method deklarasyonda degistirilmesi gereken bolumleri degistir.(acces modifier, return type vb...
        // 4. adim eger return typr void disinda bir sey ise return keyword'u ve donecek degeri hesaplamaliyiz.
        System.out.println("Girilen iki sayinin toplami : " + (input1+input2));
    }
}
