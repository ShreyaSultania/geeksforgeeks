// User function Template for Java
class Solution {
    void removeChar(StringBuilder s,char c,int i){
        if(s.length()==i) return;
        if(s.charAt(i)==c){
            s.deleteCharAt(i);
            i--;
        }
        removeChar(s,c,i+1);
    }
    // Function to remove all occurrences of the character from the string
    public void removeCharacter(StringBuilder s, char c) {
        // code here
        removeChar(s,c,0);
    }
}