package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MyArrayList myArrayList =  new MyArrayList();

        ArrayList arrayList = new ArrayList();

        //arrayList.add(5);


        myArrayList.addElement(11.5);
        myArrayList.addElement(10);
        myArrayList.addElement(9);
        myArrayList.addElement(8.7);
        myArrayList.addElement(7);
        myArrayList.addElement(6);
        System.out.println("Value of element by index 3: " + myArrayList.getElement(3));
        myArrayList.addElement(20,3);
        System.out.println("Value of element by index 3 after addding new value: " + myArrayList.getElement(3));

        System.out.println("Size of myArrayList: " + myArrayList.getSize());
        myArrayList.removeElement(3);
        System.out.println("Size of myArrayList after removing: " + myArrayList.getSize());
        System.out.println("Value of index 3  after removing: " + myArrayList.getElement(3));
        myArrayList.clear();
        System.out.println("Size of myArrayList after clear: " + myArrayList.getSize());

    }
}