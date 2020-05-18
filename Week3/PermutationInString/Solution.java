class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() == 0)return false;
        
        HashMap<Character,Integer> s1_map = new HashMap<Character,Integer>();
        HashMap<Character,Integer> s2_map = new HashMap<Character,Integer>();
        
        for(Character c:s1.toCharArray())
        {
            s1_map.put(c,s1_map.getOrDefault(c,0)+1);
        }
        
        for(int i=0;i<s2.length();i++){
            if(i<s1.length())
            {
                s2_map.put(s2.charAt(i),s2_map.getOrDefault (s2.charAt(i), 0) + 1);
                continue;
            }
            
            if(check_if_anagram(s1_map ,s2_map))return true;
            
            char remove = s2.charAt(i-s1.length());
            s2_map.put (remove,s2_map.get(remove) - 1);
            if(s2_map.get(remove)==0)s2_map.remove(remove);
            
            s2_map.put(s2.charAt(i), s2_map.getOrDefault(s2.charAt(i),0)+1);
        }
        
        return check_if_anagram(s1_map,s2_map) ? true : false;
        
    }
    
    static boolean check_if_anagram(Map s1,Map s2){
        return s1.equals(s2);
    }
    
}