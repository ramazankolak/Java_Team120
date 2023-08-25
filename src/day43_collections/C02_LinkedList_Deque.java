package day43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList_Deque {
    public static void main(String[] args) {

        Deque<String > isimler=new LinkedList<>();

        /*
         deque= double ended queue demektir. Çift başlı kuyruk
         iki bastan da islem yapıldığı için pek çok methodun first ve last seklinde 2 versionu olur
         */


        isimler.add("Cemil"); //list'teki add gibidir en sona ekler

        isimler.addFirst("Resul");//[Resul, Cemil]
        isimler.addLast("Mehmet");//[Resul, Cemil, Mehmet]
        isimler.addLast("Resul");
        isimler.add("Eyup");
        isimler.add("Kaan");//[Resul, Cemil, Mehmet, Resul, Eyup, Kaan]

        isimler.removeLast();//Kaan
        //[Resul, Cemil, Mehmet, Resul, Eyup,] (Kaan'ı getirdi ve listeden sildi)

        System.out.println(isimler.removeLastOccurrence("Resul"));//true ve resul silindi

        System.out.println(isimler.removeLastOccurrence("Hilal"));//false

        System.out.println(isimler.pollFirst());// Resul ve [Cemil, Mehmet, Eyup] ilk elementi getirdi ve sildi

        System.out.println(isimler.pop());//Cemil ve[Mehmet, Eyup] üstteki ile aradaki fark ise eğer bu liste boşsa
        // pop exception fırlatır

        System.out.println(isimler.offerFirst("Bugra"));// true ve [Bugra, Mehmet, Eyup]

        System.out.println(isimler.peekFirst());// Bugra
        System.out.println(isimler.element());// Bugra peekfirst ile farkı eğer liste boşsa element exeption fırlatır.

        System.out.println(isimler.hashCode());//210406629

        isimler.clear();
        System.out.println(isimler.hashCode());//1

        isimler.add("Kahraman");
        System.out.println(isimler.hashCode());//841010808


        System.out.println(isimler);
    }
}
