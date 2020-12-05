package Initialization;

/**
 * инициализация массивов
 */
public class ArraysOfprimitives {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5,7,8,9};
        int[] a2;
        a2 = a1;
        for (int i = 0; i < a2.length-1; i ++){
            a2[i] = a2[i+1];
        }
        for (int i = 0; i < a1.length-1; i ++){
            System.out.println("a1 [" + i + "] = " +a1[i]);
        }
    }
}
