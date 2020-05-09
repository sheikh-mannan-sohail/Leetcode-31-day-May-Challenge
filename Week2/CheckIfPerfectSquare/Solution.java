class Solution {
    public boolean isPerfectSquare(int num) {
     
        int i;
        for(i=1;i<=Math.pow(num,0.5); i++){
            if(i*i == num)return true;
        }
        return false ;
    }
}