package sampleQuestions;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {

        //Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        // Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        // 1 şeker = 1.5 gr
        //1 kg = 1000 gram      olarak hesaplayınç
        // Ipuclari:
        //·        Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("1 günde kac bardak cay iciyorsunuz");
        int cay=scanner.nextInt();
        System.out.println("1 bardak caya ne kadar seker atıyorsunuz");
        int seker=scanner.nextInt();

        int toplamCay=365*cay;
        double toplamSeker=1.5*seker*toplamCay;

        System.out.println("1 yılda icilen cay: "+toplamCay+" bardak");
        System.out.println("1 yılda kullanilan seker miktari: "+toplamSeker/1000+"kg");



    }

}