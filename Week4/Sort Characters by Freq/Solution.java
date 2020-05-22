import java.util.Comparator;
class KeyCom implements Comparator<FreqMap>
{
    @Override
    public int compare(FreqMap p,FreqMap q){
        return q.freq -  p.freq;
    }   
}

class FreqMap {
    
    char c;
    int  freq;
    

    
    FreqMap(char c , int freq){
        this.c = c;
        this.freq  = freq;
    }
    
}

class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> m = new HashMap<Character,Integer>();
        
        for(char c : s.toCharArray()){
            m.put(c , m.getOrDefault(c,0) + 1 );
        }
           
        PriorityQueue<FreqMap> pq = new PriorityQueue<FreqMap>(new  KeyCom() );
        
        for(char c : m.keySet()){
            pq.add( new  FreqMap(c, m.get(c) )  );
        }
        StringBuilder res = new StringBuilder();
        while(pq.size()!=0){
            FreqMap t = pq.poll();
            for(int i=0;i<t.freq    ; i++)res.append( t.c);
        }
         return   new String( res )  ;
    }
}