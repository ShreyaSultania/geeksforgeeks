class Solution {
    public static void print_divisors(int n) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0) {
                ans.add(i);
                if(i!=n/i){
                   ans.add(n/i);
               }
            }
        }
        
        Collections.sort(ans);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}

