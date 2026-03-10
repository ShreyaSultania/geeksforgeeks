class Solution {
    void bfs( ArrayList<ArrayList<Integer>>adj, boolean visited[],int val,ArrayList<Integer>temp){
        Queue<Integer>q=new LinkedList<>();
        q.add(val);
        visited[val]=true;
        while(q.size()>0){
            int size=q.size();
            for(int i=0;i<size;i++){
               int a=q.poll();
               temp.add(a);
               for(int j=0;j<adj.get(a).size();j++){
                   if(!visited[adj.get(a).get(j)]){
                       q.add(adj.get(a).get(j));
                       visited[adj.get(a).get(j)]=true;
                   } 
               }
            }
        }
        
    }
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++){
          ArrayList<Integer>temp=new ArrayList<>();
           if(!visited[i]){
               bfs(adj,visited,i,temp);
               ans.add(temp);
        }
    }
    return ans;
    }
}