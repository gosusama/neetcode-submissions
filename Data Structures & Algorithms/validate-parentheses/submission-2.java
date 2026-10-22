class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        char[] closeParentheses = new char[n];

        int count = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            switch (c) {
                case '{' -> closeParentheses[count++] = '}';
                case '[' -> closeParentheses[count++] = ']';
                case '(' -> closeParentheses[count++] = ')';

                case '}' -> {
                    if (count == 0 || closeParentheses[--count] != '}')
                        return false;
                }
                case ']' -> {
                    if (count == 0 || closeParentheses[--count] != ']')
                        return false;
                }
                case ')' -> {
                    if (count == 0 || closeParentheses[--count] != ')')
                        return false;
                }
            }
        }

        return count == 0;
    }
}
