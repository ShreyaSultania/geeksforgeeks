// User function Template for Java
class Pair implements Comparable <Pair>{
    int val;
    int idx;
    Pair(int val,int idx){
        this.val=val;
        this.idx=idx;
    }
    public int compareTo(Pair p){
        return this.val-p.val;
    }
}
class Solution {
    static String isKSortedArray(int arr[], int n, int k) {
        // code here
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        PriorityQueue<Pair>pq1=new PriorityQueue<>();
        String res="";
        for(int i=0;i<n;i++){
            pq.add(new Pair(arr[i],i));
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            pq1.add(new Pair(arr[i],i));
        }
        while(pq.size()>0){
            Pair p1=pq.remove();
            Pair p2=pq1.remove();
            int idx1=p1.idx;
            int idx2=p2.idx;
            if(Math.abs(idx1-idx2)>k){
                return "No";
            }
        }
        return "Yes";
    }
}