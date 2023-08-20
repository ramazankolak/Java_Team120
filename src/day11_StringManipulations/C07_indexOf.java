package day11_StringManipulations;

public class C07_indexOf {
    public static void main(String[] args) {

        String str="Ali topu at, at ali at";

        //Ali'nin indexi kaçtır?==>0

        System.out.println(str.indexOf("Ali"));

        //at indexi nedir?===>9 Anlamli bir kelime olmasina gerek yok kelime aralarindan gordugu ilk at ı alir

        System.out.println(str.indexOf("at"));

        //op indexi nedir?===>5
        System.out.println(str.indexOf("op"));

        System.out.println(str.indexOf("a",10));//13 10. indexten itibaren a'yi aradi



    }
}
