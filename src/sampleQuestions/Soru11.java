package sampleQuestions;

import java.util.Scanner;

public class Soru11 {
    public static void main(String[] args) {

        //Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
        //                 Ad ve soyadın baş harfleri büyük olmalıdır
        //                 Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
        //                 Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
        //Ipucu: IF ile çözebilirsiniz.
        //Giriş :
        //		 > Gandalf Grey 5632458796329632
        //Çıktı :
        //		 > İsim : G****** G***
        //		 > CCN : **** **** 9632

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String name=scanner.nextLine();
        System.out.println("Lutfen soyadinizi giriniz");
        String surname=scanner.nextLine();
        System.out.println("Lutfen kredi kartı numaranızı giriniz");
        String creditcard=scanner.nextLine();

        if (creditcard.length()!=16){
            System.out.println("Geçersiz kredi kartı numarası");

        }else System.out.println("İsim : "+name.toUpperCase().charAt(0)+name.substring(1).replaceAll("\\D","*")+
                        " "+surname.toUpperCase().charAt(0)+surname.substring(1).replaceAll("\\D","*")+
                "\nCCN : "+creditcard.substring(0,4).replaceAll("\\w","*")+" "+
                creditcard.substring(4,8).replaceAll("\\w","*")+" "+creditcard.substring(8,12).replaceAll("\\w","*")+" "+
                creditcard.substring(12));








    }
}
