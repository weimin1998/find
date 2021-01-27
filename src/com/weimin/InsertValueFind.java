package com.weimin;

import java.util.Arrays;

/**
 * 插值查找  和二分查找类似
 */
public class InsertValueFind {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i;
        }

        System.out.println(Arrays.toString(array));

        System.out.println(insertValueFind(array, 55));
    }


    public static int insertValueFind(int[] array, int findVal) {
        return insertValueFind(array, 0, array.length - 1, findVal);
    }

    private static int insertValueFind(int[] array, int left, int right, int findVal) {

        // 后面两个条件是为了防止mid越界
        if (left > right || findVal < array[0] || findVal > array[array.length - 1]) {
            return -1;
        }

        int mid = left + (right - left) * (findVal - array[left]) / (array[right] - array[left]);
        int midVal = array[mid];

        if (findVal > midVal) {
            return insertValueFind(array, mid + 1, right, findVal);
        } else if (findVal < midVal) {
            return insertValueFind(array, left, mid - 1, findVal);
        } else {
            return mid;
        }
    }
}
