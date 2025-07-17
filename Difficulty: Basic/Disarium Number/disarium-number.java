// User function Template for Java

class Solution {
    static int isDisarium(int N) {
        int c=0,rem=0,sum=0;
        int temp=N;
        int org=N;
        while(temp>0){
            temp=temp/10;
            c++;
        }
        // code here
        while(N>0){
            for(int i=c;i>=1;i--){
                rem=N%10;
                sum=sum+(int)Math.pow(rem,i);
                N=N/10;
            }
        }
        return (sum==org) ? 1 : 0;
    }
};