package day14_forLoop;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsa da program calissin


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen baslangic icin bir pozitif tamsayi giriniz");
        int baslangic=scanner.nextInt();

        System.out.println("Lutfen bitis icin bir pozitif tamsayi giriniz");
        int bitis=scanner.nextInt();

        int toplam=0;

        if (bitis<baslangic){
            for (int i = bitis; i <= baslangic; i++) {
                toplam+=i;
            }
        }else {
            for (int i = baslangic; i <= bitis; i++) {
                toplam+=i;

            }

        }
        System.out.println("Sayilarin toplami: "+toplam);




    }
}
