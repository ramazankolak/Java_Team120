package sampleQuestions;

import java.util.Scanner;

public class Soru18 {
    public static void main(String[] args) {

        //Soru 18-) Method Sorusu
        //Girilen araç hızı ve yol kilometresinden,
        // gidilen yere varış süresini hesaplayan bir method yazalım.
        // Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
        //İpucu:
        //yol=Hız*zaman

        varisSuresiHesaplama();
    }

    public static void varisSuresiHesaplama(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen kalan yolu giriniz");
        double yol=scanner.nextDouble();
        System.out.println("Lutfen hizinizi giriniz");
        double hiz= scanner.nextDouble();


        System.out.println("Gideceginiz mesafe kalan sure "+yol/hiz+" saat");

    }

}
