package day05_matematikselIslemler_Increment;

import java.util.Scanner;

public class C02_RakamlarToplaminiBulma {
    public static void main(String[] args) {

        //Kullanicidan 3 basamakli bir sayi alip rakamlarini toplayin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli pozitif bir sayi giriniz: ");

        int girilenSayi=scanner.nextInt();

        int rakamlarToplami;

        rakamlarToplami=girilenSayi %10;
        girilenSayi=girilenSayi/10;
        rakamlarToplami=rakamlarToplami+girilenSayi%10;
        girilenSayi=girilenSayi/10;
        rakamlarToplami=rakamlarToplami+girilenSayi%10;

        System.out.println("Girilen sayinin rakamlari toplami: "+rakamlarToplami);




    }
}
