package sampleQuestions;

import java.util.Scanner;

public class Soru19 {
    public static void main(String[] args) {

        //Soru 19-)  Method Sorusu
        //Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
        //ipucu:
        //Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.
            burcHesaplama();
    }
    public static void burcHesaplama(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen dogdugunuz ayi giriniz");
        int ay=scanner.nextInt();
        System.out.println("Lutfen dogdugunuz gunu giriniz");
        int gun=scanner.nextInt();
        if (gun>0&&gun<=31&&ay>0&&ay<=12){
            switch (ay) {
                case 1 -> {
                    if (gun <= 20) {
                        System.out.println("Burcunuz Oğlak");
                    } else System.out.println("Burcunuz Kova");
                }
                case 2 -> {
                    if (gun >= 20) {
                        System.out.println("Burcunuz Balık");
                    } else System.out.println("Burcunuz Kova");
                }
                case 3 -> {
                    if (gun <= 20) {
                        System.out.println("Burcunuz Balık");
                    } else System.out.println("Burcunuz Koç");
                }
                case 4 -> {
                    if (gun < 21) {
                        System.out.println("Burcunuz Koç");
                    } else System.out.println("Burcunuz Boğa");
                }
                case 5 -> {
                    if (gun < 21) {
                        System.out.println("Burcunuz Boğa");
                    } else System.out.println("Burcunuz İkizler");
                }
                case 6 -> {
                    if (gun <= 21) {
                        System.out.println("Burcunuz İkizler");
                    } else System.out.println("Burcunuz Yengeç");
                }
                case 7 -> {
                    if (gun <= 22) {
                        System.out.println("Burcunuz Yengeç");
                    } else System.out.println("Burcunuz Başak");
                }
                case 8 -> {
                    if (gun <= 23) {
                        System.out.println("Burcunuz Aslan");
                    } else System.out.println("Burcunuz Başak");
                }
                case 9 -> {
                    if (gun <= 23) {
                        System.out.println("Burcunuz Başak");
                    } else System.out.println("Burcunuz Terazi");
                }
                case 10 -> {
                    if (gun <= 23) {
                        System.out.println("Burcunuz Terazi");
                    } else System.out.println("Burcunuz Akrep");
                }
                case 11 -> {
                    if (gun <= 23) {
                        System.out.println("Burcunuz Akrep");
                    } else System.out.println("Burcunuz Yay");
                }
                case 12 -> {
                    if (gun <= 23) {
                        System.out.println("Burcunuz Yay");
                    } else System.out.println("Burcunuz Oğlak");
                }
            }
        }else System.out.println("Hatali gün veya ay girdiniz tekrar deneyiniz");

    }
}
