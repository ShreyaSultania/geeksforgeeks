class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        ArrayList<Integer>ans=new ArrayList<>();
        int n=arr.length;
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) q.add(i);
        }
        for(int i=0;i<n-k+1;i++){
            int j=i+k-1;
            while(!q.isEmpty() && i>q.peek()) q.remove();
            if(q.isEmpty() || j<q.peek()) ans.add(0);
            else ans.add(arr[q.peek()]);
        }
        return ans;
    }
}