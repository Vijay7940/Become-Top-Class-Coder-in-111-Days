class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        
        int max2 = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max2 && arr[i]<max){ //arr[i] must be > max2 &&
                max2=arr[i];               //arr[i] must be < max
            }
        }
        
        if(max2 == Integer.MIN_VALUE) return -1;
        else return max2;
    }
}