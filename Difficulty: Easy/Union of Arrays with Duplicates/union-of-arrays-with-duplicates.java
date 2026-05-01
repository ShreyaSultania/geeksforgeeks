class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        int m=a.length;
        int n=b.length;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<m;i++){
            set.add(a[i]);
        }
        for(int i=0;i<n;i++){
            set.add(b[i]);
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(int ele:set){
            ans.add(ele);
        }
        return ans;
    }
}