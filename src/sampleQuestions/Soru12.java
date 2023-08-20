package sampleQuestions;

import java.util.Scanner;

public class Soru12 {
    public static void main(String[] args) {

        //Soru 12-)
        //Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için bir program oluşturalım
        //Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım
        //Ipucu:  IF/Else kullanabilirsiniz.
        //Örnek:
        //İki tamsayı girin:
        //25  veya  4567986321453
        //46   veya 123456
        //Konsolda Çıktı :
        //Sayıların toplamı: 71  veya  Fazla Yüklenme

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ilk tamsayiyi giriniz");
        int ilkSayi=scanner.nextInt();
        System.out.println("Lutfen ikinci tamsayiyi giriniz");
        int ikinciSayi=scanner.nextInt();

        int toplam=ilkSayi+ikinciSayi;

        if (toplam>=1000000000){
            System.out.println("Fazla Yüklenme");
        }else System.out.println("Sayıların toplamı: "+toplam);



    }
}
