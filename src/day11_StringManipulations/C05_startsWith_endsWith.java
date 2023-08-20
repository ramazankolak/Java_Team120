package day11_StringManipulations;

public class C05_startsWith_endsWith {
    public static void main(String[] args) {

        String str="Java cok guzel";

        //str Java ile mi basliyor?
        System.out.println(str.startsWith("Java"));//true
        //str J ile mi basliyor?
        System.out.println(str.startsWith("J"));//true
        //str Ja ile mi basliyor?
        System.out.println(str.startsWith("Ja"));//true
        //str Java cok guzel ile mi basliyor?
        System.out.println(str.startsWith("Java cok guzel"));//true
        System.out.println(str.startsWith(""));//(hiçlik) ile de baslar


        //5. indexten sonra c ile mi baslar?
        System.out.println(str.startsWith("c",5));//true

        //6. indexten sonrası ok ile mi baslar
        System.out.println(str.startsWith("ok",6));

        //"Java cok guzel";
        // str guzel ile mi biter?
        System.out.println(str.endsWith("guzel")); // true
        // str el ile mi biter?
        System.out.println(str.endsWith("el")); // true
        // str "" ile mi biter ?
        System.out.println(str.endsWith("")); // true
        System.out.println(str.endsWith(" ")); // false





    }
}
