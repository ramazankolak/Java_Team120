package day14_forLoop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin


        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen baslangic degeri icin pozitif bir tamsayi giriniz");

        int baslangic=scanner.nextInt();

        System.out.println("Lutfen bitis degeri icin pozitif bir tamsayi giriniz");
        int bitis=scanner.nextInt();

        if (bitis<baslangic){
            System.out.println("Bitis degeri baslangic degerinden kucuk olamaz");
        }else {
            int toplam=0;

            for (int i = baslangic; i <= bitis; i++) {
                toplam+=i;
            }
            System.out.println("Sinirlar arasindaki tamsayilar toplami: "+toplam);



        }









    }
}
