package day09_NestedIfElseStatesments_Ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir tamsayi alin ve sayinin tek mi cift mi oldugunu yazdirin.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int girilenSayi=scanner.nextInt();

        if (girilenSayi%2==0){
            System.out.println("Çift sayi");
        }else System.out.println("Tek sayi");

        System.out.println(girilenSayi % 2==0 ? "Çift sayi":"Tek sayi");
    }
}
