
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // Using Binary Search Technique   
        int l = 1, h = n;
        
        while(l<h){
            
            int m = l + (h-l)/2;
            if(isBadVersion(m)){
                h=m;
            }
            else{
                l = m + 1;
            }
        }
        return l;
    }
}