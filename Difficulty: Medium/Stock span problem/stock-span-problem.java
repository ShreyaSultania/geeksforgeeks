class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(i,1);
        }
        Stack<Integer>st=new Stack<>();
        st.push(0);
        for(int i=1;i<n;i++){
            while(st.size()>0 && arr[i]>=arr[st.peek()]) st.pop();
            if(st.size()==0) ans.set(i,i+1);
            else{
                ans.set(i,i-st.peek());
            }
            st.push(i);
        }
        return ans;
    }
}