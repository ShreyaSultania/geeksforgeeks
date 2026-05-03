// User function Template for Java

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        int size=arr.length;
        int maxSum=Integer.MIN_VALUE;
        int m=-1;
        int n=-1;
        for(int i=0;i<size;i++){
            int sum=0;
            for(int j=i;j<size;j++){
                if(arr[j]<0) break;
                sum+=arr[j];
                
              if(sum>maxSum || (sum==maxSum && n-m<j-i)){
                  maxSum=sum;
                  m=i;
                  n=j;
              }
                
            }
        }
        if(m==-1 || n==-1) {
           ans.add(-1);
           return ans;
        }
        for(int i=m;i<=n;i++){
            ans.add(arr[i]);
        }
        
        return ans;
    }
}