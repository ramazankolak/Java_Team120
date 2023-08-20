package sampleQuestions;

import java.util.Scanner;

public class Soru20 {
    public static void main(String[] args) {

        //Soru 20-)
        //Kullanıcıdan bir isim yazmasını isteyin
        // İsim uzunluğu 3 olmalıdır. Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
        //Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ;
        //aynı karakterlere sahip degilse  "String benzersiz karakterlere sahip" yazdırın.
        // İsim 3 karakterden uzunsa "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.
        //
        //   Örnek:
        //   giriş: ama
        //   çıkış: Dizede yinelenen karakterler var
        //   İpucu: İf Else ve Char kullanarak çözebiliriz.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 3 harfli bir isim giriniz");
        String isim=scanner.next();
        char ilkHarf=isim.charAt(0);
        char ikinciHarf=isim.charAt(1);
        char ucuncuHarf=isim.charAt(2);


        if (isim.length()>3){
            System.out.println("Bu kadar uzun cümleyi anlayamam ben agam");
        }else if (isim.length()==3&&!(ilkHarf==ikinciHarf)&&!(ilkHarf==ucuncuHarf)&&!(ikinciHarf==ucuncuHarf)){
                System.out.println("Dize benzersiz karakterlere sahip");

            }else System.out.println("Dize yinelenen karakterlere sahip");
        }

    }

