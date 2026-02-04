class Solution {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int cost=0;
        while(pq.size()>1){
            int a=pq.peek();
            pq.remove();
            int b=pq.peek();
            pq.remove();
            int c=a+b;
            cost+=c;
            pq.add(c);
        }
        return cost;
    }
}