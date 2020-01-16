package org.sunrain.study.basics.array;

public class BubbleSort {

    public int[] sort(int[] array) {

        System.out.print("原始数组:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.print("第" + (i + 1) + "次排序后: ");
            for (int m = 0; m < array.length; m++) {
                System.out.print(array[m] + " ");
            }
            System.out.println();
        }
        return array;
    }
}