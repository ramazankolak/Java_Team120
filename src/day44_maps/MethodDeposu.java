package day44_maps;

import java.util.*;

public class MethodDeposu {

    public static Map<Integer,String> ogrenciMapOlustur(){

        Map<Integer,String > ogrenciMap=new TreeMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }
    public static void isimSoyisimListesiYazdir(Map<Integer,String> ogrenciMap){

        Collection<String> valueCollection =ogrenciMap.values();

        System.out.println("Sıra No İsim Soyisim");
        System.out.println("---------------------------------");
        int siraNo=1;

        for (String eachValue: valueCollection//"Ali-Can-11-H-MF"
             ) {

            String[] valueArr=eachValue.split("-");//[Ali, Can, 11, H, MF]

            System.out.println(siraNo+"- "+valueArr[0] + " " + valueArr[1]);

            siraNo++;
        }
    }
    public static void sinifSubedekiOgrenciListesiYazdir(Map<Integer,String> ogrenciMap, int sinif,String sube){

        Collection<String> valueCollection =ogrenciMap.values();

        System.out.println(sinif+". sinif "+sube +" subesindeki ogrenci listesi");
        for (String eachValue: valueCollection
             ) {

            String[] valueArr=eachValue.split("-");

            String sinifStr= sinif+"";

            if (sinifStr.equals(valueArr[2])&&valueArr[3].equalsIgnoreCase(sube)) {
                System.out.println(valueArr[0]+" "+valueArr[1]);

            }
        }
    }
    // isim , soyisim, sinif ve subelerini yazdirin
    public static void isimveSoyisimleOgrenciBilgiYazdir(Map<Integer,String >ogrenciMap,String isim,String soyisim){
        Collection<String> valueCollection=ogrenciMap.values();

        for (String eachValue:valueCollection
             ) {
            String[] valueArr =eachValue.split("-");//[Ali, Can, 11, H, MF]
            if (isim.equalsIgnoreCase(valueArr[0])&&soyisim.equalsIgnoreCase(valueArr[1])){

                System.out.println("Girdiginiz isim ve soyisimdeki ogrencinin bilgileri: "+valueArr[0]+" , "+valueArr[1]+" , "+
                        valueArr[2]+" , "+valueArr[3]);
            }

        }

    }
    public static void numaraliOgrenciListesiYazdir(Map<Integer,String> ogrenciMap){

        // butun key'leri kaydedelim
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet(); // [101, 102, 103, 104, 105, 106]

        // bir for each loop ile tum key'leri elden gecirebilirim

        for (Integer eachKey: ogrenciKeySeti
        ) {

            // her bir key
            System.out.print(eachKey + " "); // 103

            // ve o key'in isim ve soyismini yazdiralim

            String valueStr= ogrenciMap.get(eachKey); // "Ali-Can-11-H-MF"
            String[] valueArr = valueStr.split("-"); // [Ali, Can, 11, H, MF]

            System.out.println(valueArr[0] + " " + valueArr[1]);
        }
    }
    public static void numaraIleOgrenciBilgisiyazdirma(Map<Integer,String> ogrenciMap,int ogrenciNo){

        String istenenOgrenciValue = ogrenciMap.get(ogrenciNo); // "Ali-Can-11-H-MF"

        // numarasi verilen ogrencinin isim, soyisim, sinif ve subesini yazdirin

        String[] istenenOgrenciArr = istenenOgrenciValue.split("-"); // // [Ali, Can, 11, H, MF]


        System.out.println("Isim : " + istenenOgrenciArr[0]+ ", " +
                "Soyisim : " + istenenOgrenciArr[1]+ ", "+
                "Sinif : " + istenenOgrenciArr[2]+ ", "+
                "Sube : " + istenenOgrenciArr[3]);

    }
}



