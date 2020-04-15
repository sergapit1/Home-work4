package by.academy.homework4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<E> {
    private E[] data;

    public DataContainer(E[] data) {
        this.data = data;
    }

    public void add(E item) {
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = item;
                return;
            }
        }
        ///
        this.data = Arrays.copyOf(this.data, this.data.length + 1);
        this.data[this.data.length - 1] = item;
    }


    public E[] getData() {
        return data;
    }

    static <E> void sort(DataContainer<E> item, Comparator<E> comparator) {
        E temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < item.getData().length - 1; i++) {
                if (comparator.compare(item.getData()[i], item.getData()[i + 1]) == 0) {
                    sorted = false;

                   temp= item.getData()[i];
                    item.getData()[i] = item.getData()[i + 1];
                   item.getData()[i + 1] = temp;


                }
            }
        }
    }

    public void delete(int index) {
        for (int i = index; i < data.length - 1; i++)
            data[i] = data[i + 1];
        data = Arrays.copyOf(data, data.length - 1);
    }

    public void delete(E item) {
        int hc = -1;
        for (int i = 0; i < data.length - 1; i++)
            if (data[i].hashCode() == item.hashCode()) {
                hc = i;
            } else if (hc != -1) delete(hc);
    }
}



