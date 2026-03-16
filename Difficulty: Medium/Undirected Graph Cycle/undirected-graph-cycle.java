class Pair{
    int node;
    int parent;
    Pair(int node,int parent){
        this.node=node;
        this.parent=parent;
    }
}
class Solution {
    boolean cycleDetected(ArrayList<ArrayList<Integer>>adj,int v,boolean []visited){
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(v,-1));
        visited[v]=true;
        while(q.size()>0){
            Pair p=q.remove();
            int parent=p.parent;
            int node=p.node;
            for(int i=0;i<adj.get(node).size();i++){
                if(!visited[adj.get(node).get(i)]){
                    visited[adj.get(node).get(i)]=true;
                    q.add(new Pair(adj.get(node).get(i),node));
                }
                else if(adj.get(node).get(i) != parent)
                return true;
            }
        }
        return false;
    }
    public boolean isCycle(int V, int[][] edges) {
        // Code here
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
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(cycleDetected(adj,i,visited)) return true;
            }
        }
        return false;
    }
}