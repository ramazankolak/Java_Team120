package day03_scanner;

import java.util.Scanner;

public class C06_ScannerSoru4 {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen cemberin yaricapini giriniz");

        double yaricap=scanner.nextDouble();

        System.out.println("Cemberin cevresi: "+2*3.14*yaricap+"\nCemberin alani: " +3.14*yaricap*yaricap);


    }
}
