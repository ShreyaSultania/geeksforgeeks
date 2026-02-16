class Solution {
    void helper(int n,String temp,ArrayList<String>ans){
        // if()
        if(temp.length()==n){
            ans.add(temp);
            return;
        }
        helper(n,temp+"0",ans);
        helper(n,temp+"1",ans);
    }
    public ArrayList<String> binstr(int n) {
        // code here
        ArrayList<String>ans=new ArrayList<>();
        helper(n,"",ans);
        return ans;
    }
}
