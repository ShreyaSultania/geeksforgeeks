class Solution {
    int subarray(String s,int k){
        int i=0;
        int j=0;
        int n=s.length();
        int max=0;
        HashMap<Character,Integer>map=new HashMap<>();
        while(j<n){
            char ch=s.charAt(j);
            if(!map.containsKey(ch)) map.put(ch,1);
            else{
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }
            while(map.size()>k){
                int freq=map.get(s.charAt(i));
                if(freq==1) map.remove(s.charAt(i));
                else map.put(s.charAt(i),freq-1);
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        if(map.size()<k) return -1;
        return max;

    }
    public int longestKSubstr(String s, int k) {
        // code here    }
       return subarray(s,k);
    }
}