class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer, Boolean> ht = new Hashtable<>();
        
        for (int num : nums) {
            if (ht.containsKey(num)) {
                return true;
            }
            ht.put(num, true);
        }

        return false;
    }
}