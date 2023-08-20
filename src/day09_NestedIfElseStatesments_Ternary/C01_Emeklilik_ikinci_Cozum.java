package day09_NestedIfElseStatesments_Ternary;

import java.util.Scanner;

public class C01_Emeklilik_ikinci_Cozum {
    public static void main(String[] args) {
        //Kullanicidan cinsiyetini ve yasini alin,
        //Kadin, 60 yas ve uzeri, Erkek 65 yas ve uzeri emekli olabilir.
        //Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //Veya Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz E: Erkek, K: Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scanner.nextDouble();


        if (yas < 10 || yas > 80) {
            System.out.println("Gecersiz yas");
        } else if (yas < 60) {
            if (cinsiyet == 'K')
                System.out.println(60 - yas + " yil daha calismalisiniz");
            if (cinsiyet == 'E')
                System.out.println(65 - yas + " yil daha calismalisiniz");
        } else if (yas < 65) {
            if (cinsiyet == 'K') System.out.println("Emekli olabilirsin");
            if (cinsiyet == 'E') System.out.println(65 - yas + " yil daha calismalisiniz");

        } else if (cinsiyet == 'K' || cinsiyet == 'E') {
            System.out.println("Emekli olabilirsin");
        } else {
            System.out.println("Hatali cinsiyet girdiniz");


        }
    }
}
