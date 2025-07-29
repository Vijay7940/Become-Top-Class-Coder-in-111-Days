class Solution {
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int s=1, e= 1;
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(s == 0) s=1;
            if(e == 0) e=1;
            s *= arr[i];  //start
            e *= arr[n-i-1];  //end
            ans = Math.max(ans, Math.max(s, e));
        }
    
        return ans;
    }
}