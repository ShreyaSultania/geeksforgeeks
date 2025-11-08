class Solution {
    public int getSecondLargest(int[] nums) {
        // code here
         int n=nums.length;
    int max=-1;
    int sMax=-1;
    for(int i=0;i<n;i++){
        if(nums[i]>max){
            sMax=max;
            max=nums[i];
        }
        else if(nums[i]!=max && nums[i]>sMax){
            sMax=nums[i];
        }
    }
    return sMax;
    }
}