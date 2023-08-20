package day11_StringManipulations;

public class C01_CharAt {
    public static void main(String[] args) {

        String str="Java Candir";

        //İlk harfi yazdirin.

        System.out.println(str.charAt(0));//J

        //7. harfi yazdirin.

        System.out.println(str.charAt(6));//a

        //Bu metnin uzunlugu 11 son harfi yazdirin.

        System.out.println(str.charAt(11-1));//r

        //Sondan 3. harfi yazdirin.

        System.out.println(str.charAt(11-3));//d

        //Metnin uzunlugundan daha buyuk bir karakter istenirse

        //System.out.println(str.charAt(20));//StringIndexOutofBoundsException Sınırların disinda.

        //4. harfi büyük harf olarak yazdirin.

        System.out.println(str.toUpperCase().charAt(3));
        /*
        charAt() bize char data türünde bir sonuç döndürür.
        toUpperCase() gibi methodlar String variablelar ile calistigi icin
        charAt() gibi String Manipulations yapılamaz.
        Ihtiyac varsa charAt()kullanilmadan yapilmalidir
         */



    }
}
