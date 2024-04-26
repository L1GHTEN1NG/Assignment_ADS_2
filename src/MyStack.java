package MyCollections.Stack;

import MyCollections.MyLinkedList.MyLinkedList;

public class MyStack<T extends Comparable<T>> {
    private MyLinkedList<T> linkedList;

    public MyStack() {
        linkedList = new MyLinkedList<>();
    }

    public boolean isEmpty(){
        return linkedList.size() == 0;
    }

    public int size(){
        return linkedList.size();
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

    public void print(){
        linkedList.print();
    }
}