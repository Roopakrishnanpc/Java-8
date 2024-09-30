package com.leetcode;

import java.util.Arrays;

public class SolutionMedianOfTwoArrays {
public static void main(String[] args) {

	int[] nums1 = {1, 3};
    int[] nums2 = {2};
    System.out.println(findMedianSortedArraysJUST1MILLISECOND(nums1, nums2)); // Output: 2.0

    int[] nums1b = {1, 2};
    int[] nums2b = {3, 4};
    System.out.println(findMedianSortedArraysJust5MS(nums1b, nums2b)); // Output: 2.5
	
}
public static double findMedianSortedArraysJust5MS(int[] nums1, int[] nums2) {
    int nums3[]=new int[nums1.length+ nums2.length];
    //int nums3[] = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2))
    //.toArray(); -> 11MS
    System.arraycopy(nums1,0,nums3,0,nums1.length);
    System.arraycopy(nums2,0,nums3,nums1.length,nums2.length);
    Arrays.sort(nums3);
    
    int length=nums3.length;
    if(length%2==0)
        return (nums3[length / 2 - 1] + nums3[length / 2]) / 2.0;
    else
        return nums3[length/2];
}

public static double findMedianSortedArraysJUST1MILLISECOND(int[] nums1, int[] nums2) {
    int n = nums1.length;

    int m = nums2.length;

    int i = 0, j = 0, m1 = 0, m2 = 0;

    // Find median.

    for (int count = 0; count <= (n + m) / 2; count++) {

        m2 = m1;

        if (i != n && j != m) {

            if (nums1[i] > nums2[j]) {

                m1 = nums2[j++];

            } else {

                m1 = nums1[i++];

            }

        } else if (i < n) {

            m1 = nums1[i++];

        } else {

            m1 = nums2[j++];

        }

    }

    // Check if the sum of n and m is odd.

    if ((n + m) % 2 == 1) {

        return (double) m1;

    } else {

        double ans = (double) m1 + (double) m2;

        return ans / 2.0;
        
   /* int m=nums1.length;
    int n=nums2.length;
 //   int num3[]= m+n;
    int num3[]=new int[m+n];
    int j=0;
    for(int i=0;i<m;i++)
        {
        num3[j++]=nums1[i];
        }
    for(int i=0;i<n;i++)
        {
        num3[j++]=nums2[i];
        }
    Arrays.sort(num3);
    System.out.print(num3);
    int total=num3.length;
    if(total%2 == 1)
        {
        return (double) num3[(total/2)];
        }
    else
        {
        
int M1= num3[total/2 -1];
        int M2= num3[total/2];
        return (double) (M1+M2)/2;
        }
    
   // return 1;*/
        
    }
    }
}

