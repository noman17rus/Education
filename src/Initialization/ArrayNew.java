package Initialization;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * создание массивов оператором new
 */
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random();
        a = new int[rand.nextInt(20)];  //задаётся размер массива
        System.out.println("Длинна = " +a.length);
        System.out.println(Arrays.toString(a));
    }
}
