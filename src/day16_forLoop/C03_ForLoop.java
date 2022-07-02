package day16_forLoop;

public class C03_ForLoop {
    public static void main(String[] args) {
        //10 ile 30 arasında (10 ve 30 dahil) sayıları arasına virgul koyarak yazdırın

        int bas=10;
        int son=30;

        for (int i =bas ; i <=son ; i++) {
            if(i<son){
                System.out.println(i+",");
            }else{
                System.out.println(i);
            }
        }
    }
}
