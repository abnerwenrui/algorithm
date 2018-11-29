package com.abner.leetcode;

/**
 * @author peiwenrui
 * @since 2018-10-16 11:22
 */
public class MaxArea {

 //   11. Container With Most Water

    public static void main(String[] args) {

        int[] nums = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(maxArea(nums));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int result = -1;

        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            result = Math.max(result, area);
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return result;
    }

}
