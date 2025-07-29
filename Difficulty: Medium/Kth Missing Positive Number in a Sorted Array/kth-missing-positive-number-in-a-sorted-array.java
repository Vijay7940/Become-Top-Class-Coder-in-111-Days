class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        
        int i = 0;       
        int count = 1;  

        while (true) {
            
            if (i < arr.length && arr[i] == count) {
                i++;
            } 
            else {
                k--;
                if (k == 0) return count;
            }
            count++;
        }
        
    }
}