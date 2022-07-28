package chap7;

import java.util.ArrayList;
import java.util.List;

public class NonNullList<T> {
    List<T> list = new ArrayList<>();
    public void add(T item) {
        if (item == null) {
            return;
        }
        list.add(item);
    }
    public T get(int index) {
        return list.get(index);
    }
    public int size() {
        return list.size();
    }

}
