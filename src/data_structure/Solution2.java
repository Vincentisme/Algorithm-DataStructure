package data_structure;

public class Solution2 {
    public void rotate(int[] nums, int k) {
       if(nums==null || nums.length==1) return;
        while(k!=0){
            move(nums);
            k--;
        }
    }
    public void swag(int[] nums,int a, int b){
        int temp;
        temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void move(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            swag(nums,i,nums.length-1);
        }
    }
}