package day16_methodOlusturma_Kullanma;

public class C01_MethodOlusturma {

    /*
        Soru1- Kullanicidan input olarak verilen bir String
        baslangic ve bitix indexlerine gore
        baslangic indexi dahil bitis indexi haric olacak sekilde
        aradaki harfleri yazdiran bir method olusturun

        -kullanici baslangic degeri olarak,
        bitis degerinden buyuk bir deger girerse hata mesaji verin
        -kullanici str'da olan indexlerden buyuk bir deger girerse
        hata mesaji yazdirin
     */
    public static void main(String[] args) {

       altString("Java guzeldir",3,7);
       altString("Biraz sabir lutfen",5,4);
       //Baslangic indexi bitis indexinden buyuk olamaz
        altString("Bu da mi gol degil",11,33);
        //verilen index sinirlarin disinda

        String str="Aramiz bozulmasin";
        altString(str,5,10);

    }//main method sonu

    public static void altString(String metin,int basIndex,int bitIndex){

        if (basIndex>bitIndex){
            System.out.println("Baslangic indexi bitis indexinden buyuk olamaz");
        } else if (basIndex>=metin.length()||bitIndex>=metin.length()) {
            System.out.println("verilen index sinirlarin disinda");
            
        }else{
            for (int i = basIndex; i <bitIndex ; i++) {
                System.out.print(metin.charAt(i));
                
            }

        }
        System.out.println();


    }





}//class sonu
