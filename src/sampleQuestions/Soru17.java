package sampleQuestions;

import java.util.Scanner;

public class Soru17 {
    public static void main(String[] args) {
        //Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır.
        // Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
        //İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"
        // değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
        //Ipucu:
        //IF/Else - Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 3 harfli bir isim giriniz");
        String isim=scanner.next();
        char ilkHarf=isim.charAt(0);
        char ikinciHarf=isim.charAt(1);
        char ucuncuHarf=isim.charAt(2);

        if (!(ilkHarf==ikinciHarf)&&!(ilkHarf==ucuncuHarf)&&!(ikinciHarf==ucuncuHarf)){
            System.out.println("Dize benzersiz karakterlere sahip");

        }else System.out.println("Dize yinelenen karakterlere sahip");






    }
}
