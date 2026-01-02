class Solution {
    public static int minCost(int[] arr) {
        // code here
        int cost=0;
     PriorityQueue<Integer>q=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
        }
        if(q.size()==1) return 0;
        while(q.size()>1){
           int a=q.poll();
           int b=q.poll();
            cost+=(a+b);
            q.add(a+b);
        }
        return cost;
    }
}