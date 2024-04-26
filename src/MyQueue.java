package MyCollections.Queue;

import MyCollections.MyLinkedList.MyLinkedList;
import MyCollections.MyList;

public class MyQueue<T extends Comparable<T>>{
    public MyLinkedList<T> linkedList;

    public MyQueue(){
        linkedList = new MyLinkedList<>();
    }

    public T push(T newItem){
        linkedList.addFont(newItem);

        return(newItem);
    }

    public T peek(){

        return linkedList.get(0);
    }

    public T pop(){
        T removingItem = peek();

        linkedList.removeFont();

        return removingItem;
    }

    public int size(){
        return linkedList.size();
    }

    public boolean isEmpty(){
        return linkedList.size() == 0;
    }

    public void print(){
        linkedList.print();
    }
}