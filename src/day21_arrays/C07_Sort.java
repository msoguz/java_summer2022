package day21_arrays;

import java.util.Arrays;

public class C07_Sort {
    public static void main(String[] args) {


        int[] sayilar={5,7,1,6,4,3,9};

        // Array'i Arrays class'ini kullanarak natural sirali hale getirebiliriz. (sort method'u ile)

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar)); //[1, 3, 4, 5, 6, 7, 9]


    }
}
