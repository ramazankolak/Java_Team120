package day17_MethodOlusturma_MethodOverLoading;

import day16_methodOlusturma_Kullanma.C01_MethodOlusturma;
import day16_methodOlusturma_Kullanma.C03_MethodOlusturma;

public class C03_BaskaClasstanMethodKullanma {
    public static void main(String[] args) {

        C01_MethodOlusturma.altString("Method budur.....",7,8);

        System.out.println(C03_MethodOlusturma.isimDuzenle("ramazan", "kolak"));
        //Ramazan Kolak

        System.out.println(C01_AsalSayiBulma.asalSayiMi(59));//true

        System.out.println(C02_TamBolenlerSayisiniBulma.tamBolenlerSayisi(1224));//24


    }
}
