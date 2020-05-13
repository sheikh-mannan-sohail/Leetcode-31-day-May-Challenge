class Solution {
    public String removeKdigits(String num, int k) {
        
        StringBuilder sb = new StringBuilder();
        Stack<Character> s = new Stack<Character> ();
        
        int i;
        
        for( i = 0;i<num.length() && k>0;i++){
            
            if(s.isEmpty()){
                s.add(num.charAt(i));
                continue;
            } 
            else
            {                    
                if(num.charAt(i) >= s.peek())s.add(num.charAt(i));
                else{
                    while(!s.isEmpty() && k >0  && s.peek()>num.charAt(i))
                    {    
                        k = k -  1;
                        s.pop();
                    
                    }
                    s.add(num.charAt(i));
                }
            }
            
        }
        while(k > 0 && !s.isEmpty()){
            s.pop();
            k--;
        }
        
        while(!s.isEmpty())
        {
            sb.append(s.pop());
        }

        sb = sb.reverse();
        
        for(;i<num.length();i++)sb.append(num.charAt (i));
        
        for(i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)!='0')break;
        }
        sb.delete(0,i);
        if(sb.length() == 0)sb.append(0);
        
        
        return  new String(sb);
        
    }
}