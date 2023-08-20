package day13_StringManipulations_ForLoop;

public class C01_Replace {
    public static void main(String[] args) {

        String str="Javayi anliyorum ama yazamiyorum";
        //Var olan bir Stringin istenilen bölümü değiştirelebilir.

        System.out.println(str.replace('J', 'T'));

        System.out.println(str.replace('a','*'));

        System.out.println(str.replace("ama yazamiyorum", "ve yazabiliyorum"));
        // Javayi anliyorum ve yazabiliyorum

        System.out.println(str.replace("Java","AA"));
        // AAyi anliyorum ama yazamiyorum


    }
}
