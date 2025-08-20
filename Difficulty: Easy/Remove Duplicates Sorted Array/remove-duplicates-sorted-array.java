class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        
        ArrayList<Integer> list = new ArrayList();
        HashMap<Integer, Integer> map = new HashMap();
        
        for(int v : arr){
            
            if(!map.containsKey(v)){
                
                list.add(v);
                
            }
            map.put(v, map.getOrDefault(v, 0) + 1);
        }
        return list;
    }
}
