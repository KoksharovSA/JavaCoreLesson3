package ru.gb;

import java.util.Iterator;

public class CollectionEmployee<Employee> implements Iterable<Employee> {

    private Employee[] arrayList;
    private int currentSize;

    public CollectionEmployee(Employee[] newArray) {
        this.arrayList = newArray;
        this.currentSize = arrayList.length;
    }

    @Override
    public Iterator<Employee> iterator() {
        Iterator<Employee> it = new Iterator<Employee>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < currentSize && arrayList[currentIndex] != null;
            }

            @Override
            public Employee next() {
                return arrayList[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}
