package day08_IfElse_Statesments;

import java.util.Scanner;

public class C07_NestedIfElseIfStatesments {
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

        if (cinsiyet == 'E') {
            if (yas < 18 || yas > 100) System.out.println("Hatali yas girdiniz");
            else if (yas < 65) {
                System.out.println(65 - yas + "yil daha calismalisiniz");
            } else if (yas >= 65) {
                System.out.println("Emekli olabilirsiniz");
        }
        }


        if (cinsiyet == 'K') {
            if (yas < 18 || yas > 100) System.out.println("Hatali yas girdiniz");
            else if (yas < 60) {
                System.out.println(60 - yas + "yil daha calismalisiniz");
            } else if (yas >= 60) {
                System.out.println("Emekli olabilirsiniz");
            }
        }else System.out.println("Hatali cinsiyet girdiniz");

        }
    }
