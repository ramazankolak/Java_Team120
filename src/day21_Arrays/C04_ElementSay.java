package day21_Arrays;

public class C04_ElementSay {
    public static void main(String[] args) {

        // Verilen bir arrayde istenen bir elementin var olup olmadigini
        // ve varsa kaç kere kullanildigini yazdiran bir method olusturun.


        int[] arr={3,5,2,3,7,5,7,1,8};
        int arananSayi=5;
        int sayac=0;

        arananSayiyiBulma(arr, arananSayi);

    }
    public static void arananSayiyiBulma (int[] arr,int arananSayi){
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==arananSayi){
                sayac++;
            }

        }
        if (sayac>0){
            System.out.println("Aradiginiz sayi "+arananSayi+" bu dizide "+sayac+" kere kullanilmistir.");
        }else System.out.println("Aradiginiz sayi bu dizide hiç kullanilmamistir");


    }
}
