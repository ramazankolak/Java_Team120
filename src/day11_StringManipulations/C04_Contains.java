package day11_StringManipulations;

public class C04_Contains {
    public static void main(String[] args) {

        String str ="Java gün gectikce guzellesiyor";
        //str Java içeriyor mu?
        System.out.println(str.contains("Java"));//true

        //str java içeriyor mu?
        System.out.println(str.contains("java"));//false

        //str a içeriyor mu?
        System.out.println(str.contains("a"));//Cevap true kaç tane oldugunu soylemez

        // contains() aranan metnin sayisi ile ilgilenmez sadece var veya yok sonucu döndürür.




    }
}
