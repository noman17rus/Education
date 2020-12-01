package Initialization;

/**
 * Инициализация членов класса.
 */

public class InitialValues {

    boolean t;
    byte c;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;
    void printInitValues(){
        System.out.println("Тип данных               начальное значение ");
        System.out.println("bollean "                + t );
        System.out.println("char                     [" + c + "]");
        System.out.println("short                    " + s);
        System.out.println("int                      " + i);
        System.out.println("long                     " + l);
        System.out.println("float                    " + f);
        System.out.println("dounle                   " + d);
        System.out.println("reference                " + reference);
    }

    public static void main(String[] args) {
        InitialValues iv = new InitialValues();
        iv.printInitValues();
        //вызывается метод вывода в консоль инизиализированных
        // ПРИМИТИВНЫЕ ТИПЫ ИНИЦИАЛИЗИРУЮТСЯ ПО УМОЛЧАНИЮ т.е в консоли они должны иметь значения
        //пример: int = 0
        /**
         * возможет второй вариант вызова метода
         */
        new InitialValues().printInitValues();
    }
}
