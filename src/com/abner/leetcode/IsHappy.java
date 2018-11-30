package com.abner.leetcode;

import java.util.HashMap;

/**
 * @author peiwenrui
 * @since 2018-11-30 10:48
 */
public class IsHappy {

    public static void main(String[] args) {
        int num = 19;

        boolean result = isHappy(num);

        System.out.println(result);
    }

    public static boolean isHappy(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        while (map.get(n) == null) {
            map.put(n,1);
            while (n > 0) {
                sum += Math.pow(n % 10, 2);
                n = n / 10;
            }
            if (sum == 1) {
                return true;
            } else {
                n = sum;
                sum = 0;
            }
        }
        return false;
    }
}
