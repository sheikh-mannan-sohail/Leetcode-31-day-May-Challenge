class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        StringBuffer s = new StringBuffer(magazine);
        
        for(char c : ransomNote.toCharArray())
        {
            int pos = s.indexOf(Character.toString(c)) ;
            if( pos != -1){
                s.setCharAt(  pos,  '#');
            }
            else
                return  false;
        }
        return true;
    }
}