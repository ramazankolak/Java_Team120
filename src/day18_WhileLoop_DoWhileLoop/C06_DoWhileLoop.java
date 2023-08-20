package day18_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {

        //kullanicidan toplanmak uzere pozitif sayilar isteyin.
        // Kullanici islemi bitirmek icin 0'a basmalidr.
        // Kullanici 0'a bastiginda kac pozitif bir sayi girdigini ve toplamlarinin kac oldugunu yazdirin

        Scanner scanner;

        int girilenSayi;
        int toplam = 0;
        int sayac = 0;
        /*


        while (girilenSayi!=0){
           scanner= new Scanner(System.in);
            System.out.println("Lutfen toplanmak uzere sayilar giriniz");
           girilenSayi=scanner.nextInt();

           if (girilenSayi>0){
               sayac++;
               toplam+=girilenSayi;
           }


        }
        System.out.println(sayac+"tane pozitif sayi girdiniz. Girdiginiz pozitif sayilarin toplami: "+toplam);

         */
        do {
            scanner = new Scanner(System.in);
            System.out.println("Lutfen toplanmak uzere sayilar giriniz");
            girilenSayi = scanner.nextInt();


            if (girilenSayi > 0) {
                sayac++;
                toplam += girilenSayi;
            }

            }
            while (girilenSayi != 0);
                System.out.println(sayac + "tane pozitif sayi girdiniz. Girdiginiz pozitif sayilarin toplami: " + toplam);




    }
}
