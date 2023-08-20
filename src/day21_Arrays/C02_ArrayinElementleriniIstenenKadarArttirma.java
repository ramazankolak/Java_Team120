package day21_Arrays;

import java.util.Arrays;

public class C02_ArrayinElementleriniIstenenKadarArttirma {
    public static void main(String[] args) {

        int[] arr = {3, 5, 2};

        int artis = 4;

        //verilen array'in tüm elementlerini artis miktari kadar arttirin.


        arrayElementArttir(arr, artis);
        System.out.println(Arrays.toString(arr));


    }

    public static int[] arrayElementArttir(int[] arr,int artis) {
        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i] + artis;


        }
        return arr;
    }
}
