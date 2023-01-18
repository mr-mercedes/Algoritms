package org.example.seminar2.hw2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        double[] price= {100, 200, 300, 400, 500, 600, 700, 800};
        int[] ram = {4, 8, 16, 20, 24, 28, 32};
        int size = 50;
        ArrayList<Notebook> notebooks = generateNotebooks(price, ram,size);
        printNoteBooks(notebooks);
        System.out.println("\n___________________________\n");
        printNoteBooks(SortNotebook.priceSortNotebook(notebooks));
        System.out.println("\n___________________________\n");
        printNoteBooks(SortNotebook.ramSortNotebook(notebooks));
        System.out.println("\n___________________________\n");
        printNoteBooks(SortNotebook.brandSortNotebook(notebooks));

    }
    private static ArrayList<Notebook>  generateNotebooks(double[] price, int[] ram, int size) {
        Random rd = new Random();
        ArrayList<Notebook> notebooks = new ArrayList<>();
        List<Brand> brands = Arrays.asList(Brand.values());
        double randomPrice;
        int randomRam;
        Brand rabdomBrand;
        for (int i = 0; i < size; i++) {
            randomPrice = price[rd.nextInt(price.length)];
            randomRam = ram[rd.nextInt(ram.length)];
            rabdomBrand = brands.get(rd.nextInt(brands.size()));
            notebooks.add(new Notebook(randomPrice, randomRam, rabdomBrand));
        }
        return notebooks;
    }

    private static void printNoteBooks(ArrayList<Notebook> notebooks) {
        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }
    }
}
