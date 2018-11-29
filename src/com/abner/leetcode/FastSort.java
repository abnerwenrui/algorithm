package com.abner.leetcode;

/**
 * @author peiwenrui
 * @since 2018-10-14 13:39
 */
public class FastSort {

    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] a = {12, 20, 5, 16, 15, 1, 30, 45, 23, 9};
        int start = 0;
        int end = a.length - 1;
        sort(a, start, end);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void sort(int[] a, int low, int high) {
        if (low < high) {
            int start = low;
            int end = high;
            int key = a[low];
            while (end > start) {
                //从后往前比较
                while (end > start && a[end] >= key) {
                    //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                    end--;
                }
                if (start < end) {
                    //不符合要求的归位
                    a[start++] = a[end];
                }
                //从前往后比较
                while (end > start && a[start] <= key) {
                    //如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                    start++;
                }
                if (start < end) {
                    //不符合要求的归位
                    a[end--] = a[start];
                }
            }
            a[start] = key;
            //递归
            sort(a, low, start - 1);
            sort(a, end + 1, high);
        }
    }

}