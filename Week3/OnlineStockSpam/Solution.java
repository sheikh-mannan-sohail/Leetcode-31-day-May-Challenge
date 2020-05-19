class StockSpanner {
    
    Stack<Integer> s;
    List<Integer> nums = new ArrayList<Integer>();
    
    public StockSpanner() {
        s = new Stack<Integer>();
    }
    
    public int next(int price) {
        
        nums.add(price);
        while(!s.empty() && nums.get(s.peek())<=price)
        {
             s.pop();
        }
        
        int x = -1;
        if(!s.empty())x = s.peek();
        
        s.push(nums.size() - 1);
        
        return x == -1 ? nums.size() : nums.size() - x - 1  ;

    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */