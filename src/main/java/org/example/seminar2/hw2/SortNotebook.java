package org.example.seminar2.hw2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SortNotebook{
    protected static ArrayList<Notebook> priceSortNotebook(ArrayList<Notebook> array){
        NotebookPriceCompare notebookPriceCompare = new NotebookPriceCompare();
        array.sort(notebookPriceCompare);
        return array;
    }

    protected static  ArrayList<Notebook> ramSortNotebook(ArrayList<Notebook> array){
        NotebookRamCompare notebookRamCompare = new NotebookRamCompare();
        array.sort(notebookRamCompare);
        return array;
    }
    protected static ArrayList<Notebook> brandSortNotebook(ArrayList<Notebook> array){
        NotebookBrandCompare notebookBrandCompare = new NotebookBrandCompare();
        array.sort(notebookBrandCompare);
        return array;
    }
}
