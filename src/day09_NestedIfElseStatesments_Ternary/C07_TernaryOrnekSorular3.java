package day09_NestedIfElseStatesments_Ternary;

import java.util.Scanner;

public class C07_TernaryOrnekSorular3 {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi=scanner.nextDouble();


        System.out.println(sayi>=0?sayi:sayi*(-1));





    }
}
