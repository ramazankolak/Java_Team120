package day09_NestedIfElseStatesments_Ternary;

import java.util.Scanner;

public class C05_TernaryOrnekSorular1 {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin,
        // degilse “Eskenar degil” yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenarlarini giriniz");
        double kenar1=scanner.nextDouble();
        double kenar2=scanner.nextDouble();
        double kenar3=scanner.nextDouble();


        System.out.println(kenar1==kenar2&&kenar1==kenar3 &&kenar1>0? "Eskenar Ucgen":"Eskenar degil");




    }
}
