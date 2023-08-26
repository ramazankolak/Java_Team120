package day45_maps;

import day44_maps.MethodDeposu;

import java.util.Map;

public class C03_Update {
    public static void main(String[] args) {


        Map<Integer,String> ogrenciMap= MethodDeposu.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        //ogrenciMap'indde TM bölümünü EA yapin

        ogrenciMap=MethodDeposu.ogrenciBolumDegistir(ogrenciMap,"TM","EA");

        System.out.println(ogrenciMap);
    }
}
