package day04_dataCasting_wrapperClass;

import java.util.Scanner;
import java.util.SortedMap;

public class C04_CharCasting {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen ascii tablosundan bir karakter giriniz.");

        char girilenChar=scanner.next().charAt(0);
        System.out.println("Girilen karakter: "+girilenChar);

        System.out.println("Girilen charin ascii tablosundaki sonraki 3 degeri: "
                +(char)(girilenChar+1)+", "+(char)(girilenChar+2)+
                ", "+(char)(girilenChar+3));

    }
}
