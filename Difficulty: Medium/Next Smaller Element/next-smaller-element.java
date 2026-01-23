class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer>ans=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            ans.add(0);
        }
        ans.set(n-1,-1);
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && st.peek()>=arr[i]) st.pop();
            if(st.size()==0) ans.set(i,-1);
            else{
                ans.set(i,st.peek());
            }
            st.push(arr[i]);
        }
        return ans;
    }
}