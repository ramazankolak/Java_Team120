package day09_NestedIfElseStatesments_Ternary;

import java.util.Scanner;

public class C08_SwitchStatements {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan ay numarasini alip ay ismini yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ogrenmek istediginiz ayin numarasini yazdirin");
        int ayNo=scanner.nextInt();

        if (ayNo==1){
            System.out.println("Ocak");
        } else if (ayNo==2) System.out.println("Subat");
        else if (ayNo==3) System.out.println("Mart");
        else if (ayNo==4) System.out.println("Nisan");
        else if (ayNo==5) System.out.println("Mayis");
        else if (ayNo==6) System.out.println("Haziran");
        else if (ayNo==7) System.out.println("Temmuz");
        else if (ayNo==8) System.out.println("Agustos");
        else if (ayNo==9) System.out.println("Eylul");
        else if (ayNo==10) System.out.println("Ekin");
        else if (ayNo==11) System.out.println("Kasim");
        else if (ayNo==12) System.out.println("Aralık");
        else System.out.println("Hatali ay numarasi girdiniz");

        System.out.println("===========================================================");


        switch (ayNo){
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayis");
                break;
            case 6:
                System.out.println("Haziran");break;
            case 7:
                System.out.println("Temmuz");break;
            case 8:
                System.out.println("Agustos"); break;
            case 9:
                System.out.println("Eylul");break;
            case 10:
                System.out.println("Ekim");break;
            case 11:
                System.out.println("Kasim");break;
            case 12:
                System.out.println("Aralik");break;
            default:
                System.out.println("Hatali ay numarasi girdiniz");




        }


            



    }
}
