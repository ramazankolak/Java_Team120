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

        String[] istenenOgrenciArr = istenenOgrenciValue.split("-"); //  [Ali, Can, 11, H, MF]


        System.out.println("Isim : " + istenenOgrenciArr[0]+ ", " +
                "Soyisim : " + istenenOgrenciArr[1]+ ", "+
                "Sinif : " + istenenOgrenciArr[2]+ ", "+
                "Sube : " + istenenOgrenciArr[3]);

    }

    public static Map<Integer, String> yilSonuSinifArttir(Map<Integer, String> ogrenciMap) {

        Set<Integer> ogrenciKeySeti =ogrenciMap.keySet();

        //for-each loop ile her bir keye it value'yu çağırıp istediğimiz updatei yapalım

        for (Integer eachKey: ogrenciKeySeti
             ) {
            String eachValue=ogrenciMap.get(eachKey);//"Ali-Can-11-H-MF"
            String[] valueArr=eachValue.split("-"); //  [Ali, Can, 11, H, MF]

            switch (valueArr[2]){
                case "9" :
                    valueArr[2]="10";
                    break;
                case "10" :
                    valueArr[2]="11";
                    break;
                case "11" :
                    valueArr[2]="12";
                    break;
                case "12" :
                    valueArr[2]="Mezun";
                    break;
            }

            String yeniValue=valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4];

            ogrenciMap.put(eachKey,yeniValue);


        }

        return ogrenciMap;
    }

    public static Map<Integer, String> ogrenciBolumDegistir(Map<Integer, String> ogrenciMap, String eskiBolum, String yeniBolum) {

/*
            update için key ve value'nun ikisine de ihtiyacımız var
            map'de bir value'yu update etmek istersek
            1- bilgiye ulasmak icin yaptigimiz gibi adim adim value'yu array'e cevirmeliyiz
                - key ile value'yu cagiririz
                - value'yu array'e ceviririz
                - array'de istedigimiz update'i yapariz
            2- bilgiye ulasmak icin parcaladigimiz value'yu yeni haliyle tekrar birlestiririz
            3- key ve yeni value'yu kullanarak, map'i update ederiz
         */
        Set<Integer> ogrenciKeySeti =ogrenciMap.keySet();
        //her bir key'e ait value'yu cagirip, update edip yeni hali ile map'e ekleyelim

        for (Integer eachKey:ogrenciKeySeti
             ) {
           String eachValue= ogrenciMap.get(eachKey);//"Ali-Can-11-H-MF"

            String[] valueArr=eachValue.split("-");//[Ali, Can, 11, H, MF]

            //artik array'de update yapabiliriz

            if (valueArr[4].equalsIgnoreCase(eskiBolum)){
                valueArr[4]=yeniBolum;

            }
            //update edilen array'i map'e value olarak koymak için birleştirelim

            String yeniValue=valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4];

            ogrenciMap.put(eachKey,yeniValue);




        }




        return ogrenciMap;
    }
}



