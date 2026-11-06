class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            map.putIfAbsent(numbers[i],i );
            if(map.containsKey(target-numbers[i])){
                res[0]=map.get(target-numbers[i])+1;
                res[1]=i+1;
            }
        }
        return res;
    }
}
