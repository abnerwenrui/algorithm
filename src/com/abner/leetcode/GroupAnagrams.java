package com.abner.leetcode;

import java.util.*;

/**
 * @author peiwenrui
 * @since 2018-11-30 12:39
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        String[] s = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> lists = groupAnagrams(s);

        System.out.println(lists.toString());
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toLowerCase().toCharArray();
            Arrays.sort(chars);
            if (map.get(String.valueOf(chars))==null){
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(String.valueOf(chars),list);
            }else {
                List<String> list = map.get(String.valueOf(chars));
                list.add(str);
                map.put(String.valueOf(chars),list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
