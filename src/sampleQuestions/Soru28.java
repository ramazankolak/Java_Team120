package sampleQuestions;

import java.util.Scanner;

public class Soru28 {
    public static void main(String[] args) {
        //Soru-28)
        //Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
        //Örnek:
        //      Sayı: 1238
        //      Sayının Tersi: 8321
        //İpucu:  Loop kullanabilirsiniz.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scanner.nextInt();
        int girilenSayi=sayi;
        int basamakSayisi = 0;
        String sonuc="";
        int sonBasamak=0;
        while (sayi != 0) {
            sayi /= 10;
            basamakSayisi++;
        }

        for (int i = 0; i <basamakSayisi ; i++) {
            sonBasamak=girilenSayi%10;
            girilenSayi/=10;
            sonuc=sonuc+sonBasamak;

        }
        System.out.println(sonuc);
    }
}
