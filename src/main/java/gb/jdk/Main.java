package gb.jdk;

import java.util.Arrays;

public class Main {

//    01. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
//    Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
//    Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые, и false в противном случае.
//    Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа.

//    02. Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
//    Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
//    а также переопределение метода toString(), возвращающее строковое представление пары.


    public static void main(String[] args) {

        //Task01
        int a = 7;
        float b = 9;
        System.out.printf("Сумма чисел %d и %.2f = %.2f\n", a, b, Calculator.sum(a, b));
        System.out.printf("Произведение чисел %d и %.2f = %.2f\n", a, b, Calculator.multiply(a, b));
        System.out.printf("Частное от деления числа %d на %.2f = %.2f\n", a, b, Calculator.divide(a, b));
        System.out.printf("Разность чисел %d и %.2f = %.2f\n", a, b, Calculator.subtract(a, b));
        System.out.println(" ");

        System.out.println("Проверяем одинаковые массивы:");
        Object[] array1 = new Object[]{5, 8, 2, 9f};
        Object[] array2 = new Object[]{3, 6, 7, 9f};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        if (Calculator.compareArrays(array1, array2))
            System.out.println("Массивы имеют одинаковый тип данных");
        System.out.println(" ");

        System.out.println("Проверяем неодинаковые массивы:");
        Object[] array3 = new Object[]{0, 5, 2f, 7f};
        Object[] array4 = new Object[]{0, 5, 2, 7f};
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
        if (!Calculator.compareArrays(array3, array4))
            System.out.println("Массивы имеют неодинаковый тип данных");
        System.out.println(" ");

        //Task02
        System.out.println("Обобщения: ");
        Pair<Integer, String> pair = new Pair<>(2, "9");
        Pair<Double, String> pair1 = new Pair<>(5.5, "7");
        Pair<Integer, Float> pair2 = new Pair<>(1, 2f);

        System.out.println(pair);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        System.out.println(pair1);
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());

        System.out.println(pair2);
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
    }
}