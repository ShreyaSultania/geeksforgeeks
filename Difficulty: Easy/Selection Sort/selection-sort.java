class Solution {
    void selectionSort(int[] nums) {
         int n=nums.length;
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            int idx=-1;
            for(int j=i;j<n;j++){
                if(nums[j]<min){
                    min=nums[j];
                    idx=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[idx];
            nums[idx]=temp;
        }
    }
}
























