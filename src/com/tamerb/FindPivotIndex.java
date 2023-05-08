package com.tamerb;

import java.util.Arrays;

public class FindPivotIndex {

    public static int pivotIndex(int[] nums) {
        int len = nums.length;
        int leftSum = 0;
        int rightSum;

        int total = Arrays.stream(nums).sum();

        for (int i = 0; i < len; i++) {
            leftSum += nums[i];
            rightSum = total - leftSum + nums[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }
}
