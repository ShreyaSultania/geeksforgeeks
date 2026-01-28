class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            ans.add(0);
        }
        Stack<Integer>st=new Stack<>();
        st.push(arr[n-1]);
        ans.set(n-1,-1);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[i]<=st.peek()) st.pop();
            if(st.size()==0){
                ans.set(i,-1);
            }
            else{
                ans.set(i,st.peek());
            }
            st.push(arr[i]);
        }
        return ans;
    }
}