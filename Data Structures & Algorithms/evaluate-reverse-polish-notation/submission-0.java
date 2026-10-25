class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        int[] stack = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            if (tokens[i].equals("+")) {
                stack[top - 1] += stack[top--];
            } else if (tokens[i].equals("-")) {
                stack[top - 1] -= stack[top--];
            } else if (tokens[i].equals("*")) {
                stack[top - 1] *= stack[top--];
            } else if (tokens[i].equals("/")) {
                stack[top - 1] /= stack[top--];
            } else {
                stack[++top] = Integer.parseInt(tokens[i]);
            }
        }

        return stack[0];
    }
}
