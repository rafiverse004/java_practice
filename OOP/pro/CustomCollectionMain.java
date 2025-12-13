/*
PROBLEM 14:
Implement a custom Collection class with iterator support:
- Implement Iterable interface
- Add basic add and remove functionality
*/

// WHAT YOU ARE LEARNING:
// Generics, Iterable, Iterator, Encapsulation, Collection Design

import java.util.Iterator;
import java.util.NoSuchElementException;

// Generic custom collection
class MyCollection<T> implements Iterable<T> {

    private Object[] data;
    private int size;

    public MyCollection() {
        data = new Object[10]; // initial capacity
        size = 0;
    }

    // Add element
    public void add(T element) {
        if (size == data.length) {
            expandCapacity();
        }
        data[size++] = element;
    }

    // Remove element by index
    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null;
    }

    // Expand internal array
    private void expandCapacity() {
        Object[] newData = new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    // Return iterator
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private int current = 0;

            @Override
            public boolean hasNext() {
                return current < size;
            }

            @SuppressWarnings("unchecked")
            @Override
            public T next() {
                if (!hasNext()) throw new NoSuchElementException();
                return (T) data[current++];
            }
        };
    }
}

// Main class comes last
public class CustomCollectionMain {

    public static void main(String[] args) {

        MyCollection<String> collection = new MyCollection<>();

        collection.add("A");
        collection.add("B");
        collection.add("C");

        // Iterate using for-each loop → Iterable implemented
        for (String s : collection) {
            System.out.println(s);
        }

        collection.remove(1); // remove "B"

        System.out.println("After removal:");
        for (String s : collection) {
            System.out.println(s);
        }
    }
}
