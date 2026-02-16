// User function Template for Java

class Solution {
    void helper(String s, List<String>ans,int idx,String temp){
        if(idx==s.length()){
            if(temp.length()>0){
                ans.add(temp);
            }
            return;
        }
        helper(s,ans,idx+1,temp); //skip
        helper(s,ans,idx+1,temp+s.charAt(idx)); //take 
    }
    public List<String> AllPossibleStrings(String s) {
        // Code here
        List<String>ans=new ArrayList<>();
        helper(s,ans,0,"");
        Collections.sort(ans);
        return ans;
    }
}