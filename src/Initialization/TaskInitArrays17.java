package Initialization;

import java.util.Arrays;

/**
 * Создайте класс с конструктором, получающим аргумент String. Выведите значение
 * аргумента во время коструирования. Создайте Массив ссылок на этот класс, но не создаватйе объекты,
 * которыми заполняется массив. Запустите программу и посмотрите будут ли выводиться сообщения о вызове
 * конструкторов
 */

public class TaskInitArrays17 {
    public static void main(String[] args) {


        ClassWithConstructor c1 = new ClassWithConstructor("hello");
        ClassWithConstructor c2 = new ClassWithConstructor("world");
        ClassWithConstructor c3 = new ClassWithConstructor("java");

        ClassWithConstructor[] s = {c1,c2,c3};
        for (int i = 0; i < s.length; i++){
            System.out.println(Arrays.toString(s));
        }
    }

}

class ClassWithConstructor {
    ClassWithConstructor (String s) {
        System.out.println("Значение аргумента внутри конструктора = " + s);
    }
}
