package day03_scanner;

import java.util.Scanner;

public class C08_Odev {
    public static void main(String[] args) {

        //Soru 8 (Interview)- Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin degerlerini degistirin(swap).

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen iki tane tam sayi giriniz.");

        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("Girilen ilk sayi1= "+sayi1+"\nGirilen ikinci sayi= "+sayi2);



    }
}
