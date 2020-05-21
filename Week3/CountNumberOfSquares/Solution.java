class Solution {

    public int countSquares(int[][] matrix) {
        if(matrix.length == 0)return 0;
        int visited[][] = new int[matrix.length][matrix[0].length ];
        int res = 0;
        for(int i=0;i<matrix.length; i++){
            for(int j=0;j<matrix[0].length;j++)
            {
                res+=traverse(matrix,visited, i,j);
            }
        }
        return res;
    }
    
    static int traverse(int[][]  matrix,int[][]  visited,int i,int j){
        
        
        if(i<0 || j<0 ||  i>=matrix.length ||  j>=matrix[0].length || matrix[i][j] == 0)return 0;
        if(visited[i][j]!=0)return visited[i][j];
        
        
        int down = traverse(matrix,visited,i+1,j);
        int right =  traverse(matrix,visited,i,j+1);
        int bottom =  traverse(matrix,visited,i+1,j+1 ) ;
        
        visited[i][j] = 1 +  Integer.min(Integer.min(down, right),bottom );
        
        return visited[i][j];
    }
}