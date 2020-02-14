package data_structure;

import java.util.Arrays;

public class Solution4 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
//    	System.arraycopy(nums2, 0, nums1, m, n);
//    	Arrays.sort(nums1);
    	int p1 = m-1;
    	int p2 = n-1;
    	int last = m+n-1;
    	while(p1>=0 && p2>=0) {
    		nums1[last--] = nums1[p1]<nums2[p2] ?  nums2[p2--]: nums1[p1--];
    	}
    	System.arraycopy(nums2, 0, nums1, 0, p2+1);
    	
    }
}
