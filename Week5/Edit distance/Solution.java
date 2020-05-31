class Solution {
    public int minDistance(String word1, String word2) {
        
        int dp[][] = new int[word2.length() + 1][word1.length()+1];
        
        
        for(int i = 0 ; i<word2.length()+1; i++){
            for(int j = 0;j<word1.length()+1;j++){
                
                if(j == 0){
                    dp[i][j] = i;
                    
                    continue;
                }
                
                if(i == 0){
                    dp[i][j] = j;
                    continue;
                }
                
                if(word1.charAt(j-1)  ==   word2.charAt(i-1))  
                    dp[i][j] = dp[i-1][j-1];
                
                else
                {
                    
                    int min_  = Math.min(dp[i-1][j],dp[i][j-1]);
                    
                    dp[i][j] = Math.min(min_,dp[i-1][j-1]) + 1;
                }
                
                
            }
        }
        
        // System.out.println( Arrays.deepToString(dp)) ;
        
        return dp [word2.length()][word1.length()];
        
        
    }
}