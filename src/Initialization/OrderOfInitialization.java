package Initialization;

/**
 * Демонстрация порядка инициализации
 */
//При вызове конструктора для создания объекта window выводится сообщение:

    class Window {
        Window(int marker){
            System.out.println("Window (" + marker + ")");
        }
}

class House {
        Window w1 = new Window(1); //инициализация объекта перед конструктором
    House(){
        System.out.println("House()"); //на экран выводится уведомление что выполнился конструктор Home
        w3 = new Window(33); //повторная инициализяция w3
    }
    Window w2 = new Window(2); //инициализация объекта после конструктора
    void f(){
        System.out.println("f()");
    }
    Window w3 = new Window(3); //инициализаиця в конце
}


public class OrderOfInitialization {

    public static void main(String[] args) {
        House h = new House();

        /**
         * в окно консоли должно быть инициализированно 3 обьекта класса Window w1 w2 w3.
         * Сначала объявляются обхъекты внутри класса затем объект в конструкторе
         */
        h.f();
    }

}
