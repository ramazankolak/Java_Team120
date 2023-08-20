package day22_Arrays_MultiDimensionalArrays;

import java.util.Arrays;

public class C04_StringSplit {
    public static void main(String[] args) {


        String str = "Java candir, Selenium heyecan";

        String[] kelimeler =  str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        // [Java, candir,, Selenium, heyecan]

        String[] yeniArr = str.split(", ");
        System.out.println(Arrays.toString(yeniArr)); // [Java candir, Selenium heyecan]
        String[] karakterler = str.split("");

        System.out.println(Arrays.toString(karakterler));
        // [J, a, v, a,  , c, a, n, d, i, r, ,,  , S, e, l, e, n, i, u, m,  , h, e, y, e, c, a, n]




    }
}
