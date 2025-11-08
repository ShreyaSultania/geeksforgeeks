class Solution {
    // Please change the array in-place
    public void insertionSort(int nums[]) {
        // code here
        int n=nums.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
                j--;
            }
        }
        
    }
}