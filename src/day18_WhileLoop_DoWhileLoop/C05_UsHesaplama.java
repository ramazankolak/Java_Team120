package day18_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class C05_UsHesaplama {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        // While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen üssünü hesaplayacaginiz pozitif bir sayi girin");
        double sayi=scanner.nextDouble();


        System.out.println("Lutfen hesaplanacak sayi için pozitif bir üs girin");
        int us=scanner.nextInt();

        usHesapla(sayi,us);


    }
    public static void usHesapla(double sayi, int us){
        double sonuc=1;

        while (us>0){
            sonuc*=sayi;
            us--;


        }
        System.out.println("sonuc: "+sonuc);

    }
}
