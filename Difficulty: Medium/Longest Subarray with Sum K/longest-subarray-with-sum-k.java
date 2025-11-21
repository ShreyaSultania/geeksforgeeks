// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n=arr.length;
        int sum=0;
        int len=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            if(map.containsKey(sum-k)){
                len=Math.max(len,(i-(map.get(sum-k))));
            }
        }
        return len;
    }
}
