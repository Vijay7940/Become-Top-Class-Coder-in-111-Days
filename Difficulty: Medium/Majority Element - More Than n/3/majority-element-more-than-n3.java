class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        
        int n = arr.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0) +1);
        }
        
        ArrayList<Integer> vote = new ArrayList();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n/3) {
                vote.add(entry.getKey());
            }
        }
        Collections.sort(vote);
        return vote;
    }
}