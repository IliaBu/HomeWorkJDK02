package gb.jdk;

public class Calculator {

    /**
     * Складывает два числа
     * @param first первое число
     * @param second второе число
     * @param <T> тип, ограниченный Number
     * @param <V>> тип, ограниченный Number
     * @return float
     */
    public static<T extends Number, V extends Number> float sum(T first, V second) {
        return  first.floatValue() + second.floatValue();
    }

    /**
     * Перемножает два числа
     * @param first первое число
     * @param second второе число
     * @param <T> тип, ограниченный Number
     * @param <V>> тип, ограниченный Number
     * @return float
     */
    public static<T extends Number, V extends Number> float multiply(T first, V second) {
        return first.floatValue() * second.floatValue();
    }

    /**
     * Делит первое число на второе
     * @param first первое число
     * @param second второе число
     * @param <T> тип, ограниченный Number
     * @param <V>> тип, ограниченный Number
     * @return float
     */
    public static<T extends Number, V extends Number> float divide(T first, V second) {
        if (second.floatValue() == 0) {
            throw new RuntimeException("Попытка деления на ноль");
        }
        return first.floatValue() / second.floatValue();
    }

    /**
     * Вычитает второе число из первого
     * @param first первое число
     * @param second второе число
     * @param <T> тип, ограниченный Number
     * @param <V>> тип, ограниченный Number
     * @return float
     */
    public static<T extends Number, V extends Number> float subtract(T first, V second) {
        return first.floatValue() - second.floatValue();
    }

    /**
     * Сравнивает два массива на равенство, попарно сравнивая элементы
     * @param firstArray первый массив
     * @param secondArray второй массив
     * @param <T> тип элементов первого массива
     * @param <V> тип элементов второго массива
     * @return результат проверки
     */
    public static<T, V> boolean compareArrays(T[] firstArray, V[] secondArray) {
        if (firstArray.length == secondArray.length) {
            int i = 0;
            while (i < firstArray.length) {
                if (firstArray[i].getClass() != secondArray[i].getClass()) {
                    return false;
                }
                i++;
            }
        } else {
            return false;
        }
        return true;

    }
}
