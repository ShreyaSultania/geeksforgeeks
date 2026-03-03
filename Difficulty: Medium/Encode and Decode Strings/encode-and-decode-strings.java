class Solution {

    public String encode(String s[]) {
        // write your logic to encode the strings
        String ans="";
        for(int i=0;i<s.length;i++){
            ans=ans+s[i]+" ";
        }
        return ans;
    }
    

    public String[] decode(String s) {
        // write your logic to decode the string
        String []str=s.split(" ");
        return str;
    }
}