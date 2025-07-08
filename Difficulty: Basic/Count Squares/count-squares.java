// User function Template for Java

class Solution {
    static int countSquares(int n) {
        // code here
        int count=0;
        for(int i=1;i<n;i++){
            if(i*i<n){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}