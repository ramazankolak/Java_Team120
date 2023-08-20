package day05_matematikselIslemler_Increment;

public class C01_Matematiksel_Islemler {
    public static void main(String[] args) {

        int a=27;
        int b=4;
        System.out.println(a/b);//6.75 ancak int değerler olduğu için 6

        //Java iki tam sayiyi bolerseniz size sonucu tam sayi verir.

        double c =27;

        //eğer bölünen sayıdan veya bölünenden birisi double/float ise sonucu ondalıklı verir
        System.out.println(c/b); //6.75

        //a'yi b'ye bölüp sonucu ondalıklı yazdiriniz.

        double sonuc=a/b ;//27/4=.6.75 ancak ikisi int oldugu için double variable'de bile cevap 6.

        System.out.println("Sonuc1: "+sonuc);

        double sonuc2=(double)(a/b);   //6

        System.out.println("Sonuc2: "+sonuc2);

        double sonuc3=(double)a/b; //double cast ile a'yi double yaptık ve sonuç3=6.75
        System.out.println("Sonuc3: "+sonuc3);

        System.out.println(2567/10); //256
        System.out.println(2567%10); //7 modulus islemi bölme isleminin kalanini verir.

        System.out.println(256/10);//25
        System.out.println(256%10);//6

        System.out.println(25/10);//2
        System.out.println(25%10);//5

        System.out.println(2/10);//0
        System.out.println(2%10);//2














    }
}
