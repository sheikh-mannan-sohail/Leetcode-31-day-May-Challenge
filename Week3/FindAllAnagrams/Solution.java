class Solution {
    public List<Integer> findAnagrams(String s, String p) {
     
        List<Integer> index = new ArrayList<Integer>();
        
        if(s.length() == 0)    return  index;
        
        
        HashMap<Character,Integer> map_s = new  HashMap<Character,Integer>();        
        HashMap<Character,Integer> map_p = new  HashMap<Character,Integer>();
        
        for(Character c : p.toCharArray()){
            map_p.put(c,map_p.getOrDefault(c,0) + 1);
            
        }
        
        int i;
        
        for( i = 0;i  < s.length();i++){
            
            if(i<p.length()){
                map_s.put(s.charAt(i), 1 + map_s.getOrDefault(s.charAt(i),0));
                continue;
            }
            if(check_if_anagram(map_p, map_s)){  
                index.add(i -  p.length());
            }  
            
            Character prev_win_char = s.charAt(i-p.length());
            map_s.put( prev_win_char ,map_s.get(prev_win_char) - 1);
            
            if(map_s.get(prev_win_char) == 0)map_s.remove(prev_win_char);
            
            map_s.put(s.charAt(i),1 + map_s.getOrDefault(s.charAt(i), 0 ));     
        }
        
        if(check_if_anagram(map_p,map_s))index.add(i-p.length());
        
        
        return  index;
    }

    static boolean  check_if_anagram(Map p,Map s){
        return p.equals(s);
        
    }    
}
