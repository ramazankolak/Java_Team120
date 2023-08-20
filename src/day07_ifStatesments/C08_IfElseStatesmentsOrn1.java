package day07_ifStatesments;

import java.util.Scanner;

public class C08_IfElseStatesmentsOrn1 {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenarlarini giriniz");

        double kenar1=scanner.nextDouble();
        double kenar2=scanner.nextDouble();
        double kenar3=scanner.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar degil");
        }


    }
}
