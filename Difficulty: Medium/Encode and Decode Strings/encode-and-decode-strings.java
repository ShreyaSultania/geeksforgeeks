class Solution {

    public String encode(String arr[]) {
        // write your logic to encode the strings
        int n=arr.length;
        String s="";
        for(int i=0;i<n;i++){
            s=s+arr[i]+" ";
        }
        return s;
    }

    public ArrayList<String> decode(String s) {
        // write your logic to decode the string
        String arr[]=s.split(" ");
        ArrayList<String>ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}