package exercise.implementing_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            this.elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

//    public boolean add(E element){}

    public boolean add(E element) {
        if (this.elements.length == this.size) {
            this.ensureCapacity(5);
        }
        this.elements[this.size++] = element;
        return true;
    }

    public void add(E element, int index) {
        if (index > this.elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (this.elements.length == size) {
            this.ensureCapacity(5);

        }
        if (this.elements[index] == null) {
            this.elements[index] = element;
            size++;
        } else {
            for (int i = this.size + 1; i >= index; i--) {
                this.elements[i] = this.elements[i--];
            }
            this.elements[index] = element;
            size++;
        }
    }

    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Error index: " + index);

        }
        E element = (E) elements[index];
        for (int i = index; i < this.size - 1; i++) {
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return element;
    }

    public int size() {
        return this.size;
    }

    public MyList<E> clone() {
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(elements,size);
        v.size = this.size;
        return v;
    }

    public boolean contains(E o) {
        return this.indexOf(o) >= 0;
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(o)) {
                return i;
            }
        }
        return index;
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = this.elements.length + minCapacity;
        this.elements = Arrays.copyOf(this.elements, newSize);
    }

    public E get(int i) {
        return (E) this.elements[i];
    }

    public void clear() {
        this.size = 0;
        for (int i = 0; i < this.elements.length; i++) {
            this.elements[i] = null;
        }
    }
}
