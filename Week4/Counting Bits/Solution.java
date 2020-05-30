class Solution {
    public int[] countBits(int num) {
        
        if(num == 0) return new int[]{0};
        if(num == 1)return new int[]{0,1};
        
        int[] res = new int[num + 1];
        
        res[0] = 0;
        res[1] = 1;
        
        for(int power=1; ; power++){
            
            int r_start =(int) Math.pow(2,power);
            int r_end =  (int) Math.pow(2,power+1);
            int i ;

            for(i = r_start;i<r_end && i<=num;i++)

            {
                res[i] = 1  +  res[ i -  r_start];
            }
            if(i>num)break;
        }
        
        return res;
    }
 }