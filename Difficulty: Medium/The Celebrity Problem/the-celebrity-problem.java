class Solution {
    public int celebrity(int mat[][]) {
        // code here
        Stack<Integer>st=new Stack<>();
        int n=mat.length;
        for(int i=0;i<n;i++){
            st.push(i);
        }
        while(st.size()>1){
            int a=st.pop();
            int b=st.pop();
            if(mat[a][b]==1){
                st.push(b);
            }
            else{
                st.push(a);
            }
        }
        int cele=st.peek();
        for(int i=0;i<n;i++){
            if(mat[i][cele]!=1 || mat[cele][i]!=0) return -1;
        }
        }
        return cele;
    }
}