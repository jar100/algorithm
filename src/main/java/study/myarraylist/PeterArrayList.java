package study.myarraylist;

import java.util.Arrays;

public class PeterArrayList<E> implements DynamicArrayADT<E> {

    private Object[] element;


    public PeterArrayList() {
        this.element = new Object[1];
    }

    public PeterArrayList(int a) {
        this.element = new Object[a];
    }

    @Override
    public int size() {
        return element.length;
    }

    @Override
    public void set(int index, E value) {
        if (index >= element.length) {
            Object newList[] = new Object[index+1];

            for (int i = 0; i < element.length; i++) {
                newList[i] = element[i];
            }
            this.element = newList;
        }
        element[index] = value;

    }
// 시간복잡도, 공간복잡도

    @Override
    public E get(int index) {
        if (index > element.length) {
            throw new IllegalArgumentException("크기를 초과했다.!");
        }
        return (E) element[index];
    }

    @Override
    public E remove(int index) {
        if (index > element.length) {
            throw new IllegalArgumentException("크기를 초과했다.!");
        }
        E result = (E) element[index];

        Object newList[] = new Object[element.length - 1];
        for (int i = 0; i < newList.length; i++) {
            if(i < index) {
                newList[i] = element[i];
            }
            if (i >= index) {
                newList[i] = element[i+1];
            }
        }
        element = newList;
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(element);
    }
}
