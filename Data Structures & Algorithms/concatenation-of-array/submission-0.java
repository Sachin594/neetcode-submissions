class Solution {
    public int[] getConcatenation(int[] nums) {
        int resLen = 2 * nums.length;
        int[] res = new int[resLen];
        for (int i = 0; i < resLen; i++) {
            int j = i;
            if (i > nums.length - 1) {
                j = Math.abs(i - nums.length);
            }
            System.out.println("i: " + i + " j: " + j);
            res[i] = nums[j];
        }
        return res;
    }
}