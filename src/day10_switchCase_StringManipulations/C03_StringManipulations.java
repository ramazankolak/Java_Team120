package day10_switchCase_StringManipulations;

public class C03_StringManipulations {
    public static void main(String[] args) {

        /*
        String manipulation,
        verilen bir String üzerinde Hazır methodlar kullanarak
        -değişiklik yapmak
        -veya verilen String üzerindeki bir bilgiyi
        almak için yaptığımız tüm işlemlerdir.
         */

        String str="Java Candir";

        //str'in ilk harfini yazdirin.

        System.out.println(str.charAt(0));

        //str'in tüm harflerini büyük yapın.

        System.out.println(str.toUpperCase());


        //str'in tüm harflerini küçük hale getirin

        str=str.toLowerCase();




    }
}
