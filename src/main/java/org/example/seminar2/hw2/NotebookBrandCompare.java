package org.example.seminar2.hw2;

import java.util.Comparator;

public class NotebookBrandCompare implements Comparator<Notebook> {
    @Override
    public int compare(Notebook o1, Notebook o2) {
        return o1.getBRAND().compareTo(o2.getBRAND());
    }
}
