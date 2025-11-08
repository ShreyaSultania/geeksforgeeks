class Solution {
    public static ArrayList<Integer> findUnion(int nums1[], int nums2[]) {
        // code here
        int m=nums1.length;
        int n=nums2.length;
        int i=0;
        int j=0;
        ArrayList<Integer>ans=new ArrayList<>();
        while(i<m && j<n){
            if(i>0 && nums1[i]==nums1[i-1]) i++;
            else if(j>0 && nums2[j]==nums2[j-1]) j++;
            else if(nums1[i]==nums2[j]){
                ans.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                ans.add(nums1[i]);
                i++;
            }
            else if(nums1[i]>nums2[j]){
                ans.add(nums2[j]);
                j++;
            }
        }
        while(i<m){
            if(i>0 && nums1[i]==nums1[i-1]) i++;
            else {
                ans.add(nums1[i]);
                i++;
            }
        }
        while(j<n){
             if(j>0 && nums2[j]==nums2[j-1]) j++;
             else{
                ans.add(nums2[j]);
                j++;
             }
        }
       
        return ans;
    }
}
