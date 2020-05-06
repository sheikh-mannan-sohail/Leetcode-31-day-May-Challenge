class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> m=new  HashMap<Integer,Integer>();
        
        for(int num:nums){
            m.put(num, m.getOrDefault(num,0) + 1);
        }
        
        for(int key :  m.keySet()){
            int count = m.get(key);
            if(count > nums.length / 2 ) return  key;
        }
        
        return 0;
        
    }
}