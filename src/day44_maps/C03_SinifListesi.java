package day44_maps;

import java.util.Map;

public class C03_SinifListesi {
    public static void main(String[] args) {

        //ogrenciMap'te sinif ve sube verdigimizde o sinifta bulunan ogrenci isim ve soyismini yazdirin
        Map<Integer,String> ogrenciMap=MethodDeposu.ogrenciMapOlustur();

MethodDeposu.sinifSubedekiOgrenciListesiYazdir(ogrenciMap,11,"h");
    }
}
