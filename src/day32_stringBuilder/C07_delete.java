package day32_stringBuilder;

public class C07_delete {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java her zaman guzel");

        sb.delete(8,9);

        System.out.println(sb); //Java herzaman guzel

        sb.deleteCharAt(7);
        System.out.println(sb); //

        //bastan baslayarak her loop'ta ilk harfi silip kalani yazdiralim.


        int son=sb.length();  //int objesi olusturmasaydik her adimda length azalacagi icin sorun olurdu.
        for (int i = 0; i <son ; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);
        }


    }
}
