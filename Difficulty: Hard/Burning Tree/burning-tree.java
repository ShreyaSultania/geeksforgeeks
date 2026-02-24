/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    HashSet<Node>set=new HashSet<>();
    int time=0;
    void helper(HashMap<Node,Node>map,Node target){
        set.add(target);
        Queue<Node>q=new LinkedList<>();
        q.add(target);
        while(q.size()>0){
            boolean burn=false;
            int size=q.size();
            for(int i=0;i<size;i++){
                Node curr=q.remove();
                set.add(curr);
                if(curr.left!=null && !set.contains(curr.left)) {
                    q.add(curr.left);
                    set.add(curr.left);
                    burn=true;
                }
                if(curr.right!=null && !set.contains(curr.right)) {
                    q.add(curr.right);
                    set.add(curr.right);
                    burn=true;
                }
                Node parent=map.get(curr);
                if(parent!=null && !set.contains(map.get(curr))){
                    q.add(map.get(curr));
                    set.add(map.get(curr));
                    burn=true;
                }
            }
           if(burn) time++;
        }
    }
    public int minTime(Node root, int target) {
        // code here
        // child->parent
        Node targetNode=null;
        HashMap<Node,Node>map=new HashMap<>();
        Queue<Node>q=new LinkedList<>();
        if(root==null) return 0;
        q.add(root);
        while(q.size()>0){
            Node curr=q.remove();
            if(curr.data==target){
                targetNode=curr;
            }
            if(curr.left!=null){
                map.put(curr.left,curr);
                q.add(curr.left);
            }
            if(curr.right!=null){
                map.put(curr.right,curr);
                q.add(curr.right);
            }
        }
        helper(map,targetNode);
        return time;
    }
}