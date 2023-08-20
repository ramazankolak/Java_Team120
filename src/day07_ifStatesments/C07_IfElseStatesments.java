package day07_ifStatesments;

import java.util.Scanner;

public class C07_IfElseStatesments {
    public static void main(String[] args) {

        //Kullanicidan notunu isteyin, 50 ve üzeriyse Sinifi gectin, degilse Maalesef kaldin yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double not=scanner.nextDouble();

        if (not >=50){
            System.out.println("Sinifi gectin");
        } else {
            System.out.println("Maalesef kaldin");
        }



    }
}
