class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            
        boolean[][] visited = new  boolean[image.length][image[0].length];
        fill_new_color_using_dfs(image,sr,sc,newColor, visited);    
        return  image ;
        
    }
    
    static  void fill_new_color_using_dfs(int[][] image, int sr, int sc, int newColor,boolean[][] visited)
    {
        if(sr<0 || sc< 0 || sr>=image.length ||  sc  >= image[0].length || visited[ sr ][ sc ]) return ;
        
        int original_color = image[sr][sc];
        visited[sr][sc] = true;
        image[sr][sc] = newColor;
        
        if(sc>0 && image[sr][sc-1] == original_color){
            fill_new_color_using_dfs(image,sr,sc-1,newColor,visited);
        }
        
        if(sc< image[0].length-1 && image[sr][sc+1] == original_color){
            fill_new_color_using_dfs(image,sr,sc+1,newColor,visited);
        }
        
        if(sr> 0 && image[sr-1][sc] == original_color){
            fill_new_color_using_dfs(image,sr-1,sc,newColor,visited);
        }
        
        if(sr < image.length -1  && image[sr+1][sc] == original_color){
            fill_new_color_using_dfs(image,sr+1,sc,newColor,visited);
        }        
        
    }
    
}