package com.leetcode;
public class SolutonTwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {3, 2, 4, 15};
        int target = 6;
        int[] result = twoSum(nums, target);
        
        if (result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found");
        }
		
	}

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}