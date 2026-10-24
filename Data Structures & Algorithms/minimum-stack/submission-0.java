class MinStack {
    List<Integer> stack;

    public MinStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
    }
    
    public void pop() {
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
        return stack.getLast();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;

        for (Integer i : stack) {
            if (i < min) {
                min = i;
            }
        }

        return min;
    }
}
