package Initialization;

/**
 * создайте массив объектов String. Присвойте объект String каждому элементу.
 * выведите содержимое массива в цикле for
 */
public class TaskInitArrays16 {
    public static void main(String[] args) {
        String[] s = new String[]{
                new String("asda"),         //похоже что среда разработки игнорирует сточки new String тоесть можно и без них запонить массив
                new String("zmcm,zn"),
                new String(",xmcz"),
                "sda"
        };
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
