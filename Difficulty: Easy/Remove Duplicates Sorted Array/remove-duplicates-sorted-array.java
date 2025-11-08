class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] nums) {
        // code here
         int i=0;
        int j=i+1;
        int n=nums.length;
        while(j<n){
            if(nums[i]==nums[j]) j++;
            else{
                nums[i+1]=nums[j];
                i++;
            }
        }
        ArrayList<Integer>num=new ArrayList<>();
        for(int k=0;k<i+1;k++){
            num.add(nums[k]);
        }
        return num;
    }
}
