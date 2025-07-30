class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        
        if(s1.length() != s2.length()) return false;
        int arr[] = new int[26];
        
        for(int i=0; i<s1.length(); i++){
            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;
        }
        
        for(int j=0; j<26; j++){
            if(arr[j] != 0) return false;
        }
        return true;
        
    }
}