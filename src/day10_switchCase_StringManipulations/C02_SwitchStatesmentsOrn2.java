package day10_switchCase_StringManipulations;

import java.util.Scanner;

public class C02_SwitchStatesmentsOrn2 {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin

        Scanner scanner=new Scanner(System.in);

        System.out.println("Görmek istediğiniz gün numarasını giriniz");

        int gun=scanner.nextInt();


        switch (gun){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Haftaiçi");
                break;
            case 6:
            case 7:
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Hatali gun numarasi. Lutfen 1-7 arasinda bir rakam girin");
        }


    }
}


