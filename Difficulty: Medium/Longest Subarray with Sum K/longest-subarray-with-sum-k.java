// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n=arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int sum=0;
        map.put(0,-1);
        for(int i=0;i<n;i++){
            int ele = arr[i];
            sum+=ele;
            if(!map.containsKey(sum)) map.put(sum,i);
            if(map.containsKey(sum-k)) max = Math.max(max,i-map.get(sum-k));
        }
        return max;
    }
}
