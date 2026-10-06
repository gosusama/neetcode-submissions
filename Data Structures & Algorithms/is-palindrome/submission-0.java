class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        String lower = s.toLowerCase();

        while (l < r) {
            char cl = lower.charAt(l);
            char cr = lower.charAt(r);

            if (isAlphanumeric(cl) == true) {
                if (isAlphanumeric(cr) == true) {
                    if (cl != cr) {
                        return false;
                    }
                    l++;
                    r--;
                } else {
                    r--;
                    continue;
                }
            } else {
                l++;
            }
        }

        return true;
    }

    public boolean isAlphanumeric(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
