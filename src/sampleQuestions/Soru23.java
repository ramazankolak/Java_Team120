package sampleQuestions;

public class Soru23 {
    public static void main(String[] args) {
        //Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın.
        // Method bize çıktıyı döndürsün.
        //Örnek:
        //Girdi: 6
        //Çıktı: 6!=65432*1=720
        //ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.
        System.out.println(faktoriyelHesapla(6));

    }

    public static int faktoriyelHesapla(int sayi) {
        int toplam = 1;
        for (int i = 1; i <= sayi; i++) {
            toplam *= i;

        }
        return toplam;
    }
}
