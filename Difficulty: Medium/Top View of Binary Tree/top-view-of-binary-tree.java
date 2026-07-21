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
    Node node;
    int idx;
    Pair(Node node,int idx){
        this.node=node;
        this.idx=idx;
    }
}
class Solution {
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        TreeMap<Integer,Integer>map=new TreeMap<>();
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(q.size()>0){
            Pair p=q.remove();
            if(!map.containsKey(p.idx)){
                map.put(p.idx,p.node.data);
            }
            if(p.node.left!=null){
                q.add(new Pair(p.node.left,p.idx-1));
            }
            if(p.node.right!=null){
                q.add(new Pair(p.node.right,p.idx+1));
            }
        }
        for(int idx:map.keySet()){
            ans.add(map.get(idx));
        }
        return ans;
    }
}