class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] freq = new int[2001];
        int maxFreq = 0;
        
        for (int num : nums) {
            int idx = num + 1000;
            freq[idx]++;
            if (freq[idx] > maxFreq) {
                maxFreq = freq[idx];
            }
        }

        List[] buckets = new List[maxFreq + 1];
        for (int i = 0; i < 2001; i++) {
            if (freq[i] > 0) {
                int currentFreq = freq[i];
                
                if (buckets[currentFreq] == null) {
                    buckets[currentFreq] = new ArrayList<>();
                }

                buckets[currentFreq].add(i - 1000);
            }
        }

        int[] result = new int[k];
        int c = 0;

        for (int i = maxFreq; i > -1; i--) {
            if (buckets[i] != null) {
                for (Object obj : buckets[i]) {
                    result[c++] = (int) obj;
                    if (c == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
