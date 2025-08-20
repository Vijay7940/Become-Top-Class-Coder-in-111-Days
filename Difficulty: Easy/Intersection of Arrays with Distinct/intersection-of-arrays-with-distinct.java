class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        
        int count=0;
        HashMap<Integer, Boolean> map = new HashMap();
        for(int x : a){
            
            map.put(x, true);
            
        }
        
        for(int t : b){
            
            if(map.containsKey(t)){
                
                count++;
                
            }
        }
        return count;
    }
}