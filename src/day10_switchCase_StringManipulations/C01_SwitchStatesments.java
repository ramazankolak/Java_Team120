package day10_switchCase_StringManipulations;

import java.util.Scanner;

public class C01_SwitchStatesments {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        // ve girilen harfin karsiligini yazdirin.
        // I : International S : Software T : Testing Q : Qualifications B: Board
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen görmek istediginiz harfi giriniz");
        char harf=scanner.next().toUpperCase().charAt(0);

        switch (harf){

            case 'I':
                System.out.println("International");
                break;
            case 'S':
                System.out.println("Software");
                break;
            case 'T':
                System.out.println("Testing");
                break;
            case 'Q':
                System.out.println("Qualifications");
                break;
            case 'B':
                System.out.println("Board");
            default:
                System.out.println("Yazdiginiz harf ISTQB'de yok");


        }





    }
}
