package com.abner.leetcode;

import java.util.HashMap;

/**
 * @author peiwenrui
 * @since 2018-11-30 12:26
 */
public class FourSumCount {

    public static void main(String[] args) {
        int[] A = new int[]{1, 2};
        int[] B = new int[]{-2, -1};
        int[] C = new int[]{-1, 2};
        int[] D = new int[]{0, 2};

        int count = fourSumCount(A, B, C, D);
        System.out.println(count);
    }

    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : A) {
            for (int b : B) {
                map.put(a + b, map.getOrDefault(a + b, 0) + 1);
            }
        }
        int times = 0;
        for (int c : C) {
            for (int d : D) {
                int part2 = c + d;
                times += map.getOrDefault(-part2, 0);
            }
        }
        return times;
    }
}
