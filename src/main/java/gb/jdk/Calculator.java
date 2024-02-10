package gb.jdk;

public class Calculator {

    /**
     * Складывает два числа
     * @param first первое число
     * @param second второе число
     * @param <T> тип, ограниченный Number
     * @param <V>> тип, ограниченный Number
     * @return double
     */
    public static<T extends Number, V extends Number> double sum(T first, V second) {
        return  first.doubleValue() + second.doubleValue();
    }

    /**
     * Перемножает два числа
     * @param first первое число
     * @param second второе число
     * @param <T> тип, ограниченный Number
     * @param <V>> тип, ограниченный Number
     * @return double
     */
    public static<T extends Number, V extends Number> double multiply(T first, V second) {
        return first.doubleValue() * second.doubleValue();
    }

    /**
     * Делит первое число на второе
     * @param first первое число
     * @param second второе число
     * @param <T> тип, ограниченный Number
     * @param <V>> тип, ограниченный Number
     * @return double
     */
    public static<T extends Number, V extends Number> double divide(T first, V second) {
        if (second.doubleValue() == 0) {
            throw new RuntimeException("Попытка деления на ноль");
        }
        return first.doubleValue() / second.doubleValue();
    }

    /**
     * Вычитает второе число из первого
     * @param first первое число
     * @param second второе число
     * @param <T> тип, ограниченный Number
     * @param <V>> тип, ограниченный Number
     * @return double
     */
    public static<T extends Number, V extends Number> double subtract(T first, V second) {
        return first.doubleValue() - second.doubleValue();
    }

}
