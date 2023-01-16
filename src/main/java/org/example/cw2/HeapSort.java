package org.example.cw2;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = {7, 2, 3, 5, 4, 9, 1, 6, 8};
        heapSort(array);
        System.out.println(Arrays.toString(array));

    }
    public static void heapSort(int[] array){
        //Построение кучи
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }

        //Один за другим извлекаем элементы из кучи
        for (int i = array.length - 1; i >= 0 ; i--) {
            //Перемещаем текущий корень в конец
            int tmp = array[0];
            array[0] = array[i];
            array[i] = tmp;

            //Вызываем процедуру heapify на уменьшенной куче
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int heapSize, int rootIndex){
        int largest = rootIndex; // инициализируем наибольший элемент как корень
        int leftChild = 2 * rootIndex + 1; // левый ребенок
        int rightChild = 2 * rootIndex + 2; // правый ребенок

        //если левый дочерний элемент больше корня
        if (leftChild < heapSize && array[leftChild] > array[largest]){
            largest = leftChild;
        }
        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (rightChild < heapSize && array[rightChild] > array[largest]){
            largest = rightChild;
        }
        //если самый большой элемент не корень
        if (largest != rootIndex){
            int tmp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = tmp;

            // Рекурсивно преобразуем в двоичную кчу затронутое поддерево
            heapify(array, heapSize, largest);
        }
    }
}
