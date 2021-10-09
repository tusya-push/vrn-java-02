package ru.dataart.academy.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        System.out.println("Tasks for lecture 2");

        System.out.println("Longest substring length:");
        System.out.println(LongestSubstring.getLengthOfLongestSubstring("aasdfgt"));

        System.out.println("Reverse integer works:");
        System.out.println(ReverseInteger.reverse(-456));

        System.out.println("Two sums result:");
        System.out.println(Arrays.toString(TwoSums.getTwoSum(new int[]{1, 2, 3, 4, 6}, 8)));

    }

}