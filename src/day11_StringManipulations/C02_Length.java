package day11_StringManipulations;

public class C02_Length {
    public static void main(String[] args) {

        String isim="Ramazan Uzunkavaklaraltindayataruyumazoglu";

        //son harfi yazdirin.
        System.out.println("isim uzunlugu: "+isim.length());//42

        System.out.println("son harf: "+isim.charAt(isim.length()-1));

        System.out.println(isim.charAt(isim.length()-5));

        //Kullanicidan ismini alin
        // ve ortadaki harfi yazdirin.
        // Eğer çift ise ortadaki iki harfi yazdirin

        System.out.println("===========================================");

        String kullanici="Ramazan Kolaka"; //toplam uzunluk cift sayiysa

        System.out.println("Ortadaki harfler: "+kullanici.charAt(kullanici.length()/2-1)+kullanici.charAt(kullanici.length()/2));
     String kullanicitek="Ramazan Kolak";//toplam uzunluk tek sayiysa
        System.out.println(kullanicitek.charAt(kullanicitek.length()/2));
    }
}
