package day03_scanner;

import java.util.Scanner;

public class C03_ScannerSoruOrnekleri {
    public static void main(String[] args) {
        //Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen double turunde bir sayi giriniz");
        double girilenDouble=scanner.nextDouble();

        System.out.println("Lutfen int turunde bir sayi giriniz");
        int girilenInt=scanner.nextInt();

        System.out.println("Iki sayinin toplami: "+(girilenInt+girilenDouble));
        System.out.println("Iki sayinin carpimi: "+girilenInt*girilenDouble);



    }
}
