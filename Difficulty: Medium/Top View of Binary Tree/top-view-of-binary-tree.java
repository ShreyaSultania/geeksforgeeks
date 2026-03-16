/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Pair{
    int idx;
    Node val;
    Pair(Node val,int idx){
        this.val=val;
        this.idx=idx;
    }
}
class Solution {
    ArrayList<Integer>ans;
    void bfs(Node root){
        TreeMap<Integer,Node>map=new TreeMap<>();
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(q.size()>0){
            Pair p=q.poll();
            if(!map.containsKey(p.idx)) map.put(p.idx,p.val);
            if(p.val.left!=null){
                q.add(new Pair(p.val.left,p.idx-1));
            }
            if(p.val.right!=null){
                q.add(new Pair(p.val.right,p.idx+1));
            }
        }
        for(int ele:map.keySet()){
            ans.add(map.get(ele).data);
        }
    }
    public ArrayList<Integer> topView(Node root) {
        // code here
        ans=new ArrayList<>();
        bfs(root);
        return ans;
    }
}