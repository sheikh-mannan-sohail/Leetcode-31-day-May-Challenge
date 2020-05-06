class Solution {
    public int majorityElement(int[] nums) {
        
        if(nums.length == 0)return 0;
        
        int item  = nums[0]  ;
        int count = 1;
        
        for(int i = 1 ; i<nums.length; i++)
        {
            if(nums[i]  == item)count++;
            else{
                if(--count == 0){
                    count = 1 ; 
                    item =  nums[i]; 
                }
            }
        }
        
        return item;
        
    }
}