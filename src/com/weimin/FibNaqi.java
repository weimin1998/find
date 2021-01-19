package com.weimin;

/**
 * 斐波那契查找
 */
public class FibNaqi {
    public static void main(String[] args) {


    }

    // 构建一个斐波那契数列
    private static int[] fib(int length){
        int[] array = new int[length];

        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i < length; i++) {
            array[i] = array[i-1]+array[i-2];
        }

        return array;
    }


    // fibfind
    public static int fibfind(int[] array,int findVal){
        return -1;
    }
}
