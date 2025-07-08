// User function Template for Java

class Solution {
    static boolean isLeap(int N) {
        // code here
        if(N%100==0 && N%400==0) //century year
            return true;
        else if(N%100!=0 && N%4==0) //normal year
            return true;
        else 
            return false;
    }
}