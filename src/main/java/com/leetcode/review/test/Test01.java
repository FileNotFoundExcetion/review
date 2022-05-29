package com.leetcode.review.test;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        Map<List,Object> map=new HashMap<>();
        List<String> strings = Arrays.asList("a", "b");
        Object objectValue = new Object();
        map.put(strings,objectValue);
        System.out.println(map.get(strings));
    }
}
