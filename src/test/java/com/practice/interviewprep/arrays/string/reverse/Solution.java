package com.practice.interviewprep.arrays.string.reverse;

import java.util.Arrays;

public class Solution {
    public void reverseString(char[] s) {
        printReverse(0, s);
        System.out.print(Arrays.toString(s));
    }

    private void printReverse(int index, char[] s) {
        if (s != null && s.length <= index) {
            return;
        }
        printReverse(index + 1, s);
        swap(s, index);
    }

    private void swap(char[] s, int index) {
        if ((s.length - 1) - index > index) {
            char temp = s[index];
            s[index] = s[(s.length - 1) - index];
            s[(s.length - 1) - index] = temp;
        }
    }

    public static void main(String[] args) {
        new Solution().reverseString("hannah".toCharArray());
    }
}