class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left = 0;
        int right = numbers.length-1;
        while (left<right){
            int val=numbers[left]+numbers[right];
            if(val == target){
                res[0]=left+1;
                res[1]=right+1;
            }
            if(val<target){
                left++;
            }
            else{
                right--;
            }
        }
        return res;
    }
}
