package Initialization;

/**
 * Явная инициализация
 */
public class InitValues2 {
    boolean bool = true;
    byte ch = 'x';
    short s = 0xff;
    int i = 999;
    long lng = 1;
    float f = 3.14f;
    double d = 3.14159;
    void printInitValues(){
        System.out.println("Тип данных               начальное значение ");
        System.out.println("bollean "                + bool);
        System.out.println("char                     [" + ch + "]");
        System.out.println("short                    " + s);
        System.out.println("int                      " + i);
        System.out.println("long                     " + lng);
        System.out.println("float                    " + f);
        System.out.println("dounle                   " + d);
    }

    public static void main(String[] args) {
        InitValues2 iv2 = new InitValues2();
        iv2.printInitValues();
        new InitValues2().printInitValues();
    }
}
