
class Solution {
    public static int[] count_NGE(int arr[], int indices[]) {
        // code here
        int ans[]=new int[indices.length];
        for(int i=0;i<indices.length;i++){
            int c=0;
            int idx=indices[i];
            for(int j=idx+1;j<arr.length;j++){
                if(arr[j]>arr[idx]) c++;
            }
            ans[i]=c;
            
        }
        return ans;
    }
}
