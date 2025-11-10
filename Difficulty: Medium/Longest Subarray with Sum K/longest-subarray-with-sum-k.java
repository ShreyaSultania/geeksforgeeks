// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int sum=0;
        int len=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            if(map.containsKey(sum-k)){
                int idx=map.get(sum-k);
                len=Math.max(len,(i-idx));
            }
        }
        return len;
    }
}
