package com.abner.leetcode;

/**
 * @author peiwenrui
 * @since 2018-11-29 21:43
 */
public class LengthOfLongestSubstring {

    //3. Longest Substring Without Repeating Characters
    public static void main(String[] args) {
        String s = "bbbbb";

        int max = lengthOfLongestSubstring2(s);
        System.out.println(max);
    }

    public static int lengthOfLongestSubstring2(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int max = 0;
        int[] times = new int[300];
        int start = 0, end = 0;

        while (end < s.length()) {
            if (times[s.charAt(end)] == 0) {
                if (end - start + 1 > max) {
                    max = end - start + 1;
                }
                times[s.charAt(end)] = 1;
                end++;
            }else {
                times[s.charAt(start)]=0;
                start++;
            }
        }

        return max;
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        int max = 1;
        int start = 0, end = 1;

        while (end < s.length()) {
            if (s.substring(start, end).contains(s.substring(end, end + 1))) {
                if (start < end) {
                    start++;
                } else {
                    break;
                }
            } else {
                if (end - start + 1 > max) {
                    max = end - start + 1;
                }
                end++;
            }
        }
        return max;
    }

}
