package com.abner.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author peiwenrui
 * @since 2018-11-29 22:53
 */
public class Intersection {

    public static void main(String[] args) {
        int[] num1 = new int[]{4,9,5};
        int[] num2 = new int[]{9,4,9,8,4};

        int[] intersection = intersection(num1, num2);
        System.out.println(Arrays.toString(intersection));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> integers = new HashSet<>();
        int start=0;
        for (Integer num : nums1) {
            integers.add(num);
        }
        for (Integer num2 : nums2) {
            if (integers.contains(num2)){
                nums2[start++] = num2;
                integers.remove(num2);
            }
        }

        int [] b = new int[start];
        for (int i = 0; i < start; i++) {
            b[i] = nums2[i];
        }
        return b;
    }
}
