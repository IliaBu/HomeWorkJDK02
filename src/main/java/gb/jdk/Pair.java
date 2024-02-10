package gb.jdk;

public class Pair <T,V>{

    private final T first;
    private final V second;

    /**
     * Конструктор
     * @param first
     * @param second
     */
    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Возвращает первый объект
     * @return T
     */
    public T getFirst() {
        return first;
    }

    /**
     * Возвращает второй объект
     * @return V
     */
    public V getSecond() {
        return second;
    }

    /**
     * Возвращает строковое представление объекта.
     */
    @Override
    public String toString() {
        return String.format("Первый тип: %s; второй тип: %s",
                first.getClass().getSimpleName(),
                second.getClass().getSimpleName());
    }

}
