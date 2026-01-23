class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer>ans=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++) ans.add(0);
        ans.set(0,-1);
        st.push(arr[0]);
        for(int i=1;i<n;i++){
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