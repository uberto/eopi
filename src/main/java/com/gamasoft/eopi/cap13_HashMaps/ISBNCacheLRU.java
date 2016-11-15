package com.gamasoft.eopi.cap13_HashMaps;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by uberto on 15/11/16.
 */
public class ISBNCacheLRU {

    Map<String, Double> books = null;

    public ISBNCacheLRU(int capacity) {
        this.books = new LinkedHashMap<String, Double>(capacity, 2.0f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity;
            }
        };
    }

    public void insert(String isbn, double price) {
        books.put(isbn, price);
    }

    public double lookUp(String isbn) {
        return books.get(isbn);
    }
}
