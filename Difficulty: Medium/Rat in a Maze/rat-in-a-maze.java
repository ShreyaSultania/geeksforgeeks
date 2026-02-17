class Solution {
    void helper(int r,int c,ArrayList<String>ans,int[][] maze,String temp,boolean[][] visited){
        int row=maze.length;
        int col=maze[0].length;
        if(r>=row || c>=col ||c<0 || r<0 || maze[r][c]==0 || visited[r][c]) return;
        if(r==row-1 && c==col-1){
            // Collections.reverse()
            ans.add(temp);
            return;
        }
        visited[r][c]=true;
        helper(r+1,c,ans,maze,temp+"D",visited);
        helper(r-1,c,ans,maze,temp+"U",visited);
        helper(r,c+1,ans,maze,temp+"R",visited);
        helper(r,c-1,ans,maze,temp+"L",visited);
        visited[r][c]=false;
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
         int row=maze.length;
        int col=maze[0].length;
        ArrayList<String>ans=new ArrayList<>();
        boolean[][] visited=new boolean[row][col];
        helper(0,0,ans,maze,"",visited);
        Collections.sort(ans);
        
        return ans;
    }
}