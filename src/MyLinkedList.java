package MyCollections.MyLinkedList;

import MyCollections.MyList;

public class MyLinkedList<T extends Comparable<T>> implements MyList<T>{
    private MyNode<T> head;
    private MyNode<T> tail;

    private int size;

    public void add(int index, T item) {
        if (index == 0) {
            addFirst(item);
        }
        else if (index == size) {
            addLast(item);
        }
        else {
            MyNode<T> nodeToInsert = new MyNode<>(item);
            MyNode<T> currentNode = head;

            for (int i = 0; i < index; i++) {
                currentNode = currentNode.getNext();
            }

            MyNode<T> prevNode = currentNode.getPrev();

            prevNode.setNext(nodeToInsert);
            nodeToInsert.setPrev(prevNode);

            nodeToInsert.setNext(currentNode);
            currentNode.setPrev(nodeToInsert);

            size++;
        }
    }

    public void addFont(T item) {
        MyNode<T> node = new MyNode<>(item);
        if(head == null){
            head = node;
            tail = node;
        }
        else {
            MyNode<T> prevHead = head;
            node.setNext(prevHead);
            head.setPrev(node);
            head = head.getPrev();
        }
        size++;
    }

    public void addLast(T item) {
        if(head == null){
            addFirst(item);
        }
        else{
            MyNode<T> nodeToInsert = new MyNode<>(item);
            tail.setNext(nodeToInsert);
            nodeToInsert.setPrev(tail);
            tail = nodeToInsert;
            size++;
        }

    }

    public T get(int index) {
        checkIndex(index);
        MyNode<T> node = head;
        for(int i=0;i<index;i++){
            node = node.getNext();
        }
        return node.getValue();
    }

    public T getFont() {
        checkIndex(0);
        return head.getValue();
    }

    public T getLast() {
        checkIndex(size-1);
        return tail.getValue();
    }

    public void remove(int index) {
        checkIndex(index);
        MyNode<T> node = head;
        for(int i=0;i<index;i++){
            node = node.getNext();
        }
        MyNode<T> prevNode = node.getPrev();
        MyNode<T> nextNode = node.getNext();
        node.setNext(null);
        node.setPrev(null);
        prevNode.setNext(nextNode);
        nextNode.setPrev(prevNode);
        size--;
    }

    public void removeFont() {
        checkIndex(0);
        head = head.getNext();
        head.setPrev(null);
        size--;
    }

    public void removeLast() {
        checkIndex(size-1);
        MyNode<T> prevNode = tail.getPrev();
        tail.setPrev(null);
        if(prevNode != null) {
            prevNode.setNext(null);
        } else{
            head = null;
        }
        tail = prevNode;
        size--;
    }

    public void print(){
        MyNode<T> node = head;
        while(node != null){
            System.out.printf("%s ", node.getValue());
            node = node.getNext();
        }
        System.out.println();
    }
}
