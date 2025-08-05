class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        
        int count = 0;
        int pref[] = new int[arr.length];
        pref[0] = arr[0];
        
        for(int i=1; i<arr.length; i++){
            pref[i] = pref[i - 1] + arr[i];
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        
        for(int i=0; i<pref.length; i++){
            if(map.containsKey(pref[i] - k)){
                
                count = count + map.get(pref[i] - k);
                
            }
            map.put(pref[i], map.getOrDefault(pref[i], 0) + 1);
        }
        return count;
    }
}