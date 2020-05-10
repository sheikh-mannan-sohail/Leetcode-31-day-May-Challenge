
class Trust{
    
    int count_of_people_who_trust_me;
    int count_of_people_whom_i_trust; 
    
    Trust(){
        count_of_people_who_trust_me =  count_of_people_whom_i_trust= 0;
    }
    
}

class Solution {
    public int findJudge(int N, int[][] trust) {
     
        Trust[] trust_arr = new Trust [N];
        
        for(int i=0;i<N;i++){
            trust_arr[i] = new Trust();
        }
        
        
        for(int i=0;i< trust.length;i++){
            trust_arr[trust[i][0] - 1].count_of_people_whom_i_trust +=1;
            trust_arr[trust[i][1] - 1].count_of_people_who_trust_me +=1;
        }
        for(int i=0;i<N;i++){
            if(trust_arr[i].count_of_people_who_trust_me == N-1 &&  trust_arr[i]. count_of_people_whom_i_trust == 0) return i + 1;
        }
        
        return -1;
    }
}