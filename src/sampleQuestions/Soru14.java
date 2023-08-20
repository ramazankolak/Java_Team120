package sampleQuestions;

import java.util.Scanner;

public class Soru14 {
    public static void main(String[] args) {

        //Soru 14-)
        //Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        // ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
        //Örnek:
        //char ch1=            'a'
        //String name =     "Ali bakkala geç gitti."
        //Beklenen Çıktı=    a sayısı = 3
        //Ipucu:
        //Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz!
        //Sayac adlı bir int variable oluşturarak bunun ile kelimenin kaç defa geçtigini Loop içindeki İf ile bulabilirsiniz!

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin=scanner.nextLine();
        System.out.println("Lutfen bir karakter giriniz");
        char krktr=scanner.nextLine().charAt(0);

        int index=0;
        int sayac=0;

        while (index<metin.length()){
            if (metin.charAt(index)==krktr){
                sayac++;
            }
            index++;
        }
        if (sayac>0){
            System.out.println("Aradiginiz karakter bu metinde "+sayac+" defa geciyor");
        }
        System.out.println("Aradiginiz karakter bu metinde hiç geçmiyor");

    }
}
