class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        char[] closeParentheses = new char[n];

        int count = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == '(') {
                closeParentheses[count++] = ')';
            } else if (c == '{') {
                closeParentheses[count++] = '}';
            } else if (c == '[') {
                closeParentheses[count++] = ']';
            } else {
                if (count == 0 || closeParentheses[--count] != c) {
                    return false;
                }
            }
        }

        return count == 0;
    }
}
