class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String ch : tokens){
            if(Character.isDigit(ch.charAt(ch.length() - 1))){
                st.push(Integer.parseInt(ch));
            }else{
                int a = (st.pop());
                int b = (st.pop());

                if(ch.equals("+")) st.push(a+b);
                else if(ch.equals("*")) st.push(a*b);
                else if(ch.equals("/")) st.push(b/a);
                else if(ch.equals("-")) st.push(b-a);
            }
        }

        return st.pop();
        
    }
}
