public class Solution{
    public int longestConsecutive(int[] nums) {
        int len=nums.length;
        if(len==1)
            return 1;
        else if(len==0)
            return 0;
        Arrays.sort(nums);
        int maxCount = 1;
        int count = 1;
        for(int i=0;i<len-1;i++){
            if(nums[i+1]-1==nums[i]){
                count++;
            }
            else if(nums[i+1]!=nums[i]) {
                count=1;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}