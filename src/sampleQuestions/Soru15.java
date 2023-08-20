package sampleQuestions;

import java.util.Scanner;

public class Soru15 {
    public static void main(String[] args) {

        //Soru 15-)  Kullanıcıdan en az 5 harfli bir kelime alın.
        //           Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
        //           Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
        //           Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
        //           Loopun içerisinde StringM methodlarından  yararlanalım!

        Scanner scanner;
        System.out.println("Lutfen uzunluğu en az 5 olan bir kelime girin");
        String kelime="12345";

       do {
           if (kelime.length()<5){
               System.out.println("Lutfen yeni bir kelime giriniz");
           }
           scanner=new Scanner(System.in);
           kelime=scanner.next();

       }while (kelime.length()<5);
        if (kelime.length()>=5){
            String yeniKelime=kelime.substring(kelime.length()-3)+kelime.substring(kelime.length()-3);
            System.out.println(yeniKelime);
        }


    }
}
