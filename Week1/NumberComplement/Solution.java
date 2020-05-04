class Solution {
    public int findComplement(int num) {
        
        if(num == 0) return 1;
            
        int count = 0, bit_mask = 0;
        int input = num; 
        
        while(input!=0)
        {
            input = input /2 ;
            bit_mask = (int)(bit_mask + Math.pow(2,count));
            count++;   
        }
        
        int res = num ^ bit_mask;
        
        
        return  res;
    }
}