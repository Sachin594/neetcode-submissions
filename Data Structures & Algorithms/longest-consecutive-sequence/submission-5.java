public class Solution{
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxCount = 0;
        for (int i : set) {
            if (!set.contains(i - 1)) {
                int count = 1;
                int curr = i;
                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
}