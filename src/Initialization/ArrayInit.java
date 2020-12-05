package Initialization;

import java.util.Arrays;

/**
 * Массивы так же можно инициализировать списком в фигруных скобках
 */
public class ArrayInit {

    public static void main(String[] args) {
        Integer[] a = {
                new Integer(1),
                new Integer(2),
                new Integer(3),
                4
        };
        Integer[] b = new Integer[] {
                new Integer(1),
                new Integer(2),
                3
        };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
