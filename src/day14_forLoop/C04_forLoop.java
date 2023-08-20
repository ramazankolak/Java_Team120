package day14_forLoop;

import java.util.Scanner;

public class C04_forLoop {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk bir tamsayi giriniz");
        int sayi=scanner.nextInt();

        int carpim=1;
        if (sayi<20){
            for (int i = 1; i <=sayi; i++) {
                carpim*=i;

        }

        }else {
            System.out.println("Lutfen 20'den kucuk bir deger giriniz");
        }

        System.out.println("sayilarin çarpimi: "+carpim);



    }
}
