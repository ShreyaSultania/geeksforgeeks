// User function Template for Java

class Solution {
    static int[] replaceWithRank(int arr[], int n) {
        // code here
    PriorityQueue<Integer>pq=new PriorityQueue<>();
    for(int i=0;i<n;i++){
        pq.add(arr[i]);
    }
    HashMap<Integer,Integer>map=new HashMap<>();
    int rank=1;
    while(pq.size()>0){
        int ele=pq.remove();
        if(!map.containsKey(ele)){
             map.put(ele,rank);
             rank++;
        }
       
    }
    int []ans=new int[n];
    for(int i=0;i<n;i++){
        ans[i]=map.get(arr[i]);
    }
    return ans;
    }
}
