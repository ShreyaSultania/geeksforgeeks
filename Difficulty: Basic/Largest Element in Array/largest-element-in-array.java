class Solution {
    public static int largest(int[] nums) {
        // code here
         int n=nums.length;
     int max=Integer.MIN_VALUE;
     for(int i=0;i<n;i++){
        if(nums[i]>max) max=nums[i];
     }
     return max;
    }
}
