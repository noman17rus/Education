package Initialization;

/**
 * явная инициализация статических членов (продолжение)
 */

class Cup {
    Cup (int marker){
        System.out.println("Cup(" + marker +")");
    }
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(1);
    }
    Cups (){
        System.out.println("Cups()");
    }
}

/**
 * Задание из учебника стр.172
 */
class TheTask{
    static String str;
    static {
        str = "The task";
        System.out.println(str);
    }
    static void f3(String str){
        System.out.println("f3(" + str + ")");
    }
}

/**
 * конец задания
 */


public class ExplicitStatic {

    public static void main(String[] args) {
        System.out.println("Внутри метода main ");
        //Cups.cup1.f(99); //(1)
        TheTask.f3("wear");
    }
    //static Cups cups1 = new Cups(); //2
    //static Cups cups2 = new Cups(); //2
}
