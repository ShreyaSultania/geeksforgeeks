// // User function Template for Java

class Solution {
    public void rotate(int[] nums) {
        // code here
          int n=nums.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        i=1;
        j=n-1;
        while(i<j){
              int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}