class Solution {
    void Dfs(ArrayList<ArrayList<Integer>> adj, boolean visited[],int val,ArrayList<Integer>temp){
        visited[val]=true;
        temp.add(val);
        for(int i=0;i<adj.get(val).size();i++){
            if(!visited[adj.get(val).get(i)]){
                Dfs(adj,visited,adj.get(val).get(i),temp);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n=adj.size();
        boolean visited[]=new boolean[n];
         ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!visited[i]){
                Dfs(adj,visited,i,ans);
            }
        }
        return ans;
    }
}