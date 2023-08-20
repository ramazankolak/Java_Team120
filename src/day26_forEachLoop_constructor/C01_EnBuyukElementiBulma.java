package day26_forEachLoop_constructor;

import java.util.Arrays;

public class C01_EnBuyukElementiBulma {
    public static void main(String[] args) {

        int[] arr={3,4,5,6,88,9,4,55,66,3};

        int enBuyukElement=arr[0];

        for (int each:arr
             ) {

            if (each>enBuyukElement){
                enBuyukElement=each;
            }

        }
        System.out.println(enBuyukElement);


    }
}
