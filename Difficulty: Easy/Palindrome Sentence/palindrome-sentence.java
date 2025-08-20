class Solution {
    public boolean isPalinSent(String s) {
        // code here
        
        String words = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i=words.length()-1; i>=0; i--) {
            
            sb.append(words.charAt(i));
            
        }
        
        String rev = sb.toString();
        if(rev.equals(words))
            return true;
        else 
            return false;
    }
}