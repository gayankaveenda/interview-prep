package com.practice.interviewprep.Sqrt;

public class Solution {

    public int mySqrt(int x) {
        int square = 0;
        int root = 1;

        while (square < x) {
            square = root * root;

            if(square < x) {
                root++;
            }
        }
        return root - 1;
    }

    public static void main(String[] args) {
        System.out.print(new Solution().mySqrt(110));
    }
}