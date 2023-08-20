package day11_StringManipulations;

public class C03_Substring {
    public static void main(String[] args) {

        String str="Java Candir";

        /*
        substring() bize verilen bir String'in istenilen parcasini alma imkani saglar.
        2 turlu kelime kullanimi vardir.

        1-Baslangic indexini verirseniz sona kadar olan kismi verir.
        2-Baslangic ve bitis indexini verirseniz
        baslangic indexinden (dahil) baslar
        bitis indexine kadar(haric) aradaki karakterleri yazdirir.
         */

        System.out.println(str.substring(3));//a Candir
        System.out.println(str.substring(7));//ndir
        System.out.println(str.substring(0));//Java Candir

        //Kendisinden fazla bir index verilemez. Out of range

        System.out.println(str.substring(3,6));//Satirin anlami 3. indexten başla 6.indexe kadar yazdir demek.===>a C
        System.out.println(str.substring(5,10));//Candi
        System.out.println(str.substring(1,2));//a bu yazilim charAt() benzer ama arti yönleri vardir.

        //6. indexteki harfi büyük olarak yazdirin

        System.out.println(str.substring(6,7).toUpperCase());//A

        System.out.println(str.substring(3,3));//hiçlik ""yazdirir

        //Geriye dogru gitmez Orn:(8,5)

        //Son 3 harfi yazdirin

        System.out.println(str.substring(str.length()-3));//dir


        String str1="Java";
        String str2=" ";
        String str3="Candir";
        System.out.println(str1+str2+str3);//Java Candir

        System.out.println(str1.concat(str2).concat(str3));//Java Candir










    }
}
