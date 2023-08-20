package day03_scanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        //Kullanicidan bir tam sayi alip karesini yazdirin.
        //Scanner ile kullanicidan bilgi almak icin 3 adima ihtiyac duyariz.
        //1. adim= scanner objesi olusturmak.

        Scanner scanner =new Scanner(System.in);

        //2. adim=Kullaniciya ne istediginizi söyleyin.

        System.out.println("Lutfen bir tamsayi giriniz.");

        //3.adim=Istediginiz datanın turune uygun bir variable olusturun.
        // ve scanner objesini kullanarak uygun method ile kullanicinin girdigi degeri alin.


        int girilenSayi=scanner.nextInt();

        // artik kullanicinin girdigi sayiyi aldiniz istediginiz sekilde yazdirabilirsiniz.

        System.out.println("Girilen sayinin karesi: "+girilenSayi*girilenSayi);









    }
}
