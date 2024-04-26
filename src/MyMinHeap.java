package MyCollections.MinHeap;

import MyCollections.ArrayList.MyArrayList;
import MyCollections.MyList;

public class MyMinHeap<T extends Comparable<T>> {
    public MyList<T> heap;

    public MyMinHeap() {
        heap = new MyArrayList<>();
    }

    public void insert(T item) {
        heap.addLast(item);
    }

    public boolean isEmpty() {
        return heap.size() == 0;
    }

    public int size() {
        return heap.size();
    }

    public T extractMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        T min = heap.get(0);
        T last = heap.get(heap.size() - 1);
        heap.set(0, last);
        heap.remove(heap.size() - 1);
        return min;
    }

    public T peekMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap.get(0);
    }
}