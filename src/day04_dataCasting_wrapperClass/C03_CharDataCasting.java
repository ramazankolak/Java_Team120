package day04_dataCasting_wrapperClass;

public class C03_CharDataCasting {
    public static void main(String[] args) {


        /*
        char data turu ozel bir data turudur
        her ne kadar char '' icerisinde harf, sayi ozel karakter alsa da
        ascii tablosundaki sayisal degerleri de kullanabilir.

            char data turundeki bir variablei matematiksel islemde kullanirsaniz
            ascii tablosundaki degeri ile matematiksel isleme girecektir.


         */
        char ch1='a';

        int sayi1=ch1;

        System.out.println("ch1: "+ch1);//c
        System.out.println("sayi1: "+sayi1);//67

        String str1="Java";
        String str2=" ";
        String str3="Candir";

        System.out.println(str1+str2+str3); //Java Candir

        char ch2='a';
        char ch3='b';

        System.out.println(ch2+ch3);//97+98=195 goruldugu uzere ascii tablosundaki deger karsiligi

        int karakter= 97;
        char chkarakter=(char)karakter;
        System.out.println("Verilen sayinin ascii karsiliği: "+chkarakter);






    }
}
