class TimeMap {
    private static class Node {
        int timestamp;
        String value;

        public Node(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    private Map<String, List<Node>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(new Node(timestamp, value));
    }

    public String get(String key, int timestamp) {
        List<Node> nodes = map.get(key);

        if (nodes == null) {
            return "";
        }

        int l = 0;
        int r = nodes.size() - 1;
        String result = "";

        while (l <= r) {
            int m = l + (r - l) / 2;

            Node node = nodes.get(m);

            if (node.timestamp == timestamp) {
                return node.value;
            } else if (node.timestamp > timestamp) {
                r = m - 1;
            } else {
                result = node.value;
                l = m + 1;
            }
        }

        return result;
    }
}
