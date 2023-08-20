package day09_NestedIfElseStatesments_Ternary;

public class C04_Ternary {
    public static void main(String[] args) {


        //input olarak verilen bir sayinin 3 ile tam bolunup bolunmedigini bulun.


        int input=20;

        //System.out.println(input % 3 == 0 ? "3 ile tam bolunuyor" : "3 ile tam bolunmuyor");
        String sonuc = input %3 == 0 ? "3 ile tam bolunuyor" : "3 ile tam bolunmuyor";

        System.out.println(input%2==0?"Çift sayi":2*input);

    }
}
