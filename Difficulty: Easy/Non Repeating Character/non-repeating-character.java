class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        HashMap<Character,Integer>map=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }
        }
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int freq=map.get(ch);
            if(freq==1){
                return ch;
            }
        }
        return '$';
    }
}
