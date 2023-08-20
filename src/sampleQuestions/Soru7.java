package sampleQuestions;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {

        //Soru 7-)  Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
        //(Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
        //ipuclari:
        //( Data Casting -> Auto Widening ve Explicit Narrowing )

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen double data turunden bir sayi giriniz");
        double sayi=scanner.nextDouble();
        int tamsayi=(int)sayi;
        System.out.println(tamsayi);

        System.out.println("Lutfen float data turunden bir sayi giriniz");
        float sayi2=scanner.nextFloat();
        short sh=(short) sayi2;
        System.out.println(sh);


    }
}
