class Solution {
    public int findJudge(int N, int[][] trust) {
     
        Map<Integer,Integer> people_who_trust_me = new HashMap<Integer, Integer>();
        Map<Integer,Integer> people_whom_i_trust = new HashMap<Integer, Integer>();
        
        for(int i=0;i<trust.length;i++){
            people_who_trust_me.put(trust[i][1] , 1 + people_who_trust_me.getOrDefault(trust[i][1],0));
            people_whom_i_trust.put(trust[i][0], 1 + people_whom_i_trust.getOrDefault(trust[i][0],0));
        }
        
        
        for(int i = 1; i<=N;i++){
            if(people_who_trust_me.getOrDefault(i,0) == N-1 && !people_whom_i_trust.containsKey(i) ){
                return i;
            }
        }
        return -1;
    }
}