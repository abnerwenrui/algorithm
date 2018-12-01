package com.abner.leetcode;

import java.util.TreeSet;

/**
 * @author peiwenrui
 * @since 2018-12-01 15:46
 */
public class ContainsNearbyAlmostDuplicate {

    public static void main(String[] args) {
        int[] nums = new int[]{-2147483648,-2147483647};
        int k = 3, t = 3;

        System.out.println(containsNearbyAlmostDuplicate(nums, k, t));
        long i =1;
        long g = i<<31;
        System.out.println(g);
        long l = (long) Math.pow(2L,30);
        long m =0L;
        for (int j = 0; j < 63; j++) {
            m+= Math.pow(2,j);
        }
        System.out.println(l);
        System.out.println(m);

        System.out.println(Long.MAX_VALUE);
        System.out.println();
    }

    //    Integer i = 2147483647;
//    [0,2147483647][]
//3
//3
//            1
//            2147483647
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return false;
        }
        TreeSet<Long> treeSet = new TreeSet<>();
        for (int i = 0; i < nums.length; ++i) {
            Long temp = nums[i]+(long) t;
            System.out.println("temp--" + temp);
            System.out.println(treeSet.toString());
            Long right = treeSet.floor(temp);
            System.out.println("right"+right);
            if (right != null && right >= (long)nums[i] - t) {
                return true;
            }
            treeSet.add((long) nums[i]);
            if (i >= k) {
                treeSet.remove((long) nums[i - k]);
            }
        }
        return false;
    }
}
