package day17_MethodOlusturma_MethodOverLoading;

public class C06_WhileLoop {
    public static void main(String[] args) {


        //1den 100'e kadar olan sayilari sinirlar dahil
        //for loop ile hesaplayin
        int toplam=0;


        for (int i = 1; i <=100 ; i++) {
            toplam=toplam+i;

        }
        System.out.println("for loop ile toplam: "+toplam);

        toplam=0;
        int i =1;

        while (i<=100);{
            toplam+=i;
            i++;

        }
        System.out.println("while loop ile toplam: "+toplam);







    }
}
