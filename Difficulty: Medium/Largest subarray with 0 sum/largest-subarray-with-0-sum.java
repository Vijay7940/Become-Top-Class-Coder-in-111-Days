class Solution {
    int maxLength(int arr[]) {
        // code here
        
        int pref[] = new int[arr.length];
	    int max_length = 0;
	    pref[0] = arr[0];
	    HashMap<Integer, Integer> map = new HashMap<>();
	    map.put(pref[0], 0);
	    
	    if(pref[0] == 0){
	       max_length = 1;
	    }
	    for(int i=1; i<pref.length; i++){
	        pref[i] = pref[i - 1] + arr[i];
	        if(pref[i] == 0){
	            max_length = i + 1; 
	        }
	        if(map.containsKey(pref[i])){
	            max_length = Math.max(max_length, i - map.get(pref[i]));
	        }
	        else{
	            map.put(pref[i], i);
	        }
	    }
	    return max_length;
    }
}