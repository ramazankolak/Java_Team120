package day09_NestedIfElseStatesments_Ternary;

import java.util.Scanner;

public class C02_IndirimHesaplama {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adedini giriniz");
        int urunSayisi=scanner.nextInt();
        System.out.println("Lutfen liste fiyatini giriniz");
        double fiyat=scanner.nextDouble();
        System.out.println("Musteri kartiniz var mi? E: Evet  H: Hayir");
        char evetHayir=scanner.next().toUpperCase().charAt(0);

        if (evetHayir=='E'){
            if (urunSayisi>10) System.out.println("%20 indirimli yeni fiyat: "+urunSayisi*fiyat*80/100);
            else System.out.println("%15 indirimli toplam fiyat: "+urunSayisi*fiyat*85/100);

        } else if (evetHayir=='H') {
            if (urunSayisi>10)System.out.println("%15 indirimli toplam fiyat: "+urunSayisi*fiyat*85/100);
            else System.out.println("%10 indirimli toplam fiyat: "+urunSayisi*fiyat*90/100);


        }else System.out.println("Hatali giris");
    }
}
