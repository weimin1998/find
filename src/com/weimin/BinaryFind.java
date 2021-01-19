package com.weimin;

import java.util.ArrayList;
import java.util.List;

/**
 * 二分查找 要求数组必须有序
 */
public class BinaryFind {
    public static void main(String[] args) {
        int[] array = {1,8,10,89,1000,1000,1000,1000,1234};

        int i = find(array, 88);
        System.out.println(i);

        List<Integer> list = findList(array, 1000);
        System.out.println(list);
    }

    public static  int find(int[] array,int findVal){
        return find(array,0,array.length-1,findVal);
    }


    private static  int find(int[] array,int left,int right,int findVal){


        // 当left>right
        if(left>right){
            return -1;
        }

        int mid = (left+right)/2;
        int midVal = array[mid];

        if(findVal>midVal){
            // 向右
            return find(array,mid+1,right,findVal);
        }else if(findVal<midVal){
            return find(array,left,mid-1,findVal);
        }else {
            return mid;
        }
    }




    public static  List<Integer> findList(int[] array, int findVal){
        return findList(array,0,array.length-1,findVal);
    }

    private static  List<Integer> findList(int[] array,int left,int right,int findVal){


        // 当left>right
        if(left>right){
            return new ArrayList<Integer>();
        }

        int mid = (left+right)/2;
        int midVal = array[mid];

        if(findVal>midVal){
            // 向右
            return findList(array,mid+1,right,findVal);
        }else if(findVal<midVal){
            return findList(array,left,mid-1,findVal);
        }else {

            List<Integer> list = new ArrayList<>();

            // 左
            int temp = mid -1 ;

            while (true){
                if(temp<0||array[temp]!=findVal){
                    break;
                }else {

                    list.add(temp);
                    temp-=1;
                }
            }

            list.add(mid);
            // 右

            temp = mid +1;
            while (true){
                if(temp>array.length-1||array[temp]!=findVal){
                    break;
                }else {
                    list.add(temp);
                    temp+=1;
                }
            }

            return list;
        }
    }
}
