class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int freq[] = new int[26];
        for(char ch :s1.toCharArray()){
            freq[ch -'a']++;
        }

        int l = 0 ;
        int count = s1.length();
        for(int r = 0 ; r < s2.length() ; r++){
             
             freq[s2.charAt(r) -'a']--;
             if(freq[s2.charAt(r)-'a'] >= 0) count --;

             while(r-l+1 == s1.length() ){
                if( count == 0  ){
                   return true;
                }

                freq[s2.charAt(l) -'a']++; 
                if(freq[s2.charAt(l) -'a'] > 0) count ++; 
                l++;
             }
        }
        
        return false;
    }
}
