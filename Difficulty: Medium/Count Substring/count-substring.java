class Solution {
    public static int countSubstring(String s) {
        int c=0;
        int n=s.length();
        for(int i=0;i<s.length();i++){
            boolean hasA=false;
            boolean hasB=false;
            boolean hasC=false;
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(ch=='a') hasA=true;
                if(ch=='b') hasB=true;
                if(ch=='c') hasC=true;
                 if(hasA && hasB && hasC){
                     c+=(n-j);
                     break;
                 }
            }
           
        }
        return c;
    }
}
