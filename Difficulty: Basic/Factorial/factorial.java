class Solution {
    static int factorial(int n) {
        // code here
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
}