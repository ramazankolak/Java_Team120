package day08_IfElse_Statesments;

import java.util.Scanner;

public class C03_IfElseIfStatesments {
    public static void main(String[] args) {
       //Ogrencinin notu 85 ve ustu ise AA
        // (85 ve ustu degilse)65 ve ustu ise BB,
        // (65 ve ustu de degilse) 50 ve ustu ise CC,(geriye kalanlar) DD

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double girilenNot= scanner.nextDouble();

        if (girilenNot>=85) System.out.println("AA");
        else if (girilenNot<85 &&girilenNot>=65) {
            System.out.println("BB");

        } else if (girilenNot<65&&girilenNot>=50) {
            System.out.println("CC");

        }
        else System.out.println("DD");


    }
}
