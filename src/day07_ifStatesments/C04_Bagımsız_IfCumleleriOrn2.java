package day07_ifStatesments;

import java.util.Scanner;

public class C04_Bagımsız_IfCumleleriOrn2 {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir sayi alin,
        // sayi 3 ile bolunuyorsa “Uc ile bolunebilen sayi”,
        // 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");

        double girilenSayi=scanner.nextDouble();


        if (girilenSayi % 3==0){
            System.out.println("Uc ile bolunebilen sayi");
        }
        if (girilenSayi%5==0){
            System.out.println("Bes ile bolunebilen sayi");
        }




    }
}
