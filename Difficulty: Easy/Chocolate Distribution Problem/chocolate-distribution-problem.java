// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        int MinValue=Integer.MAX_VALUE;
        Collections.sort(arr);
        for(int i=0;i<=arr.size()-m;i++){
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int j=i;j<m+i;j++){
                if(max<arr.get(j)) max=arr.get(j);
                if(min>arr.get(j)) min=arr.get(j);
            }
            int diff=max-min;
            if(diff<MinValue){
                MinValue=diff;
            }
        }
        return MinValue;
    }
}