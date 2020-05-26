class Solution {
    public int findMaxLength(int[] nums) {
     
        int n = nums.length;
        int res = 0;
        HashMap<Integer, Integer> m = new HashMap<Integer,Integer>();
        int c = 0;
        m.put(0,-1);
        for(int i=0;i<n;i++){
            if( nums[i] == 0 ) c-=1;
            else
                c+=1;
            if(m.containsKey(c)){
                res = Integer.max(res,i - m.get(c) );
            }
            else{m.put(c,i);}
            
        }
        
        return res;
    }
}