package day07_ifStatesments;

import java.util.Scanner;

public class C05_Bagimsiz_IfCumleleriOrn3 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir ucgenin 3 kenarini giriniz");

        double kenar1=scanner.nextDouble();
        double kenar2=scanner.nextDouble();
        double kenar3=scanner.nextDouble();

        if (kenar1==kenar2 || kenar1==kenar3){
            System.out.println("Bu ucgen bir eskenar ucgendir");
        }




    }
}
