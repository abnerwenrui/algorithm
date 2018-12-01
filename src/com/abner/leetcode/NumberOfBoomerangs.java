package com.abner.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author peiwenrui
 * @since 2018-11-30 16:26
 */
public class NumberOfBoomerangs {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{0, 0}, {1, 0}, {-1, 0}, {0, 1}, {0, -1}};

//        int[][] nums = new int[][]{{0,0},{1,0},{2,0}};
        int result = numberOfBoomerangs(nums);
        System.out.println(result);
    }

    public static int numberOfBoomerangs(int[][] points) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            map.clear();
            for (int j = 0; j < points.length; j++) {
                if (j != i) {
                    int distance = (int) Math.pow((points[j][0] - points[i][0]), 2) + (int) Math.pow((points[j][1] - points[i][1]), 2);
                    map.put(distance, map.getOrDefault(distance, 0) + 1);
                }
            }
            for (Integer value : map.values()) {
                result += value * (value - 1);
            }
        }
        return result;
    }
}
