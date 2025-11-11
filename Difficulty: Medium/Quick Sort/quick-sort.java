class Solution {
    int partition(int nums[],int low,int high){
        int pivot=nums[low];
        int pIdx=low;
        int c=0;
        for(int i=low+1;i<=high;i++){
            if(nums[i]<=pivot) c++;
        }
        int currIdx=pIdx+c;
        // pdx -> currIdx
        int temp=nums[pIdx];
        nums[pIdx]=nums[currIdx];
        nums[currIdx]=temp;

        int i=low;
        int j=high;
        while(i<currIdx && j>currIdx){
            if(nums[i]<=pivot) i++;
            else if(nums[j]>pivot) j--;
            else {
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
                j--;
            }
        }
        return currIdx;
    }
    void sort(int nums[],int low,int high){
        if(low>=high) return;
        int idx=partition(nums,low,high);
        sort(nums,low,idx-1);
        sort(nums,idx+1,high);
    }
    public void quickSort(int[] arr, int low, int high) {
        // code here
       sort(arr,low,high);
    }  
    
}