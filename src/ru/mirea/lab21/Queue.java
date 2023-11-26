package ru.mirea.lab21;
public interface Queue<T> {
    // Добавляет элемент в конец очереди
    void enqueue(T item);
    // Удаляет и возвращает элемент из начала очереди
    T dequeue();
    // Возвращает элемент из начала очереди без удаления
    T peek();
    // Возвращает размер очереди
    int size();
    // Проверяет, пуста ли очередь
    boolean isEmpty();
}