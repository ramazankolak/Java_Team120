package day03_scanner;

import java.util.Scanner;

public class C05_ScannerSoru3 {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini yazdirin.

        Scanner scanner= new Scanner(System.in);

        System.out.println("Alan hesaplamasi icin lutfen dikdortgenin iki kenarini giriniz");

        double kenar1=scanner.nextDouble();
        double kenar2=scanner.nextDouble();

        System.out.println("Dikdortgenin alani: "+kenar1*kenar2);



    }
}
