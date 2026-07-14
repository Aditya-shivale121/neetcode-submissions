class Solution {
    public boolean isPalindrome(String s) {
      StringBuilder st = new StringBuilder();  
      for(char ch : s.toCharArray()){
        if(Character.isLetterOrDigit(ch)){
            st.append(Character.toLowerCase(ch));
        }
      }

      int l = 0 , r = st.length() - 1;
        while(l<r){
            if(st.charAt(l) != st.charAt(r)) return false;
            l++;
            r --;
        }

        return true;
      
    }
}
