package day07_ifStatesments;

import java.util.Scanner;

public class C03_If_Cumleleri_Ornekleri {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        // “Sayi 5’in tam kati” yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("lutfen pozitif bir tamsayi giriniz");

        int girilenSayi=scanner.nextInt();

        if (girilenSayi % 5==0){
            System.out.println("Girirelen sayi 5'in tam katidir");
        }


    }
}
