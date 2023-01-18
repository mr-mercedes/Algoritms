package org.example.seminar2.hw2;

import java.util.Comparator;

public class NotebookRamCompare implements Comparator<Notebook> {
    @Override
    public int compare(Notebook o1, Notebook o2) {
        return Integer.compare(o1.getRAM(), o2.getRAM());
    }
}
