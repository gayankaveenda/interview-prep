package com.practice.interviewprep.arrays;

import java.util.Arrays;

public class SubarrayWithGivenSum {

    private int start = -1;
    private int end = -1;

    public SubarrayWithGivenSum(int sum, int[] arr) {
        findSubArrayWithSum(sum, arr);
    }

    public void getIndex() {
        if (start == -1)
            System.out.println(-1);
        else
            System.out.println(start + " " + end);
    }

    private void findSubArrayWithSum(int sum, int[] arr) {

        boolean isSuccessful = false;

        for (int i = 0; i < arr.length - 1; i++) {
            int total = 0;
            int[] newArray = Arrays.copyOfRange(arr, i, arr.length);

            for (int j = i; j < arr.length - 1; j++) {
                total += arr[j];

                if (total == sum) {
                    this.start = i + 1;
                    this.end = j + 1;
                    isSuccessful = true;
                    break;
                } else if (total > sum) {
                    break;
                }
            }
            if (isSuccessful) {
                break;
            }
        }
    }


    public static void main(String[] args) {
        //int[] arr1 = new int[]{1, 2, 3, 7, 5};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //new SubarrayWithGivenSum(12, arr1).getIndex();
        new SubarrayWithGivenSum(15, arr2).getIndex();
        new SubarrayWithGivenSum(2, arr2).getIndex();

        new SubarrayWithGivenSum(11, arr2).getIndex();
        new SubarrayWithGivenSum(100, arr2).getIndex();



    }

    /*
    private static void do1() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter # of test cases : ");
        int numOfTests = in.nextInt();

        System.out.print("Enter the size of the array and the sum expected " +
                "with whitespace inbetween : ");
        in.skip();
        String line = in.nextLine();
        int index = line.indexOf(" ");

        System.out.print("Enter the array elements delemetered by whitespace");


        int size = Integer.valueOf(line.substring(0, index));
        int sum = Integer.valueOf(line.substring(index + 1));

        StringTokenizer stringTokenizer = new StringTokenizer(in.nextLine(),
                " ");

        int[] numbers = new int[stringTokenizer.countTokens()];

        for (int i = 0; stringTokenizer.hasMoreTokens(); i++) {
            numbers[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        System.out.print("");
    }


     */
}
