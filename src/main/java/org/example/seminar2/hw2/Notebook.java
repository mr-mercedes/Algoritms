package org.example.seminar2.hw2;

import java.util.Objects;

public class Notebook {
    private final double PRICE;
    private final int RAM;
    private final Brand BRAND;

    public Notebook(double PRICE, int RAM, Brand BRAND) {
        this.PRICE = PRICE;
        this.RAM = RAM;
        this.BRAND = BRAND;
    }

    public double getPRICE() {
        return PRICE;
    }

    public int getRAM() {
        return RAM;
    }

    public Brand getBRAND() {
        return BRAND;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Double.compare(notebook.PRICE, PRICE) == 0 && RAM == notebook.RAM && BRAND == notebook.BRAND;
    }

    @Override
    public int hashCode() {
        return Objects.hash(PRICE, RAM, BRAND);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "PRICE=" + PRICE +
                ", RAM=" + RAM +
                ", BRAND=" + BRAND +
                '}';
    }
}
