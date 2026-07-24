class Solution {
    ArrayList<String>ans;
    void dfs(int i,int j,boolean[][]visited,int[][]maze,int row,int col,String str){
        if(i<0 || j<0 ||i>=row || j>=col || maze[i][j]==0 || visited[i][j]) return;
        if(i==row-1 && j==col-1){
            ans.add(str);
            return;
        }
        visited[i][j]=true;
            dfs(i+1,j,visited,maze,row,col,str+"D");
            dfs(i,j+1,visited,maze,row,col,str+"R");
            dfs(i-1,j,visited,maze,row,col,str+"U");
            dfs(i,j-1,visited,maze,row,col,str+"L");
            visited[i][j]=false;
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ans=new ArrayList<>();
        int row=maze.length;
        int col=maze[0].length;
        boolean[][]visited=new boolean[row][col];
        dfs(0,0,visited,maze,row,col,"");
        Collections.sort(ans);
        return ans;
    }
}