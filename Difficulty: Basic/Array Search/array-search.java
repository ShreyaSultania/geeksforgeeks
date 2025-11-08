class Solution {
    public int search(int nums[], int x) {
        // code here
        int idx=-1;
    for(int i=0;i<nums.length;i++){
      if(nums[i]==x){
        idx=i;
        return idx;
      }
    }
    return idx;
    }
}
