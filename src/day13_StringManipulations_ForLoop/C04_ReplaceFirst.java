package day13_StringManipulations_ForLoop;

public class C04_ReplaceFirst {
    public static void main(String[] args) {

        String str="Java Candir, kendisini cok seviyoruz123.";

        //sadece ilk a'yi A yapin.

        System.out.println(str = str.replaceFirst("a", "A"));//JAva Candir

        //ilk space'i iki space haline getirin

        System.out.println(str.replace(" ","  "));
        //JAva  Candir,  kendisini  cok  seviyoruz123.

        //ilk sayiyi space haline dönüştürün

        System.out.println(str.replaceFirst("\\d", " "));

        //ilk ozel karakteri * a cevirin.

        System.out.println(str.replaceFirst("\\W","*"));


    }
}
