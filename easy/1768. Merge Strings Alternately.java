class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len  = Math.max(word1.length() , word2.length());
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<len; i++){
            if (word1.length() > i) sb.append(word1.charAt(i));
            if (word2.length() > i) sb.append(word2.charAt(i));
        }
        return sb.toString();
    }
}
