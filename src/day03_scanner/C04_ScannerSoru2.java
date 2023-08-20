package day03_scanner;

import java.util.Scanner;

public class C04_ScannerSoru2 {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz.");
        String girilenIsim=scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz.");
        String girilenSoyIsim=scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz.");
        int girilenYas=scanner.nextInt();

        System.out.println("Isminiz: "+girilenIsim+ "\nSoyisminiz: "+girilenSoyIsim+ "\nYasiniz: "+girilenYas+
                            "\nKaydiniz basariyla tamamlanmistir.");

    }
}
