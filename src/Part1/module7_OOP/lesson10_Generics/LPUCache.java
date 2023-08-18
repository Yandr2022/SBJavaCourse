package Part1.module7_OOP.lesson10_Generics;

import java.util.ArrayList;
import java.util.List;

public class LPUCache<T> {

    private List<T> list;
    int size;

    public LPUCache(int size) {
        this.size = size;
        list = new ArrayList<>();
    }

    public void addElement(T element) {
        int currentSize = list.size();
        if (currentSize >= size) {
            for (int i = 0; i < currentSize - size + 1; i++) {
                list.remove(0);
            }
        }
        list.add(element);
    }

    public T getElement(int i) {
        return i >= list.size() ? null : list.get(i);
    }

    public List<T> getElements() {
        return list;
    }
}
