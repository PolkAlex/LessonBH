package lesson07;

import java.util.*;

public class CustomList<T> implements List<T> {

    Object[] value;

    public CustomList(int size) {
        this.value = new Object[size];
    }

    public CustomList() {
        this.value = new Object[16];
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        int length = value.length;
        int count = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i] != null) {
                count++;
            }
        }

        if (count == length) {
            Object[] object1 = Arrays.copyOf(value, length*2);
            value = object1;
        }

        for (int i = 0; i < value.length; i++) {
            if (value[i] == null) {
                value[i] = t;
                return true;
            }
        }
        return  true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < value.length; i++) {
            stringBuilder.append(value[i]);
            stringBuilder.append(" ");
        }
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        int length = value.length;
        int count = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i] != null) {
                count++;
            }
        }
        if (count < index) {
            throw new IllegalArgumentException("count - " + count + " index - " + index);
        } else {
            return (T) value[index];
        }
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
