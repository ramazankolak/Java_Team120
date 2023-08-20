package sampleQuestions;

public class Soru9 {
    public static void main(String[] args) {

        //Soru 9-)  Girilen zamanı saniyeye çeviriniz.
        //               Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye
        //         Ipucu:
        //         Saati alıp saniyeye cevirebilirsiniz.

        int saat=2;
        int dakika=3;
        int saniye=10;

        int toplamSaniye=(saat*3600)+dakika*60+saniye;

        System.out.println("Girilen zamanın saniyeye çevrilmiş hali: "+toplamSaniye+" saniye");


    }
}
