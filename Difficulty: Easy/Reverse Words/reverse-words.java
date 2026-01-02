class Solution {
    String reverse(String sb){
        StringBuilder s=new StringBuilder(sb);
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            char temp=s.charAt(i);
            s.setCharAt(i,s.charAt(j));
            s.setCharAt(j,temp);
            i++;
            j--;
        }
        return s.toString();
    }
    public String reverseWords(String s) {
        // Code here
        String ans="";
        String temp="";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='.'){
              String t=reverse(temp);
               ans+=t;
               if (!t.isEmpty()) ans += ".";
               temp="";
            }
            else{
                temp+=ch;
            }
        }
       String t=reverse(temp);
               ans+=t;
               temp="";
            if(ans.endsWith(".")) {
            ans = ans.substring(0, ans.length() - 1);
        }
        return ans;
    }
}
