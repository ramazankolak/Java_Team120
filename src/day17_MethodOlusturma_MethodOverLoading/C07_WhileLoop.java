package day17_MethodOlusturma_MethodOverLoading;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
        //Soru 4 : Main methodda Kullanicidan bir sifre isteyip,
        //          olusturacağımız metodda asagidaki sartlari kontrol edin
        //          ve method'dan true veya false döndürün
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         tum sartlar sağlanıncaya kadar deger isteyin
        //         ve sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali
        // flag yontemini kullanalim
        // flag'i basta true yapalim, her uygun olmayan durumda false degeri atayalim






        boolean sonuc=false;
        while (sonuc==false){
            Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen sifrenizi giriniz");
        String sifre = scanner.nextLine();
            sonuc=sifreKontrolEt(sifre);
    }
        System.out.println("Sifreniz basariyla kaydedildi");


    }

    public static boolean sifreKontrolEt(String sifre) {

        int sayac = 0;
        //         - ilk harf kucuk harf olmali
        char ilkHarf = sifre.charAt(0);
        if (!(ilkHarf >= 'a' && ilkHarf <= 'z')) {
            System.out.println("ilk karakter kucuk olmali");
            sayac++;
        }
            //         - son karakter rakam olmali
            char sonKrk = sifre.charAt(sifre.length() - 1);
            if (!(sonKrk >= '0' && sonKrk <= '9')) {
                System.out.println("son karakter rakam olmali");
                sayac++;
            }
            //         - sifre bosluk icermemeli
            if (!(sifre.contains(" "))) {
                System.out.println("Sifre bosluk icermemeli");
                sayac++;
            }
            //         - uzunlugu en az 10 karakter olmali
            if (sifre.length() < 10){
                System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
                sayac++;
            }



            if (sayac == 0){

                return true;

            }else {
                return false;
            }

        }


    }



