package com.gamasoft.eopi.cap6_Arrays;

/**
 * Created by uberto on 02/11/16.
 */
public class CircularQueue<T> {

    private final T[] buffer;
    private int head;
    private int tail;

    public CircularQueue(int size){
        buffer = (T[]) new Object[size];
        head = 0;
        tail = 0;
    }

    public void enqueue(T i) {
        buffer[head] = i;
        head++;
        head %= buffer.length;
        if (head == tail)
            throw new RuntimeException("buffer size limit!");
    }

    public T deque() {
        T r = buffer[tail];
        tail++;
        tail %= buffer.length;
        if (head == tail)
            throw new RuntimeException("buffer size limit!");
        return r;
    }
}
