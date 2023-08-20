package day07_ifStatesments;

import java.util.Scanner;

public class C06_Bagimsiz_IfCumleleriOrn4 {
    public static void main(String[] args) {

        //Kullanicidan pozitif bir tamsayi isteyin,
        // sayi 3 veya 5 ile bolunebiliyorsa "Guzel sayi" yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");

        int girilenSayi=scanner.nextInt();

        if (girilenSayi%3==0||girilenSayi%5==0){
            System.out.println("Guzel sayi");
        }



    }
}
