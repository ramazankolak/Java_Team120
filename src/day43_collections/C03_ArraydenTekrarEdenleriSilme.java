package day43_collections;

import java.util.*;

public class C03_ArraydenTekrarEdenleriSilme {
    public static void main(String[] args) {


        int[] arr={2,4,5,6,3,4,2,1,5,6,4,3,2,3,0,1,3,4,2,5};

        // verilen array'deki tekrar eden elementleri silip
        // array'i her elementin sadece 1 kere bulundugu bir hale donusturun
        // bos bir list olusturup, array'deki elementleri tek tek ele aldik
        // ele aldigimiz element list'de yoksa list'e ekledik

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!tekrarsizList.contains(arr[i])){

                tekrarsizList.add(arr[i]);
            }

        }
        System.out.println(tekrarsizList);

        //aynı işlemi set ile daha kolay yapabiliriz çünkü setin tüm elemanları benzersiz olmalıdır

        Set<Integer> tekrarsizSet =new TreeSet<>();

        for (int each: arr
             ) {
            tekrarsizSet.add(each);
            
        }
        System.out.println(tekrarsizSet);//[0, 1, 2, 3, 4, 5, 6]

        //tekrarsiz elemanları set olarak elde ettik array'i setteki elemanlardan olusan hale getirmemiz lazım

        arr=new int [tekrarsizSet.size()];
        int index=0;
        for (int each: tekrarsizSet
             ) {
            arr[index]=each;
            index++;
        }
        System.out.println(Arrays.toString(arr));//[0, 1, 2, 3, 4, 5, 6]
    }
}
