class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            if (isStrInSublists(strs[i], result)) {
                continue;
            }

            result.add(new ArrayList<>(List.of(strs[i])));
        }

        return result;
    }

    private boolean isStrInSublists(String s, List<List<String>> result) {
        for (List<String> item : result) {
            if (isAnagram(s, item.getFirst())) {
                item.add(s);
                return true;
            }
        }

        return false;
    }

    private boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }

        int[] charCounts = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            charCounts[s1.charAt(i) - 'a']++;
            charCounts[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (charCounts[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
