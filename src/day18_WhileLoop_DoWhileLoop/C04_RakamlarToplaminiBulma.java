package day18_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class C04_RakamlarToplaminiBulma {
    public static void main(String[] args) {

        //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen rakamlar toplamini bulmak istediginiz sayiyi giriniz");
        int girilenSayi=scanner.nextInt();

        int sayi=girilenSayi;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        while (sayi>0){

            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;


        }
        System.out.println("girilen sayinin rakamlar toplami: "+rakamlarToplami);

    }
}
