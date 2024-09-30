package com.leetcode;

import java.util.HashMap;
import java.util.Map;

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
    
    public int[] twoSumUsingMap(int[] nums, int target) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0; i<nums.length; i++)
        {
        int expectedValue=target-nums[i];
        if(map.containsKey(expectedValue) && map.get(expectedValue)!=i)
        {
           // System.out.println(map.get(expectedValue)+" "+i);
            return new int[]{i,map.get(expectedValue)};
        }
        }
        return new int[]{};
    }
}
