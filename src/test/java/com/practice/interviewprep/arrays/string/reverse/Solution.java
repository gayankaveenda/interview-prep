package com.practice.interviewprep.arrays.string.reverse;

import java.util.Arrays;

public class Solution {
    public void reverseString(char[] s) {
        if (s != null && s.length > 0) {
            printReverse(0, s);
            System.out.print(Arrays.toString(s));
        } else {
            System.out.print(Arrays.toString(new char[]{}));
        }
    }

    private void printReverse(int index, char[] s) {
        if (s.length <= index) {
            return;
        }
        printReverse(index + 1, s);

        if ((s.length - 1) - index > index) {
            swap(s, index);
        }
    }

    private void swap(char[] s, int index) {
        if ((s[index] != s[(s.length - 1) - index])) {
            char temp = s[index];
            s[index] = s[(s.length - 1) - index];
            s[(s.length - 1) - index] = temp;
        }
    }

    public static void main(String[] args) {
        new Solution().reverseString("hannah".toCharArray());
    }
}