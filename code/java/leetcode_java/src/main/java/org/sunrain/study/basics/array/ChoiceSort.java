package org.sunrain.study.basics.array;

public class ChoiceSort {

    public int[] sort(int[] array) {

        System.out.print("原始数组:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            int min = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    minIndex = j;
                    min = array[j];
                }
            }
            array[minIndex] = array[i];
            array[i] = min;

            System.out.print("第" + (i + 1) + "次排序后: ");
            for (int m = 0; m < array.length; m++) {
                System.out.print(array[m] + " ");
            }
            System.out.println();
        }
        return array;
    }
}
