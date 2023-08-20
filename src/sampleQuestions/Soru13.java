package sampleQuestions;

import java.util.Scanner;

public class Soru13 {
    public static void main(String[] args) {

        //Soru 13-)
        //Char cevap değişkeninin değerini test edelim ve aşağıdaki eylemleri gerçekleştiren bir kod yazalım:
        //Cevap a ise, konsolda 'İsteğiniz işleniyor' mesajı yazsın
        //Yanıt b ise, konsolda 'Değerlendirmeniz için yine de teşekkür ederiz' mesajı yazsın
        //Yanıt c ise 'Üzgünüm şuanda yardımcı olamıyoruz' mesajı,
        //Yanıtın başka bir değeri için ise 'Geçersiz giriş, lütfen tekrar deneyin!' mesajı yazdırılsın.
        //Ipucu:
        //Switch konusunu hatırlayalım!

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen char data turunden bir deger giriniz");
        char cevap=scanner.nextLine().charAt(0);

        if (cevap=='a'){
            System.out.println("İsteğiniz işleniyor");
            
        } else if (cevap=='b') {
            System.out.println("Değerlendirmeniz için yine de teşekkür ederiz");
            
        } else if (cevap=='c') {
            System.out.println("Üzgünüm şuanda yardımcı olamıyoruz");
            
        }else System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");


    }
}
