class Solution {
    public int firstUniqChar(String s) {
        
        Set<Character> visited = new HashSet< Character >();
        
       for(int i = 0 ; i<s.length() ;i++){
           
           if(!visited.contains(s.charAt(i))  && s.indexOf(s.charAt(i), i + 1) == -1 )return i ;
           else
               visited.add(s.charAt(i)) ;
       }
        
        
        return -1;
    }
}