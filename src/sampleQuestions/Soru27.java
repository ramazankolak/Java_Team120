package sampleQuestions;

public class Soru27 {
    public static void main(String[] args) {
        //Soru 27-) 'a' ile 'z' arasındaki karakterlerin ASCII değerlerini yazdıran bir Java programı yazın
        //ipucu: For Loop ve Char kullanarak çözebilirsiniz.
        //örnek:
        //Ascii value of a = 97
        //Ascii value of b = 98
        //Ascii value of c = 99
        //Ascii value of d = 100

        char ilkHarf='a';
        char sonHarf='z';

        for (int i = ilkHarf; i <=sonHarf ; i++) {

            System.out.println((char)i+" = "+i);

        }

    }
}
