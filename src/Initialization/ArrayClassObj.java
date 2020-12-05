package Initialization;

/**
 * При создании массива непримитивных объектов вы фактически создаёте массив ссылок
 * Для примера возьмём класс-обёртку Integer который является классом, а не примитивом
 */

import java.util.Arrays;
import java.util.Random;

public class ArrayClassObj {

    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        System.out.println("Длинна = " +a.length);
        for(int i = 0;  i < a.length; i++){
            a[i] = rand.nextInt(500); //автоматическая упаковка

        }
        System.out.println(Arrays.toString(a));
    }
}
