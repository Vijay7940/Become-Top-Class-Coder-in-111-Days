class Solution {
    public int lenOfLongIncSubArr(List<Integer> arr) {
        
        int n = arr.size();
        if (n == 0) return 0;

        int len = 1, max_len = 1;

        for (int i=1; i<n; i++) {
            
            if (arr.get(i) > arr.get(i - 1)) {
                len++;
                max_len = Math.max(max_len, len);
            } 
            else {
                len = 1;
            }
        }

        return max_len;
    }
}
