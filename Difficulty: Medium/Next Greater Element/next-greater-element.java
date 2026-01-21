class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer>nge=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++) nge.add(0);
        st.push(arr[n-1]);
        nge.set(n-1,-1);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && st.peek()<=arr[i]) st.pop();
            if(st.size()==0) nge.set(i,-1);
           else{
                nge.set(i,st.peek());
           
           }
            st.push(arr[i]);
        }
        return nge;
    }
}