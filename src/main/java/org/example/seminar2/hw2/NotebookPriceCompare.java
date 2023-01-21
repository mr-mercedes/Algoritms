package org.example.seminar2.hw2;

import java.util.Comparator;

public class NotebookPriceCompare implements Comparator<Notebook> {
    @Override
    public int compare(Notebook o1, Notebook o2) {
        return Double.compare(o1.getPRICE(), o2.getPRICE());
    }
}
