package com.abner.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author peiwenrui
 * @since 2018-11-29 23:12
 */
public class Intersect {
    public static void main(String[] args) {
        int[] num1 = new int[]{4,9,5};
        int[] num2 = new int[]{9,4,9,8,4};

        int[] intersection = intersect(num1, num2);
        System.out.println(Arrays.toString(intersection));

    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map = new HashMap<>();
        int start=0;
        for (Integer num : nums1) {
            map.merge(num, 1, (a, b) -> a + b);
        }
        for (Integer num2 : nums2) {
            if (map.get(num2)!=null){
                nums2[start++] = num2;
                if (map.get(num2)==1){
                    map.remove(num2);
                }else {
                    map.put(num2,map.get(num2)-1);
                }

            }
        }
        int [] b = new int[start];
        System.arraycopy(nums2, 0, b, 0, start);
        return b;
    }
}
