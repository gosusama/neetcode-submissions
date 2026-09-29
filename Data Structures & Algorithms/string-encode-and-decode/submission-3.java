class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String s) {
        int n = s.length();
        int i = 0;
        List<String> result = new ArrayList<>();

        while (i < n) {
            int delim = s.indexOf('#', i);
            int len = Integer.parseInt(s.substring(i, delim));

            int start = delim + 1;
            
            result.add(s.substring(start, start + len));
            
            i = start + len;
        }

        return result;
    }
}
