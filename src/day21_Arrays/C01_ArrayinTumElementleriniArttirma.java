package day21_Arrays;

import java.util.Arrays;

public class C01_ArrayinTumElementleriniArttirma {
    public static void main(String[] args) {

        int[] arr={3,4,6,8,1};

            arr=arrElementArt(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static int[] arrElementArt(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            arr[i]=arr[i]+2;



        }
        return arr;


    }
}
