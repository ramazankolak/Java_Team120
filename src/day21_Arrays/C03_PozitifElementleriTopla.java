package day21_Arrays;

public class C03_PozitifElementleriTopla {
    public static void main(String[] args) {

        //Soru 2- Verilen bir array’deki
        //        pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.

        int[] arr={-4,5,2,0,3};//beklenen output: 3 pozitif elementin toplami 10
        int sayac=0;
        int toplam=0;

       pozitifElementleriToplama(arr, sayac, toplam);




    }

    public static int pozitifElementleriToplama(int[] arr,int sayac,int toplam){

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]>0)
                sayac++;
            toplam+=i;

        }
        System.out.println(sayac+" pozitif elementin toplami:"+toplam);
        return toplam;
    }
}
