class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        
        List<List> res = new ArrayList<>();
        int i = 0 , j=0;
        
        while(i<A.length && j<B.length){
            if(do_intersect(A[i],B[j]))
            {   
                List<Integer> t = new  ArrayList<Integer>();
                t.add(Integer.max(A[i][0], B[j][0]));
                t.add(Integer.min(A[i] [1],B[j] [1]));
                
                res.add(new  ArrayList(t) ) ;
            }
            if(A[i][1] >= B[j][1]) j++;
            else
                i++;
        }
        int[][] ret = new int [res.size()][2];
        for(i=0;i<res.size();i++){
            
            ret[i][0] = (int)res.get(i).get(0);
            ret[i][1] = (int)res.get(i).get(1);
        }
        return ret;
    }
    
    static boolean do_intersect(int[] A,int[] B){
        int x = Integer.max(A[0],B[0]);
        int y = Integer.min(A[1],B[1]);
        
        if(x <= y)return true;
        return false;
    }
}