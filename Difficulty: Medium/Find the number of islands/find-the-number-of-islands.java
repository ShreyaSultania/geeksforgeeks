class Solution {
    void dfs(char[][]grid,int row,int col,int i,int j){
        if(i==row || j==col || i<0 || j<0 ||grid[i][j]=='W'){
            return;
        }
        grid[i][j]='W';
        dfs(grid,row,col,i,j+1);
        dfs(grid,row,col,i-1,j);
          dfs(grid,row,col,i,j-1);
           dfs(grid,row,col,i+1,j);
            dfs(grid,row,col,i-1,j-1);
             dfs(grid,row,col,i+1,j-1); 
             dfs(grid,row,col,i-1,j+1);
              dfs(grid,row,col,i+1,j+1);
    }
    public int countIslands(char[][] grid) {
        // Code here
        int row=grid.length;
        int col=grid[0].length;
        int ans=0;
      for(int i=0;i<row;i++){
          for(int j=0;j<col;j++){
              if(grid[i][j]=='L'){
                  dfs(grid,row,col,i,j);
                  ans++;
              }
          }
      } 
      return ans;
    }
}