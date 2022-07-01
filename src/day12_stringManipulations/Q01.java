package day12_stringManipulations;

public class Q01 {
    public static void main(String[] args) {

       /*
       String methodlarini kulanarak " Java ogrenmek123 Cok guzel@ " String'ini
       "Java ogrenmek cok guzel." sekline getirin.

       */

        String str=" Java ogrenmek123 Cok guzel@ ";

        str=str.trim();
        System.out.println(str);
        str=str.replace(" ", "xqax");
        System.out.println(str);
        str=str.replaceAll("\\W","");
        System.out.println(str);
        str=str.replaceAll("\\d","");
        System.out.println(str);
        str=str.replaceAll("xqax", " ");
        System.out.println(str);
        str=str.replace("C", "c");
        str=str+".";
        System.out.println(str);



    }
}
