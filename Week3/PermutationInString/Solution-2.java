class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int[] map = new int[26];
        
        for( Character c : s1.toCharArray() )map[c-'a']++;
        
        int l = 0, r = 0;    
        int count = 0 ;
        
        while(r<s2.length()){
            if(map[s2.charAt(r) - 'a'] >= 1){
                count++;
            }
            map[s2.charAt(r) - 'a']--;
            if(count==s1.length())return true;
        
            r++; 
            if(r - l == s1.length()){
                if(map[s2.charAt(l)  -  'a'] >= 0) count--;
                
                map[s2.charAt(l)-'a'] ++ ;
                l++;
            }
            
        }
        
        return false;
    }
}