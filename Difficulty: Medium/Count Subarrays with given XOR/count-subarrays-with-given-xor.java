class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int count = 0, xor = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        for(int i =0; i< arr.length; i++){
            xor = xor ^ arr[i];
            int req = xor ^ k;
            if(map.containsKey(req)){
                count += map.get(req);
            }
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return count;
    }
}