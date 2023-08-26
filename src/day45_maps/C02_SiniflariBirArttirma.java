package day45_maps;

import day44_maps.MethodDeposu;

import java.util.Map;

public class C02_SiniflariBirArttirma {
    public static void main(String[] args) {

        /*
         ogrenciMap'inde yil sonu düzenlemesi yapalim
         9,10,11. siniftaki öğrencilerin siniflarini bir arttirin
         12. siniftaki öğrenciler için sinif bilgisi olarak mezun yazin
         */

        Map<Integer,String > ogrenciMap = MethodDeposu.ogrenciMapOlustur();
        System.out.println(ogrenciMap);
        ogrenciMap=MethodDeposu.yilSonuSinifArttir(ogrenciMap);

        System.out.println(ogrenciMap);
    }
}
