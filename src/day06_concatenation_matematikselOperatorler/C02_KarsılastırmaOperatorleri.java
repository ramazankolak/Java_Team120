package day06_concatenation_matematikselOperatorler;

public class C02_KarsılastırmaOperatorleri {
    public static void main(String[] args) {

        int a =10;

        int b =20;

        //Java'da tek = isareti karsilastirma degil atama(assignment) isaretidir.

        b=2*a;

        //Javada esitligi kontrol etmek istersek == kullaniriz.

        System.out.println(b==2*a); //20==20 true

        //assignmentta (=) eşitliğin sol tarafında matematiksel işlem olmaz
        //karşılaştırma operatörlerinde iki tarafta da olabilir.

        System.out.println(3*b >5*a); //true

        System.out.println(b>=b-a);// true

        System.out.println(a<=b-a); //true

        //Javada karşılaştırma operatörlerinde kullanılan ! boolean değerleri tersine çevirir.


        System.out.println(a<b); //true

        System.out.println(!(a<b));//false

        System.out.println(a!=b);//true









    }
}
