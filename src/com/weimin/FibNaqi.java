package com.weimin;

import java.util.Arrays;

/**
 * 斐波那契查找
 */
public class FibNaqi {
    public static void main(String[] args) {
        int[] array = {1, 8, 10, 89, 1000, 1234};

        System.out.println(fibfind(array, 8));

    }

    // 构建一个斐波那契数列
    private static int[] fib(int length) {
        int[] array = new int[length];

        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i < length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        return array;
    }


    // fibfind
    public static int fibfind(int[] array, int findVal) {
        int low = 0;
        int high = array.length - 1;

        int k = 0;
        int mid = 0;

        int[] fib = fib(20);

        while (high > fib[k] - 1) {
            k++;
        }

        int[] temp = Arrays.copyOf(array, fib[k]);

        for (int i = high + 1; i < temp.length; i++) {
            temp[i] = array[high];
        }


        while (low <= high) {
            mid = low + fib[k - 1] - 1;
            if (findVal < temp[mid]) {
                high = mid - 1;

                k--;
            } else if (findVal > temp[mid]) {
                low = mid + 1;

                k -= 2;
            } else {
                if (mid <= high) {
                    return mid;
                } else {
                    return high;
                }
            }
        }
        return -1;
    }
}
