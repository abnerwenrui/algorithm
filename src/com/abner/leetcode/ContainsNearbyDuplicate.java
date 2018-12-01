package com.abner.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author peiwenrui
 * @since 2018-11-30 18:43
 */
public class ContainsNearbyDuplicate {
    public static void main(String[] args) {
        int[] a = {1};
        int k = 1;
        boolean containsNearbyDuplicate = containsNearbyDuplicate(a, k);
        System.out.println(containsNearbyDuplicate);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                return Boolean.TRUE;
            }
            map.put(nums[i], 1);
            if (map.size() == k + 1) {
                map.remove(nums[i - k]);
            }
        }
        return Boolean.FALSE;

    }

}
