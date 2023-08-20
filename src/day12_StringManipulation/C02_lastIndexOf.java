package day12_StringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String str="Javayi ogrenecegiz, baska yolu yok";

        //a harfinin ilk kullanim indexini yazdirin.
        System.out.println(str.indexOf("a"));

        //a harfinin son kullaniminin indexini yazdirin

        System.out.println(str.lastIndexOf("a"));//24

        //J harfinin son kullaniminin indexini yazdirin

        System.out.println(str.lastIndexOf("J"));


        //Metne bakmadan e harfinin 2 kere veya daha fazla kullanilip kullanilmadigini kontrol edin

     int ilkIndex=str.indexOf("e");
     int sonIndex=str.lastIndexOf("e");
     if (ilkIndex==sonIndex){
         System.out.println("2 kere kullanilmamis");
     } else System.out.println("2 kere veya daha fazla kullanilmis");


        // "Javayi ogrenecegiz, baska yolu yok";
        // o harfinin son index'ini yazdirin
        System.out.println(str.lastIndexOf("o")); // 32

        // o harfinin son kullanimindan bir onceki kullaniminin index'ini yazdirin
        System.out.println(str.lastIndexOf("o", 31)); // 27

        // k harfinin son kullaniminin indexini yazdiralim
        System.out.println(str.lastIndexOf('k')); // 33




     }


    }

