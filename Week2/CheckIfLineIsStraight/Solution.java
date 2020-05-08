class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        
        int m = 1;
        if( coordinates[1][0] - coordinates[0][0] != 0)
         m = (coordinates[1][1] - coordinates[0][1] )/ (coordinates[1][0] - coordinates[0][0]);
        else
        {
            for(int i = 0;i<coordinates.length - 1; i++){
                
                if(coordinates[i][0] != coordinates[i+1][0])return false;
                
            }
            return true ; 
        }
        int c = coordinates[0][1] - m * coordinates[0] [0] ;
        
        for(int i = 3 ; i<coordinates.length ;i++){
            
            if(coordinates[i][1] != (m*coordinates[i][0] + c)) return false;
            
        }
        
        return true;
    }
}