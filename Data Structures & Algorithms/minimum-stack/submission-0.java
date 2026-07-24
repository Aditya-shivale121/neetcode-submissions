class MinStack {
    
    Stack<Integer>main;
    Stack<Integer>min;

    public MinStack() {
        main = new Stack<>();
        min = new Stack<>();

    }
    
    public void push(int val) {
        main.push(val);

        if(min.isEmpty() || val <= min.peek()){
           min.push(val);
        }
        
    }
    
    public void pop() {
       int curr = main.pop();  
       if (curr <= min.peek()) min.pop();
    }
    
    public int top() {
      return main.peek();
    }
    
    public int getMin() {
        return min.peek();
        
    }
}
