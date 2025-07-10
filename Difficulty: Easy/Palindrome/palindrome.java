class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int o=n;
        int rem=0,sum=0;
        while(n>0){
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(o==sum) {
            return true;
        }
        else {
            return false;
        }
    }
}