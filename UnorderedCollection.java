package com.company.stories;

import java.util.ArrayList;
import java.util.List;

public class UnorderedCollection<T> {
    private List<T> list = new ArrayList<>();
    private int size;

    public UnorderedCollection(int size) {
        this.size = size;
    }

    public void add(T t) {
        if (list.size() < size) {
            list.add(t);
        }
    }

    public void remove(T t) {
        if (list.size() > 0) {
            list.remove(t);
        }
    }

    public T get(int index) {
        return list.get(index);
    }

    public int getCurrentSize() {
        return list.size();
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (T t : list) {
            result.append(t);
        }
        return result.toString();
    }
}
