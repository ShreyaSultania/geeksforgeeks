class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int max=0;
        int n=arr.length;
        int i=0;
        int j=0;
        
        while(j<n){
            if(arr[j]==0){
            
                i=j+1;
            }
            else if(arr[j]==1){
                max=Math.max(max,(j-i+1));
            }
            j++;
            
        }
        i=0;
        j=0;
        while(j<n){
            if(arr[j]==1){
            
                i=j+1;
            }
            else if(arr[j]==0){
                max=Math.max(max,(j-i+1));
            }
            j++;
            
        }
        return max;
    }
}
