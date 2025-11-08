class Solution {
    public boolean isSorted(int[] nums) {
        // code here
         int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]) return false;
        }
        return true;
    }
}