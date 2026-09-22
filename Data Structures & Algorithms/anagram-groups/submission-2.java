class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> anagrams = new HashMap<>();

        for (String s : strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String strSorted = new String(charArr);

            anagrams.putIfAbsent(strSorted, new ArrayList<>());
            anagrams.get(strSorted).add(s);
        }

        return new ArrayList<>(anagrams.values());
    }
}
