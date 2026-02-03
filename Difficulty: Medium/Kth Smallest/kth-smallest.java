class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        int n=arr.length;
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
            if(pq.size()>k) pq.remove();
        }
        return pq.peek();
    }
}
