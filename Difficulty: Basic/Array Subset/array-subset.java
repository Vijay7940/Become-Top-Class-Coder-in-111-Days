
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        
       HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int val : a) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        
        for (int val : b) {
            if (!map.containsKey(val) || map.get(val) == 0) {
                return false;
            }
            map.put(val, map.get(val) - 1);
        }
        
        return true;
    }
}
